package javasessions;

import java.util.*;

public class TestConstructorImplementBrowser {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
	    list.add("plugin1");
	    list.add("plugin2");
	    list.add("plugin3");
		ConstructorImplementBrowser browser1=new ConstructorImplementBrowser("Chrome",1.8,list);
		System.out.println(browser1.browserName+" "+browser1.version+" "+browser1.plugins);
		System.out.println("------------------");
		browser1.setBrowserName("bing");
		System.out.println("Browser name is :" + browser1.getBrowserName());
		System.out.println("Browser version is :"+ browser1.getVersion());
		System.out.println("browser plugins are :"+ browser1.getPlugins());
		
		
		
	}

}
