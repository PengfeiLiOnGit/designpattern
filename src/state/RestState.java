package state;

public class RestState implements State{
    @Override
    public void handlerState(Work work) {
        System.out.println(work.getTime()+":现在是下班时间");
    }
}
