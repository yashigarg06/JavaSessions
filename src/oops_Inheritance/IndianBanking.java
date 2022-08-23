package oops_Inheritance;

public interface IndianBanking {
	
	public void createAccount();
	public void closeAccount();
	
	public static void withdrawMoney() {
		System.out.println("IndianBanking --- withdrawMoney");
	}

	default void loanApplication(int a) {
		System.out.println("IndianBanking --- LoanApplication");
	}
}
