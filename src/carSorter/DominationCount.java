package carSorter;

import java.util.ArrayList;

public class DominationCount {
	
	
	public static void updateDominationCount(ArrayList<Car> usedCars) {
		for(Car o1:usedCars){
			for(Car o2:usedCars){
				setDominationCount(o1,o2);	
			}
		}
	}
	
	private static void setDominationCount(Car o1,Car o2){
		Boolean case1 = false;
		Boolean case2 = false;
		if((o1.getPrice()<=o2.getPrice())&&(o1.getYear()>=o2.getYear())&&(o1.getMileage()<=o2.getMileage())){
			case1 = true;
		}
		if((o1.getPrice()<o2.getPrice())||(o1.getYear()>o2.getYear())||(o1.getMileage()<o2.getMileage())){
			case2 = true;
		}
		if(case1&&case2){
			o2.incrementDominationCount();
		}
		
	}

}
