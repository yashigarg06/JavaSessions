package oops_Inheritance;

public class testBankingInheritace {

	public static void main(String[] args) {
		Banking b=new Banking();
		ICICIBanking icicibank=new ICICIBanking();
		HDFCBanking hdfcbank=new HDFCBanking();
	    System.out.println(ICICIBanking.a);
		b.bankingParentClass();
		Banking.regionalMeeting();
		System.out.println("-----------");
		icicibank.bank();
	
		ICICIBanking.iciciDisplay();
		icicibank.bankStatement();
		icicibank.closeAccount();
		icicibank.createAccount();
		icicibank.loanApplication();
		icicibank.loanApplication(10);
		icicibank.loanApplication(10, 20);
		Banking.regionalMeeting();
		System.out.println("-----------");
		HDFCBanking.hdfcDisplay();
		hdfcbank.bankingParentClass();
		hdfcbank.loanApplication();
		hdfcbank.operateLocker();
		hdfcbank.passbookEntry();
		Banking b1=new ICICIBanking();
		System.out.println("-----------");
		b1.bankingParentClass();
	
		
	}

}
