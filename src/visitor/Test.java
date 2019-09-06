package visitor;

/**
 * 访问中模式中
 * 具体访问对象类是固定的，访问接口的不同表现根据不同被访问对象具体类的个数为基础
 * 访问对象根据不同访问对象访问对象的行为状态
 */
public class Test {
    public static void main(String[] args){
        // 访问对象接口声明
        ObjectStructure structure = new ObjectStructure();
        structure.add(new EleA());
        structure.add(new EleB());
        structure.add(new EleB());

        // 声明具体表现行为
        Visitor visitor = new FirstState();
        Visitor visitor1 = new SecState();

        // 访问者访问具体不同对象的表现行为
        // 对象结构需要了解结构中所有具体对象在某个状态下的行为
        structure.accept(visitor);
//        structure.accept(visitor1);
    }
}
