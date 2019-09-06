package explain;

public class Test {
    public static void main(String[] args){
        Context context = new Context();
        context.setText("你");

        Express express = new ExpressEnlish();
        express.interpret(context);

    }
}
