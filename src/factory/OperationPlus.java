package factory;

/**
 * 计算子类
 * 实现加法运算
 */
public class OperationPlus extends Operation{
    @Override
    public Double getResult(double a, double b) {
        return a + b;
    }
}
