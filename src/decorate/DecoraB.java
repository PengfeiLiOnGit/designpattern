package decorate;

public class DecoraB extends Decorator{
    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior(){

    }
}
