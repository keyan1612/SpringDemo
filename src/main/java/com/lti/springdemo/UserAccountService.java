package com.lti.springdemo;

public class UserAccountService {
private String name;
private String description;
private String details;

public UserAccountService() {
	this.name="Raj";
this.description="Account is activated for equity trading with enough funds";
this.details="PPPQ10000.0";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getDetails() {
	return details;
}

public void setDetails(String details) {
	this.details = details;
}

}
