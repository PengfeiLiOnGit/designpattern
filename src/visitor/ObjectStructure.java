package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * 管理访问者访问对象方法
 * 提供一个高层接口以允许访问中访问它的元素
 */
public class ObjectStructure {
    private List<Ele> eles = new ArrayList<>();

    public void add(Ele ele){
        eles.add(ele);
    }

    public void remove(Ele ele){
        eles.remove(ele);
    }

    public void accept(Visitor visitor){
        for (Ele ele:eles) {
            ele.accept(visitor);
        }
    }
}
