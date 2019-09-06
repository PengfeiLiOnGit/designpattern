package responsibility;

public class Middle extends Manager{

    @Override
    void doRequest(Request request) {
        if(request.getType().equals("middle")){
            System.out.println("middle manager");
        }else {
            up.doRequest(request);
        }
    }
}
