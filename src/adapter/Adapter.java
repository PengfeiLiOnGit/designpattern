package adapter;

public class Adapter implements Target{
    @Override
    public void request() {
        System.out.println("准备调用源接口进行适配");
        Adaptee adaptee = new AdapteeImpl();
        adaptee.doRequest();
    }
}
