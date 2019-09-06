package command;

/**
 * 数据库访问操作类抽象类
 */
public abstract class OrmImpl<T> {
    abstract void save();

    abstract void update();

}
