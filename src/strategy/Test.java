package strategy;

import simplefactory.Opea;
import simplefactory.OperaFactory;

public class Test {
    public static void main(String args[]){
        String type = "rate";
        // 获取context
        Context context = new Context(type);
        // 执行计算
        double total = context.getResult(2,10);
        System.out.println(total);
    }
}
