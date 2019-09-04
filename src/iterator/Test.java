package iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        // 声明聚集实例
        Aggregate aggregate = new AggregateImple();
        aggregate.add("x");
        aggregate.add("y");
        aggregate.add("z");

        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.getCurrentItem());
            iterator.next();
        }

        // java 实现
        List<String> list = new ArrayList<>();
        list.add("x");
        list.add("y");

        java.util.Iterator<String> iter = list.iterator();
        // 判断是否存在下一个节点类似isDone
        while (iter.hasNext()){
            // 获取下一个节点元素，同时移动下标
            System.out.println(iter.next());
        }
    }
}
