package javasessions;

import java.util.ArrayList;

public class TestConstructor {
	//WAF to create class objects(company details) using various constructors .
	//Will define different constructors with different arguments.

	String companyName;
	int numofEmployees;
	ArrayList<String> locations;
	int sharePrice;
	
	TestConstructor(String companyName){
		this.companyName=companyName;
	}
	
	TestConstructor(String companyName,int numodEmployees,int sharePrice){
		this.companyName=companyName;
		this.numofEmployees=numodEmployees;
		this.sharePrice=sharePrice;
		
	}
	TestConstructor(String companyName,int numodEmployees,int sharePrice,ArrayList<String> locations)
	{
		
		this.companyName=companyName;
		this.numofEmployees=numodEmployees;
		this.sharePrice=sharePrice;
		this.locations=locations;
	}
}
