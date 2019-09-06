package responsibility;

public class Test {
    public static void main(String[] args){
        Request request = new Request();
        request.setType("middle");
        // 设置职责链
        // 在处理请求时根据设置的职责链对请求进行处理
        Manager bottom = new Bottom();
        Manager middle = new Middle();
        Manager top = new Top();

        middle.setUp(top);
        bottom.setUp(middle);

        bottom.doRequest(request);
    }
}
