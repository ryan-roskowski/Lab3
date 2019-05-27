import java.util.ArrayList;

public class Lab3 {

	public static void main(String[] args) {
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(new Account(512, 10000, "Bob", "Evans"));
		accountList.add(new Account(213, 12431, "Alex", "Jones"));
		accountList.add(new Account(115, 5000, "Sam", "Meuler"));
		accountList.add(new Account(1234, 4200000, "Chris", "Evans"));
		accountList.add(new Account(655, 60, "Zane", "Christopher"));
		accountList.add(new Account(54, 5, "Rudy", "Rainbow"));
		
		System.out.println("accountList last names before sorting: ");
		for(Account a : accountList) {
			System.out.println(a.getLastname());
		}
		System.out.println();
		
		accountList.sort(new AccountComparator());
		
		System.out.println("accountList last names after sorting: ");
		for(Account a : accountList) {
			System.out.println(a.getLastname());
		}
	}

}
