package adapter;

public class AdapteeImpl implements Adaptee{
    @Override
    public void doRequest() {
        System.out.println("源接口实现 request");
    }
}
