package visitor;

public class SecState extends Visitor {
    @Override
    void visitA() {
        System.out.println("A对象的第二个行为");
    }

    @Override
    void visitB() {
        System.out.println("B对象的第二个行为");
    }
}
