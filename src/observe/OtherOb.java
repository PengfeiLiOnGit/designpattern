package observe;

public class OtherOb extends Observer{
    @Override
    void update(Subject subject) {
        System.out.println(subject.getName() + "：来了，快工作" );
    }
}
