package business;

import java.text.NumberFormat;
import java.util.Currency;

public class FinancialCalculations {

	public static double calculateFutureValue(double investment, double rate, int years) {
		
		double monthlyInterestRate = rate/12/100;
        int months = years * 12;

        double futureValue = 0.0;
        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + investment) *
                          (1 + monthlyInterestRate);

        }

		return futureValue;
	}
	
	public static String calculateFutureValue2(double investment, double rate, int years) {

		double monthlyInterestRate = rate/12/100;
		//int months = years * 12;
		StringBuilder test = new StringBuilder();

		double futureValue = 0.0;
		for (int i = 1; i <= years; i++) {
			futureValue = (futureValue + investment) *
					(1 + monthlyInterestRate);

			//System.out.println("Year "+ i+ ": "+ futureValue);
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			Currency newCurrency = Currency.getInstance("USD");
			currency.setCurrency(newCurrency);
			
			test.append("Year ").append(i).append(": ").append(currency.format(futureValue)).
			append("\n");

		}
		
		return test.toString();

	}

}
