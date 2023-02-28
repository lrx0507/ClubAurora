public class HalfYearlyFee implements SubscriptionFee {
    Calculate calculate = new Calculate();

    public double calculateFee() {
        return calculate.result(3000, 0.35f, 0.45f);
    }
}