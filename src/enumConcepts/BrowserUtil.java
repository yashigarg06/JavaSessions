package enumConcepts;

public class BrowserUtil {

	public static void main(String[] args) {
		
		Browser browser = Browser.CHROME;
		if (browser.toString().equals("CHROME"))
			System.out.println("Chrome is launched");
		else
			System.out.println("Please pass right browser");

		if (browser==Browser.CHROME)
			System.out.println("Chrome is launched");
		else
			System.out.println("Please pass right browser");
		
		//Access environment properties
		Environment env=Environment.QA;
		Environment env1= Environment.PROD;
		
		
		System.out.println(env.getEnvValue());
		System.out.println(env1.getEnvValue());
		
		//printing constant values from constant classS
		System.out.println(Constants.DEFAULT_TIME_OUT);
		System.out.println(Constants.LOGIN_PAGE_TITLE);
		
		
	}

}
