
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double expenseRate = 0.3;
		double vatRate = 0.1;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double rate1 = 0.5;
		double rate2 = 0.5;
		double rate3 = 0.5;
		double divided1 = income * rate1;
		double divided2 = income * rate2;
		double divided3 = income * rate3;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat );
		System.out.println("Total : " + total );
		System.out.println("Expense : " + expense );
		System.out.println("Income : " + income );
		
		System.out.println("Dividend1: " + divided1 );
		System.out.println("Dividend2: " + divided2 );
		System.out.println("Dividend3: " + divided3 );
		
		
		
	}

}
