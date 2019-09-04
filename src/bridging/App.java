package bridging;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚合抽象类
 * 多个APP 的抽象
 */
public abstract class App {
    // APP 应用名称
    protected String name;

    public App(String name) {
        this.name = name;
    }

    // 功能引用
    // 功能被包涵在具体APP对象中
    private List<Function> functions = new ArrayList<>();

    public void setFunction(Function function){
        functions.add(function);
    }

    public void description(){
        System.out.println("APP："+name);
        for (Function function:functions) {
            function.description();
        }
    };
}
