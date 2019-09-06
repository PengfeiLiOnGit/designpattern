package responsibility;

/**
 * 处理实现子类
 */
public class Bottom extends Manager{
    @Override
    void doRequest(Request request) {
        if(request.getType().equals("bottom")){
            System.out.println("bottom manager");
        }else{
            up.doRequest(request);
        }
    }
}
