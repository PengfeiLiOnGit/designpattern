package visitor;

public class FirstState extends Visitor{
    @Override
    void visitA() {
        System.out.println("A对象的第一个行为");
    }

    @Override
    void visitB() {
        System.out.println("B对象的第一个行为");
    }
}
