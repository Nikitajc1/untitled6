public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double money;
        double period;
        double percent;
        double pay = service.calculate(money = 1_000_000d, period = 12d, percent = 9.99d);
        System.out.println();
        System.out.println("Ежемесячный платёж состаляет: " + (int)pay);

        double pay2 = service.calculate(money = 1_000_000d, period = 24d, percent = 9.99d);
        System.out.println();
        System.out.println("Ежемесячный платёж состаляет: " + (int)pay2);

        double pay3 = service.calculate(money = 1_000_000d, period = 36d, percent = 9.99d);
        System.out.println();
        System.out.println("Ежемесячный платёж состаляет: " + (int)pay3);
    }
}