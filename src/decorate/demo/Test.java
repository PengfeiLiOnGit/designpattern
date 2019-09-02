package decorate.demo;

public class Test {
    public static void main(String[] args){
        Person person = new Person("wxx","男");
        // 声明装饰类实例
        TShirt tShirt = new TShirt();
        tShirt.decorate(person);

        // 每次调用show 会从上到下执行show
        tShirt.show();
    }
}
