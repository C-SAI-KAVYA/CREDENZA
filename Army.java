package com.java.Duniya.HasARelationship.OneToOneBiDirectionalEx;

public class Army {
	private int noOfSoldiers;
	private String name;
	private String type;
	
	private Country country; 
	
	public Army() {
	System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public int getNoOfSoldiers() {
		return noOfSoldiers;
	}

	public void setNoOfSoldiers(int noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


	// get==read & set==write accessor's & mutator's

}
