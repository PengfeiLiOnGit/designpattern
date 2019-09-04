package memo;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("状态X");
        System.out.println("初始化状态:"+originator.getState());
        // 使用备忘录管理类保存备忘录状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento("x", originator.createMemo());

        // 修改当前状态
        originator.setState("状态Y");

        // 打印当前状态
        System.out.println("修改后的状态:"+originator.getState());
        // 恢复到原先状态
        originator.setMemo(caretaker.getMemento("x"));
        System.out.println("恢复后的状态："+originator.getState());
    }
}
