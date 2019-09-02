package factory;

public class MinFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMin();
    }
}
