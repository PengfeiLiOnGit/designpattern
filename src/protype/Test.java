package protype;

public class Test {
    public static void main(String[] arges){
        Test test = new Test();

        Person person = new Person("wxx","男","徐州");
//        person.setLocation(new Location("江苏","徐州"));
        person.setLocationStr("江苏","徐州");
        System.out.println(person);
        try {
            test.shallow(person);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    /**
     * 浅拷贝操作
     */
    public void shallow(Person person) throws CloneNotSupportedException {
        Person p = (Person) person.clone();

        p.setAddress("南京");
//        p.setLocation(new Location("河北","保定"));
        p.setLocationStr("河北","保定");
        System.out.println(p);
    }
}
