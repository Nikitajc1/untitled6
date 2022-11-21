public class CreditPaymentService {

    public double calculate (double creditSum, double month, double percent){
        double monthPercent = (percent / 12) / 100;
        double sum = monthPercent + 1;
        double smthng = Math.pow(sum, month);
        double coefficient = (monthPercent * smthng) / (smthng - 1);
        double annuity = creditSum * coefficient;
        //double annuity = creditSum * (percent + (percent / (1 + percent) * month - 1));
        return annuity;
    }
}