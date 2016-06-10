package carSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Car> usedCars = new ArrayList<Car>();
		Car car1;
		Car car2;
		Car car3;
		Car car4;
		Car car5;
		Car car6;
		Car car7;
		Car car8;
		Car car9;
		Car car10;
		car1 = new Car(1, "Ford", "Fiesta", 4000, 2005, 1000);
		car2 = new Car(2, "Nissan", "Altima", 10000, 2015, 1200);
		car3 = new Car(3, "GMC", "Sub Urban", 15000, 2008, 1500);
		car4 = new Car(4, "Tayota", "Innova", 10000, 2010, 800);
		car5 = new Car(5, "Honda", "Civic", 10000, 2012, 800);
		car6 = new Car(6, "Ford", "Explorer", 13000, 2015, 1500);
		car7 = new Car(7, "Nissan", "GTR", 20000, 2009, 3200);
		car8 = new Car(8, "GMC", "Endevour", 12000, 2015, 1500);
		car9 = new Car(9, "Tayota", "Innova", 2000, 2015, 500);
		car10 = new Car(10, "Honda", "Accord", 10000, 2015, 1200);
		usedCars.add(car1);
		usedCars.add(car2);
		usedCars.add(car3);
		usedCars.add(car4);
		usedCars.add(car5);
		usedCars.add(car6);
		usedCars.add(car7);
		usedCars.add(car8);
		usedCars.add(car9);
		usedCars.add(car10);

		System.out.println("---------------------- Sorted by natural order  -----------------------");
		Collections.sort(usedCars, Comparator.naturalOrder());
		printCars(usedCars);
		System.out.println("---------------------- Sorted by reverse order -----------------------");
		Collections.sort(usedCars, Comparator.reverseOrder());
		printCars(usedCars);
		System.out.println("---------------------- Sorted by id -----------------------");
		Collections.sort(usedCars, Comparator.comparing(Car::getCarId));
		printCars(usedCars);
		System.out.println("---------------------- Sorted by id reverse order -----------------------");
		Collections.sort(usedCars, (Car o1, Car o2) -> {
			return o2.getCarId() - o1.getCarId();
		});
		printCars(usedCars);
		System.out.println("---------------------- Sorted by price -----------------------");
		Collections.sort(usedCars, (Car o1, Car o2) -> {
			return o1.getPrice() - o2.getPrice();
		});
		printCars(usedCars);
		System.out.println("---------------------- Sorted by mileage -----------------------");
		Collections.sort(usedCars, (Car o1, Car o2) -> {
			return o1.getMileage() - o2.getMileage();
		});
		printCars(usedCars);
		System.out.println("---------------------- Sorted by year -----------------------");
		Collections.sort(usedCars, (Car o1, Car o2) -> {
			return o1.getYear() - o2.getYear();
		});
		printCars(usedCars);
		System.out.println("---------------------- Sorted by pareto -----------------------");
		DominationCount.updateDominationCount(usedCars);
		Collections.sort(usedCars, (Car o1, Car o2) -> {
			return o1.getDominationCount() - o2.getDominationCount();
		});
		printCars(usedCars);

	}

	public static void printCars(ArrayList<Car> cars) {

		for (Car car : cars) {
			System.out.println("Car [carId=" + car.getCarId() + ", make=" + car.getMake() + ", model=" + car.getModel() + ", price=" + car.getPrice()
					+ ", year=" + car.getYear() + ", mileage=" + car.getMileage() + ", dominationCount=" + car.getDominationCount() + "]");
		}

	}

}
