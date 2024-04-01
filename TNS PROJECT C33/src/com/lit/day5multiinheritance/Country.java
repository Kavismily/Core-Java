package com.lit.day5multiinheritance;

public class Country {
	private String Countryname;
	private String Captital;
	//contructor
	
	public Country(String countryname, String captital) {
		super();
		this.Countryname = countryname;
		this.Captital = captital;
	}

     public Country() {
 System.out.println("hlo");
 }
	// getter setter

	public String getCountryname() {
		return Countryname;
	}

	public void setCountryname(String countryname) {
		Countryname = countryname;
	}

	public String getCaptital() {
		return Captital;
	}

	public void setCaptital(String captital) {
		Captital = captital;
	}
     //to String

	@Override
	public String toString() {
		return "Country [Countryname=" + Countryname + ", Captital=" + Captital + "]";
	}
	
	

}
