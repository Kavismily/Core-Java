package com.lit.day5multiinheritance;

public class State extends Country
{
	
private String Statename;
private String Language;
//CONSTRUTOR
public State() {
	super();
}
public State(String countryname, String captital, String Statename,String Language) {
	super(countryname, captital);
	this.Statename=Statename;
	this.Language = Language;
	
	
}
public String getStatename() {
	return Statename;
}
public void setStatename(String statename) {
	Statename = statename;
}
public String getLanguage() {
	return Language;
}
public void setLanguage(String language) {
	Language = language;
}
@Override
public String toString() {
	return "State [Statename=" + Statename + ", Language=" + Language + ", getCountryname()=" + getCountryname()
			+ ", getCaptital()=" + getCaptital() + "]";
}


}
