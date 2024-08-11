public class StudentCreditManager extends BaseCreditManager{
    @Override
    public double calculate(double amound) {
        return amound * 1.1;
    }
}
