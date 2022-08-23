package oops_Inheritance;

public class HDFCBanking extends Banking implements IndianBanking, USBanking, UKBanking {
	
	public static void hdfcDisplay() {
		System.out.println("Welcome to HDFCBanking");
	}
	public void createAccount() {
		System.out.println("HDFCBanking----createAccount");
	}
	public void closeAccount() {
		System.out.println("HDFCBanking--------closeAccount");
	}
	public void loanApplication() {
		System.out.println("HDFCBanking------loanApplication");
	}
	public void bankStatement() {
		System.out.println("HDFCBanking------bankStatement");
	}
	public void passbookEntry() {
		System.out.println("HDFCBanking-------passbookEntry");
	}
	public void operateLocker() {
		System.out.println("HDFCBanking---------operateLocker");
	}
    //method hiding
	public static void regionalMeeting() {
		System.out.println("HDFCBanking----regionalMeeting");
	}
}
