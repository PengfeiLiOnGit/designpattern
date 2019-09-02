package protype;

public class Person implements Cloneable{
    private String name ;

    private String sex ;

    private String address;

    private Location location;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 重写拷贝
        // 深拷贝，新建新的实例
//        Person person = new Person();
        // 下面这句是伪代码，意思是所有属性，如果是对象引用就创建新的对象
//        person.all = person.all;
        return super.clone();
    }

    @Override
    public String toString() {
        return this.name + this.sex + this.address + "location:" + this.location.getCity() + this.location.getProvince();
    }

    public Person() {
        location = new Location();
    }

    public Person(String name, String sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        location = new Location();
    }

    public void setLocationStr(String p ,String c){
        this.location.setCity(c);
        this.location.setProvince(p);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
