package combination;

import java.util.Collections;

/**
 * 组合模式基类
 * 定义通用接口
 * 具有类似结构与类似行为的抽象
 */
public abstract class Component {
    protected String treeName;

    public Component(String treeName) {
        this.treeName = treeName;
    }

    abstract void add(Component component);
    abstract void remove(Component component);
    abstract void doSameThing();
    void display(int depth){
        System.out.println(String.join("", Collections.nCopies(depth,"--")));
    };


    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
