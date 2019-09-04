package combination;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 组合方法实现类
 * 分支节点
 */
public class Composite extends Component {
    private List<Component> components = new ArrayList<>();

    public Composite(String treeName) {
        super(treeName);
    }

    @Override
    void add(Component component) {
        components.add(component);
    }

    @Override
    void remove(Component component) {
        components.remove(component);
    }

    @Override
    void doSameThing() {
        System.out.println("分支节点" + treeName);
        for (Component component:components) {
            component.doSameThing();
        }
    }


}
