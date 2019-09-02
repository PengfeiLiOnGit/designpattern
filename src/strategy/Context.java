package strategy;

/**
 * 策略模式上下文对象
 * 针对不同的算法用户直接切换
 * 完成相同的工作，只是算法不同
 */
public class Context {
    private CashSuper cashSuper;

    /**
     * 策略模式通过一个上下文类生成具体的算法实例
     * @param type
     */
    public Context(String type) {
        switch (type) {
            case "normal":
                cashSuper = new NormalCash();
                break;
            case "rate":
                cashSuper = new RateCash();
                break;
        }
    }

    /**
     * 策略模式内部调用实例
     * @param a
     * @param total
     * @return
     */
    public double getResult(int a , int total){
        return cashSuper.getResult(a, total);
    }
}
