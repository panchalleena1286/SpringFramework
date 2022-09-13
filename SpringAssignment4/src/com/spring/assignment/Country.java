package com.spring.assignment;

public class Country {
	
	String countryId;
	String countryName;
	
	public Country() {
		
	}

	public Country(String countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country Id = " + countryId + ", Country Name = " + countryName;
	}
	
	
	

}

