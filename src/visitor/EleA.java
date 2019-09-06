package visitor;

/**
 * 被访问对象A 调用具体属于该对象的行为
 */
public class EleA extends Ele{
    @Override
    void accept(Visitor visitor) {
        visitor.visitA();
    }
}
