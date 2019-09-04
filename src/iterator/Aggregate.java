package iterator;

/**
 * 聚集管理者类
 */
public interface Aggregate {
    Iterator createIterator();

    boolean add(Object o);
}
