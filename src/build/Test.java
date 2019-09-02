package build;

public class Test {
    public static void main(String[] args){
        // director 实例声明
        PersonDirector director = new PersonDirector(new ThinPerson());

        director.createPerson();
    }
}


