public class Calculate {

    private double calculate(int base, float multiplier, float discount) {
        return (base * multiplier) - ((base/2) * discount);
    }

    public double result(int base, float multiplier, float discount){
        return calculate(base, multiplier, discount);
    }
}
//This can help hide the formula.
