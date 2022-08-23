package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	public String[] empGadgetList(String empName) {
		String gadgetList[]=new String[5];
		if (empName.trim().equalsIgnoreCase("ravi"))
		{
			gadgetList[0]="macbookpro";
			gadgetList[1]="samsungnote";
		}
		else
			if (empName.trim().equalsIgnoreCase("sachin")) {
				gadgetList[0]="windows7";
				gadgetList[1]="oneplus9";
				gadgetList[2]="samsungtab";
				
			}
			else
				if(empName.trim().equalsIgnoreCase("neha")) {
					
					gadgetList[0]="macbookair";
					gadgetList[1]="oneplus7";
					gadgetList[2]="minotepro";
					gadgetList[3]="jiodongle";
				}
				else
				{
					System.out.println("Please pass correct employee name");
				}
		return gadgetList;
	}
	public ArrayList<String> returnMenuItems(String pagename) {
		ArrayList<String> menuList=new ArrayList<String>();
		if (pagename.toLowerCase().trim().equals("loginpage"))
		{
			menuList.add("userid");
			menuList.add("password");
		}
		else
			if (pagename.toLowerCase().trim().equals("homepage")) 
			{
				menuList.add("productcategory");
				menuList.add("location");
				menuList.add("offers");
				
			}
			else
				if (pagename.toLowerCase().trim().equals("productpage"))
				{
					menuList.add("productname");
					menuList.add("price");
					menuList.add("seller");
					menuList.add("info");
				}
				else
					System.out.println("pagename can't be found..");

		return menuList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app=new Application();
		ArrayList<String> menuList=app.returnMenuItems("loginpage");
		System.out.println(menuList);
		
		String gadgetList[]=app.empGadgetList("   neHa   ");
		System.out.println(Arrays.toString(gadgetList));
		System.out.println("-----------");
		for(String s:gadgetList)
		{
			System.out.println(s);
		}
	}

}
