package proxy;

public class Test {
    public static void main(String args[]){
        Girl girl = new Girl();
        girl.setName("wn");

        // 由代理执行追求者的工作
        Proxy proxy = new Proxy(girl);
        proxy.dolls();
        proxy.flowers();
        proxy.chocolate();
    }
}
