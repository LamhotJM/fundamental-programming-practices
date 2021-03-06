package composition.lab1.prog1;

public class Main {

	public static void main(String[] args) {

		// System.out.print(emps); // memory address
		Employee harry = new Employee("Lamhot", 2015, 10, 1);
		harry.createNewSavings(300);
		harry.createNewChecking(300);
		harry.createNewRetirement(3000);

		// test deposit
		harry.deposit(AccountType.SAVING, 100);
		harry.deposit(AccountType.CHECKING, 100);
		harry.deposit(AccountType.RETIREMENT, 100);

		// test withdraw
		harry.withdraw(AccountType.SAVING, 100);
		harry.withdraw(AccountType.CHECKING, 100);
		harry.withdraw(AccountType.RETIREMENT, 100);

		// test for new
		Employee john = new Employee("John", 2015, 1, 23);
		john.createNewSavings(1000);
		john.createNewChecking(2000);
		john.createNewRetirement(3000);

		// test for new
		Employee john2 = new Employee("John II", 2015, 1, 23);
		john2.createNewSavings(1000);
		john2.createNewChecking(2000);
		john2.createNewRetirement(3000);

		// Employee[] emps = new Employee[3];
		Employee[] emps = { harry, john, john2 };

		StringBuilder str = new StringBuilder();

		
		// using foreach 
		//for (Employee emp : emps) {
		//	str.append(emp.getFormattedInfo() + "\n");
		//}
		
		//for loop
		
		for(int i=0;i<emps.length;i++)
		{
			str.append(emps[i].getFormattedInfo() + "\n");
		}
		System.out.print(str.toString());
	}

}
