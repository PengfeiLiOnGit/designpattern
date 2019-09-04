package memo;

/**
 * 备忘录
 * 实际需要保存的备忘录状态
 * 保存的属性只有get方法，外部无法对属性进行修改
 * 备忘录类作为内部封装的时间不允许外部访问
 */
class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
