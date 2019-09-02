package decorate.demo;

/**
 * pojo
 * 人
 */
public class Person {
    private String name;

    private String sex;

    /**
     * 传衣展示方法
     */
    public void show(){
        System.out.println("开始个人穿衣");
    }

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
