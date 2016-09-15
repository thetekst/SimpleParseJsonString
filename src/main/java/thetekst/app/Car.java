package thetekst.app;

public class Car {
	private int year;
	private String brand;

	public Car() {}

	public Car(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Car{year=");
		sb.append(year);
		sb.append(", brand='");
		sb.append(brand);
		sb.append("\'}");
		return sb.toString();
	}
}
