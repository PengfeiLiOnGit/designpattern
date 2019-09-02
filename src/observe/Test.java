package observe;

public class Test {
    public static void main(String[] args){
        Observer observer = new NBAOb();
        Observer observer1 = new OtherOb();

        Subject subject = new Boss();
        // 订阅观察者模式
        subject.add(observer);
        subject.add(observer1);

        // 发布通知
        subject.notifyAllOb();
    }
}
