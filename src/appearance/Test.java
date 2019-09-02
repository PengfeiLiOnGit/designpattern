package appearance;

public class Test {
    public static void main(String[] args){
        PlusAndMuiple opera = new Facade();
        double x = opera.doPlueAndMuiple();
        System.out.println(x);
    }
}
