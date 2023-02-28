public class YearlyFee implements SubscriptionFee {
    Calculate calculate = new Calculate();

    public double calculateFee() {
        return calculate.result(1800, 0.45f, 0.4f);
    }
}
