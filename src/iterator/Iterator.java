package iterator;

/**
 * 迭代器抽象接口
 *
 */
public interface Iterator {
    Object first();

    Object next();

    boolean isDone();

    Object getCurrentItem();
}
