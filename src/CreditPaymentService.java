public class CreditPaymentService {
    public double calculate(int credit, int years, double percentInYear) {

        double monthlyInterestRate;
        monthlyInterestRate = percentInYear / (100 * 12);
        double months = -(years * 12);
        Math.pow(1 + (double) monthlyInterestRate, months);

        double result;
        result = credit * ((double) monthlyInterestRate / (1 - ((double)Math.pow(1 + (double) monthlyInterestRate, months))));

        return result;
    }

}


