package enumConcepts;

public enum Environment {

	QA("qa"),
	STAGE("stage"),
	DEV("dev"),
	UAT("uat"),
	PROD("prod");
	
	String envName;
	
	Environment(String envName){
		this.envName=envName;
	}
	public String getEnvValue() {
		return this.envName;
	}
}
