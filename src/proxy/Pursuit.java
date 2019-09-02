package proxy;

public class Pursuit implements GiveGift {
    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void dolls() {
        System.out.println(girl.getName() + "dolls");
    }

    @Override
    public void flowers() {
        System.out.println(girl.getName() + "flowers");
    }

    @Override
    public void chocolate() {
        System.out.println(girl.getName() + "chocolate");

    }
}
