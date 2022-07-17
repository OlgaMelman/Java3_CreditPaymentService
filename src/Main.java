import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        DecimalFormat df = new DecimalFormat("#");

        System.out.println();
        System.out.println("Ежемесячный платёж: " + df.format(service.calculate(1_000_000, 1, 9.99)) + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платёж: " + df.format(service.calculate(1_000_000, 2, 9.99)) + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платёж: " + df.format(service.calculate(1_000_000, 3, 9.99)) + " руб.");
    }

}
