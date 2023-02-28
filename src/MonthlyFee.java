public class MonthlyFee implements SubscriptionFee {
    Calculate calculate = new Calculate();

    public double calculateFee() {
        return calculate.result(1000, 0.8f, 0.2f);
    }
}
