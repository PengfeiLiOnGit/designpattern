package observe;

public abstract   class Observer {
    /**
     * 姓名
     */
    protected String name;

    public Observer() {
    }

    public Observer(String name) {
        this.name = name;
    }

    abstract void update(Subject subject);
}
