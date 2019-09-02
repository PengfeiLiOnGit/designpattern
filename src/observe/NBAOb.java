package observe;

public class NBAOb extends Observer {
    @Override
    void update(Subject subject) {
        System.out.println(subject.getName() + "：来了，关闭NBA直播");
    }

}
