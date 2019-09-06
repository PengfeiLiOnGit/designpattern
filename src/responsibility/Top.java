package responsibility;

public class Top extends Manager{
    @Override
    void doRequest(Request request) {
        System.out.println("top manager");
    }
}
