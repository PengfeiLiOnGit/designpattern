package absfactory;

public class Test {
    public static void main(String[] args){
//        IFactory mysql = new MysqlFactory();
//        IUser user = mysql.createUserFactory();
//
//        user.get();
//
//        IFactory orcl = new OrclFactory();
//        IUser user1 = orcl.createUserFactory();
//
//        user1.get();

        try {
            IUser user = DataAccess.getService(SysUser.class);
            user.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
