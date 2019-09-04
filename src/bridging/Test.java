package bridging;

public class Test {
    public static void main(String[] args){
        // 声明品牌实例与功能实例
        App app = new Zhifubao("支付宝");
        Function function = new PayFunction("支付功能");
        Function function1 = new ChatFunction("聊天功能");

        app.setFunction(function1);
        app.setFunction(function);
        app.description();


        App app1 = new QQ("QQ");
        app1.setFunction(function1);

        app1.description();
    }
}
