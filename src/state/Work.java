package state;

public class Work {
    private State state;

    private Integer time;

    public Work() {
        state = new WorkState();
        time = 9;
    }

    /**
     * 当前工作状态
     */
    public void hander(){
        state.handlerState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
