package memo;

/**
 * 备忘录发起者
 * 保存备忘录
 */
public class Originator {
    private String state;

    /**
     * 保存备忘录方法
     * @return
     */
    public Memento createMemo(){
        return new Memento(state);
    }

    /**
     * 备忘录回退
     *
     * @param memo
     */
    public void setMemo(Memento memo){
       this.state = memo.getState();
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
