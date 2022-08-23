package javasessions;

import java.util.ArrayList;

public class CallTestConstructor {

	public static void main(String[] args) {
		
		TestConstructor comp1=new TestConstructor("lendingkart");
		System.out.println(comp1.companyName+" "+comp1.numofEmployees+" "+comp1.sharePrice+" "+comp1.locations);
		comp1.numofEmployees=2000;
		System.out.println(comp1.companyName+" "+comp1.numofEmployees+" "+comp1.sharePrice+" "+comp1.locations);
		
		TestConstructor comp2=new TestConstructor("Nykaa",5000,250);
		System.out.println(comp2.companyName+" "+comp2.numofEmployees+" "+comp2.sharePrice+" "+comp2.locations);
		
		ArrayList<String> location=new ArrayList<String>();
		location.add("mumbai");
		location.add("delhi");
		TestConstructor comp3= new TestConstructor("SugarCosmetics",7000,300,location);
		System.out.println(comp3.companyName+" "+comp3.numofEmployees+" "+comp3.sharePrice+" "+comp3.locations);
		comp3.locations.add("bangalore");
		System.out.println(comp3.companyName+" "+comp3.numofEmployees+" "+comp3.sharePrice+" "+comp3.locations);
		
	}

}
