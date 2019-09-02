package absfactory;

public class SysUserOrcl extends IUser{
    @Override
    void get() {
        System.out.println("orcl查询用户查询用户");
    }

    @Override
    void save() {
        System.out.println("orcl查询用户保存用户");
    }
}
