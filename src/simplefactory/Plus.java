package simplefactory;

/**
 * 加法
 */
public class Plus implements Opea{

    @Override
    public Integer getResult(int a, int b) {
        return a+b;
    }
}
