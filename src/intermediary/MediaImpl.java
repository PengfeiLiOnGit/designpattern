package intermediary;

public class MediaImpl extends Media {
    private SomethingA somethingA;
    private SomethingB somethingB;

    public void setSomethingA(SomethingA somethingA) {
        this.somethingA = somethingA;
    }

    public void setSomethingB(SomethingB somethingB) {
        this.somethingB = somethingB;
    }

    @Override
    void doSomeThing(Something something) {
        if(something == somethingA){
            somethingB.getMsg("A - B");
        }else{
            somethingA.getMsg("B - A");
        }

    }
}
