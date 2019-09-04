package command;

/**
 * 命令抽象类
 */
public abstract class Command<T> {
    // 引用具体操作者
    protected OrmImpl orm;

    public Command() {
        orm = new DefaultJdbc();
    }

    public Command(OrmImpl orm) {
        this.orm = orm;
    }

    abstract void exec();
}
