package factory;

public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationPlus();
    }
}
