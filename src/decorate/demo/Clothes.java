package decorate.demo;

/**
 *
 */
abstract class Clothes extends Person{
    private Person person;

    public Clothes() {
    }

    public Clothes(Person person) {
        super(person.getName(),person.getSex());
        this.person = person;
    }

    /**
     * 装饰人
     */
    public void decorate(Person person){
        this.person = person;
    }

    /**
     * 重写展示方法并调用
     */
    @Override
    public void show() {
        if(person!=null){
            person.show();
        }
    }

    public void showName(){
        System.out.println(person.getName());
    }
}
