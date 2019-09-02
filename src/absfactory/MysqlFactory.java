package absfactory;

public class MysqlFactory implements IFactory {
    @Override
    public IUser createUserFactory() {
        return new SysUserMysql();
    }
}
