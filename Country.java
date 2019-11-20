package com.java.Duniya.HasARelationship.OneToOneBiDirectionalEx;


public class Country {
	private int States;
	private String name;
	private int UnionTerritories;
	
	private Army army;

	public Country() {
	System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public int getStates() {
		return States;
	}

	public void setStates(int states) {
		States = states;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnionTerritories() {
		return UnionTerritories;
	}

	public void setUnionTerritories(int unionTerritories) {
		UnionTerritories = unionTerritories;
	}
	
	public Army getArmy() {
		return army;
	}

	public void setArmy(Army army) {
		this.army = army;
	}

	// get==read & set==write accessor's & mutator's
	

}
