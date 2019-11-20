package com.java.Duniya.HasARelationship.OneToOneBiDirectionalEx;

import com.java.Duniya.HasARelationship.OneToOneBiDirectionalEx.Country;
import com.java.Duniya.HasARelationship.OneToOneBiDirectionalEx.Army;

public class OneToOneBiDiTester {
	public static void main(String[] args) {
		
		//step 1
		Country country=new Country();
		country.setStates(29);
		country.setName("India");
		country.setUnionTerritories(7);
		
		
		//step 2
		
		Army army = new Army();
		
		army.setNoOfSoldiers(76000);
		army.setName("Indian Army");
		army.setType("Navy");
		
		//step 3 , runtime relation happens
		country.setArmy(army);
		army.setCountry(country);
		
		Country refOfCountry= army.getCountry();
		System.out.println(refOfCountry.getName());	
		
		Army refOfArmy = country.getArmy();
		System.out.println(refOfArmy.getName());	
	}

}
