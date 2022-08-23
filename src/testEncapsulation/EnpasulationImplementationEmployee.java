package testEncapsulation;

import java.util.ArrayList;

public class EnpasulationImplementationEmployee {
	private String name;
	private int age;
	private int salary;
	private boolean isActive;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public ArrayList<Object> getEmployeeInfo() {
		ArrayList<Object> empinfo=new ArrayList<Object>();
		empinfo.add(this.name);
		empinfo.add(this.age);
		empinfo.add(this.gender);
		empinfo.add(this.isActive);
		return empinfo;
	}

}
