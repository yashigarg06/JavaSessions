package javasessions;

import java.util.ArrayList;

public class ConstructorImplementBrowser {
	
		String browserName;
		double version;
		ArrayList<String> plugins;
		
		ConstructorImplementBrowser(String browserName, double version, ArrayList<String> plugins){
			this.browserName=browserName;
			this.version=version;
			this.plugins=plugins;
		
	   }

		public String getBrowserName() {
			return browserName;
		}

		public void setBrowserName(String browserName) {
			this.browserName = browserName;
			System.out.println(this.browserName);
		}

		public double getVersion() {
			return version;
		}

		public void setVersion(double version) {
			this.version = version;
		}

		public ArrayList<String> getPlugins() {
			return plugins;
		}

		public void setPlugins(ArrayList<String> plugins) {
			this.plugins = plugins;
		}
		
		

}
