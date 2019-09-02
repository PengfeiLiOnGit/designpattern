package build;

import decorate.demo.Person;

/**
 * 建造者流程类
 * 引用类
 */
public class PersonDirector {
    /**
     * 人物生成器引用
     */
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    /**
     * 任务生成方法
     */
    public void createPerson(){
        personBuilder.body();
        personBuilder.feet();
        personBuilder.hands();
        personBuilder.head();
    }
}
