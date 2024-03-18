package business;

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

}
