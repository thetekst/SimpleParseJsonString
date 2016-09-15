package thetekst.app;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.List;

public class Main {
	public final static String ONE_CAR = "{\"brand\": \"opel\", \"year\": 2000}";
	public final static String MANY_CARS = "[{\"brand\":\"opel\", \"year\": 2000},{\"brand\":\"mazda\", \"year\": 2005}]";

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationConfig.Feature.AUTO_DETECT_FIELDS, true);

		try {
//			Example 1: As Object
			Car oneCar = mapper.readValue(ONE_CAR, Car.class);
			System.out.println(oneCar.toString());

//			Example 2: As Array
			Car[] myArray = mapper.readValue(MANY_CARS, Car[].class);
			System.out.println(myArray.length);
			for (Car car: myArray) {
				System.out.println(car.toString());
			}

//			Example 3: As List
			List<Car> myList = mapper.readValue(MANY_CARS, new TypeReference<List<Car>>(){});
			System.out.println(myList.size());
			for (Car car: myList) {
				System.out.println(car.toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
