package simplefactory;


/**
 * 简单工厂类
 * 针对较为简单是对象获取，共同点：抽象方法，最好有包涵关系，比如算法-》加法、减法
 */
public class OperaFactory {
    /**
     * 生成运算的实例对象
     * @param type
     * @return
     */
    public static Opea getOpera(String type){
        switch (type){
            case "+" :
                return new Plus();
            case "*":
                return new Multi();
            default:
                return null;
        }
    }
}
