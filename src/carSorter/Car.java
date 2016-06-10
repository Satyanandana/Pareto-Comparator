package carSorter;

public class Car implements Comparable<Car> {
	private int carId;
	private String make;
	private String model;
	private int price;
	private int year;
	private int mileage;
	private int dominationCount = 0;
	public Car(int carId,String make, String model, int price, int year, int mileage) {
		
		this.carId = carId;
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
		this.mileage = mileage;
	}
	
	
	
	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getMileage() {
		return mileage;
	}



	public void setMileage(int mileage) {
		this.mileage = mileage;
	}



	public int getCarId() {
		return carId;
	}



	public String getMake() {
		return make;
	}



	public String getModel() {
		return model;
	}



	public int getYear() {
		return year;
	}
	
	
/*
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year
				+ ", mileage=" + mileage + ", dominationCount=" + dominationCount + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carId;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + mileage;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + year;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carId != other.carId)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (mileage != other.mileage)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (year != other.year)
			return false;
		return true;
	}*/



	@Override
	public int compareTo(Car o) {
		
		return this.getCarId() - o.getCarId();
	}



	public int getDominationCount() {
		return dominationCount;
	}



	public void incrementDominationCount() {
		this.dominationCount ++;
	}
	
}
