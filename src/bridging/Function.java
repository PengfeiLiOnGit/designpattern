package bridging;

/**
 * 聚合抽象类
 * 某个app功能抽象类
 * 包涵多种功能
 */
public abstract class Function{
    // 功能名称
    protected String name;

    public Function(String name) {
        this.name = name;
    }

    /**
     * 具体功能描述
     */
    abstract void description();
}
