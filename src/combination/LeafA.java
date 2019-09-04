package combination;

import java.util.Collections;

public class LeafA extends Component{
    public LeafA(String treeName) {
        super(treeName);
    }

    @Override
    void add(Component component) {

    }

    @Override
    void remove(Component component) {

    }

    @Override
    void doSameThing() {
        System.out.println("叶子节点A" + treeName);
    }

}
