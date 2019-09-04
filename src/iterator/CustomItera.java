package iterator;

/**
 * 迭代器实现类
 * 迭代器是一个工具，存放具体聚集的引用
 * 实际不存储对象
 */
public class CustomItera implements Iterator {
    private AggregateImple collections;

    private int current = 0;

    public CustomItera(AggregateImple collections) {
        this.collections = collections;
    }

    @Override
    public Object first() {
        return collections.get(0);
    }

    @Override
    public Object next() {
        current ++;
        if(current < collections.size()){
            return collections.get(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current >= collections.size() ? true : false;
    }

    @Override
    public Object getCurrentItem() {
        return collections.get(current);
    }
}
