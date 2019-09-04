package bridging;

/**
 * 具体功能子类
 */
public class PayFunction extends Function{
    public PayFunction(String name) {
        super(name);
    }

    @Override
    void description() {
        System.out.println("支付功能");
    }

}
