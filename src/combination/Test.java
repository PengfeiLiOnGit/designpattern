package combination;

public class Test {
    public static void main(String[] args){
        //定义root 根节点
        Composite root = new Composite("root");
        root.add(new LeafA("leaf-a"));

        root.add(new LeafB("leaf-b"));

        Composite branch = new Composite("brance-a");
        branch.add(new LeafA("branch-leaf-a"));

        root.add(branch);
        // 做一些事情
//        root.doSameThing();
        branch.doSameThing();
    }
}
