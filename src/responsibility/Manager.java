package responsibility;

/**
 * 定义处理抽象类
 */
public abstract class Manager {
    private String name;
    protected Manager up;

    public void setUp(Manager up){
        this.up = up;
    }

    abstract void doRequest(Request request);
}
