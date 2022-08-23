package javasessions;

public class testClass {
	int sal;
	int age;
	String name;
    public static void main(String args[]){
    	testClass emp1=new testClass();
    	testClass emp2=new testClass();
    	emp1.sal=10000;
    	emp1.age=23;
    	emp1.name="sunny";
    	emp2.sal=20000;
    	emp2.age=24;
    	emp2.name="jose";
    	System.out.println("employee data is:");
    	System.out.println(emp1.sal+" "+emp1.age+ " "+emp1.name);
    	System.out.println(emp2.sal+" "+emp2.age+ " "+emp2.name);
    	emp1=emp2;
    	System.out.println("employee data is:");
    	System.out.println(emp1.sal+" "+emp1.age+ " "+emp1.name);
    	System.out.println(emp2.sal+" "+emp2.age+ " "+emp2.name);
	
}
}
