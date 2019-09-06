package visitor;

/**
 * 被访问对象抽象
 */
public abstract class Ele {
    /**
     * 需要有对vistor的引用
     * 具体行为
     */
    abstract void accept(Visitor visitor);
}
