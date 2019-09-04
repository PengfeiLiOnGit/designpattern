package command;

/**
 * 数据库访问默认通过jdbc
 */
public class DefaultJdbc extends OrmImpl{
    public void save(){
        System.out.println("数据库保存");
    };

    public void update(){
        System.out.println("数据库更新");
    }
}
