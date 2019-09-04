package combination;

public class LeafB extends Component{
    public LeafB(String treeName) {
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
        System.out.println("叶子节点B" + treeName);
    }

}
