package javasessions;


public class PrintAscii {
	public static void main(String[] args) {
	 //char c='Z';
	 for (char i='A';i<='Z' ;i++) {
		 System.out.println((int)i);
		 char j=Character.toLowerCase(i);
		 System.out.println((int)j);
	 }
	}

}
