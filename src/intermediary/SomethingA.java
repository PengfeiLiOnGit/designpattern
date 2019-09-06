package intermediary;

public class SomethingA extends Something{
    public SomethingA(Media media) {
        super(media);
    }

    @Override
    void getMsg(String msg) {
        System.out.println("A"+msg);
    }
}
