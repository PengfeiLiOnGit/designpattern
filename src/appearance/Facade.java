package appearance;

import factory.AddFactory;
import factory.IFactory;
import factory.MinFactory;
import factory.Operation;

public class Facade implements PlusAndMuiple{

    @Override
    public double doPlueAndMuiple() {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();

        double result = operation.getResult(1,2);

        IFactory factory1 = new MinFactory();
        Operation operation1 = factory1.createOperation();
        double result1 = operation1.getResult(1,1);
        return (result+result1) * (result+result1);
    }
}
