package strategy;

public class NormalCash implements CashSuper{
    @Override
    public double getResult(int a, int total) {
        return total+a;
    }
}
