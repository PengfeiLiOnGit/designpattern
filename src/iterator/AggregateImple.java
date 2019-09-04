package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚集管理类
 *
 */
public class AggregateImple implements Aggregate {
    private List items = new ArrayList();

    @Override
    public Iterator createIterator() {
        return new CustomItera(this);
    }

    @Override
    public boolean add(Object o){
        return items.add(o);
    }

    public Integer size(){
        return items.size();
    }

    public Object get(int i){
        return items.get(i);
    }

    public void set(Object o){
        items.add(o);
    }
}
