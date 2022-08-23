package enumConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) {
//have to make a connection between config.properties and class
		
		Properties prop=null;
		try {
			FileInputStream ip=new FileInputStream("./src/enumConcepts/config.properties");
			//to access properties from config.properties object of Properties class is declared.
			prop=new Properties();
			prop.load(ip);
			}  catch (FileNotFoundException e) {
		
			e.printStackTrace();
		    } catch (IOException e) {
				e.printStackTrace(); 
		    }
		 
		    String brName=prop.getProperty("browser");
		    System.out.println(brName);
		    if (brName.equals("chrome"))
		    		System.out.println("Launch chrome");
		    System.out.println(prop.getProperty("url"));
		    if (Boolean.parseBoolean(prop.getProperty("headless")))
		    	System.out.println("run in headless mode");
	}

}
