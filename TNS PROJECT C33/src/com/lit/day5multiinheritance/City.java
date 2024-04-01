package com.lit.day5multiinheritance;

public class City extends State 
{
	private String Cityname;
	private String Area;
	//constructor
	public City() {
		super();
	}
	public City(String countryname, String captital, String Statename, String Language,String Cityname,String Area) {
		super(countryname, captital, Statename, Language);
		this.Cityname=Cityname;
		this.Area=Area;
		
	}
	//getter setter
	public String getCityname() {
		return Cityname;
	}
	public void setCityname(String cityname) {
		Cityname = cityname;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "City [Cityname=" + Cityname + ", Area=" + Area + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + ", getCountryname()=" + getCountryname() + ", getCaptital()="
				+ getCaptital() + "]";
	}
	
	
	
	

}
