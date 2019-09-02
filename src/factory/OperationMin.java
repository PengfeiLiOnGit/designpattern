package factory;

/**
 * 实现减法运算
 */
public class OperationMin extends Operation{
    @Override
    public Double getResult(double a, double b) {
        return a - b;
    }
}
