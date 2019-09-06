package explain;

public abstract class Express {
    public void interpret(Context context){
        if(context == null || context.getText().equals("")){
            return;
        }else{
            String text = context.getText();
            if(text.equals("你")){
                trans("你");
            }
        }
    }

    abstract void trans(String txt);
}
