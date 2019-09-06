package visitor;

public class EleB extends Ele{
    @Override
    void accept(Visitor visitor) {
        visitor.visitB();
    }
}
