package intermediary;

public class SomethingB extends Something{
    public SomethingB(Media media) {
        super(media);
    }

    @Override
    void getMsg(String msg) {
        System.out.println("B"+msg);
    }
}
