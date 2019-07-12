package com.lti.springdemo;

import java.util.List;

public class Softwares {
	String softwareName;
	List <String>listofLang;
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public List<String> getListofLang() {
		return listofLang;
	}
	public void setListofLang(List<String> listofLang) {
		this.listofLang = listofLang;
	}
	public void printListOfLanguages()
	{
		System.out.println("Programming Languages :");
		for(String p1:listofLang)
		{
		System.out.println(p1);
		}
	}
	
}
