package oops_Inheritance;

public class ICICIBanking extends Banking implements IndianBanking, USBanking, UKBanking {
	
	public static void iciciDisplay() {
		System.out.println("Welcome to ICICIBanking");
	}
	public void createAccount() {
		System.out.println("ICICIBanking----createAccount");
	}
	public void closeAccount() {
		System.out.println("ICICIBanking--------closeAccount");
	}
	public void loanApplication() {
		System.out.println("ICICIBanking------loanApplication");
	}
	public void bankStatement() {
		System.out.println("ICICIBanking------bankStatement");
	}
	public void passbookEntry() {
		System.out.println("ICICIBanking-------passbookEntry");
	}
	public void operateLocker() {
		System.out.println("ICICIBanking---------operateLocker");
	}
	

	@Override
	public void bankingParentClass() {
		System.out.println("ICICIBanking ---- this is banking");
	}
	@Override
	public void loanApplication(int a) {
		System.out.println("ICICIBanking --- LoanApplication");
	}
	public void loanApplication(int a,int b) {
		System.out.println("ICICIBanking --- new LoanApplication ");
	}
	
}
