package state;

public class WorkState implements State{
    @Override
    public void handlerState(Work work) {
        if(work.getTime() > 8 && work.getTime() < 18){
            System.out.println(work.getTime()+":现在是工作状态");
        }else{
            work.setState(new RestState());
            work.hander();
        }
    }
}
