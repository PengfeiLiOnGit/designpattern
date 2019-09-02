package module;

/**
 * 模版抽象类
 * 题库
 */
public abstract class AbsModule {
    /**
     * 定义抽象方法answer
     */
    abstract void answer();

    protected void question(){
        System.out.println("问题：1==1？");
    }

    protected void questionTwo(){
        System.out.println("问题：2==2?");
    }
}
