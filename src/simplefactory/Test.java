package simplefactory;

public class Test {
    public static void main(String args[]){
        String type = "+";

        Opea opea = OperaFactory.getOpera(type);
        System.out.println(opea.getResult(1,2));
    }
}
