package factory;

public class Test {
    public static void main(String[] args){
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();

        double result = operation.getResult(1,2.2);
        System.out.println(result);
    }
}
