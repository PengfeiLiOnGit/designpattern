package absfactory;

public class SysUserMysql extends IUser {
    @Override
    void get() {
        System.out.println("mysql查询用户");
    }

    @Override
    void save() {
        System.out.println("mysql保存用户");
    }
}
