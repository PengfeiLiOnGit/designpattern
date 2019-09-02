package decorate;

public class DecoraA extends Decorator {
    private String state;

    @Override
    public void operation() {
        super.operation();
        state = "new state";

    }
}
