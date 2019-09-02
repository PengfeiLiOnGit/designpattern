package proxy;

public class Proxy implements GiveGift{
    private Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void dolls() {
        pursuit.dolls();
    }

    @Override
    public void flowers() {
        pursuit.flowers();
    }

    @Override
    public void chocolate() {
        pursuit.chocolate();
    }
}
