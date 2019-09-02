package absfactory;

/**
 * 数据访问lei
 */
public class DataAccess {
    // 判断数据库字符串
    private static final String DB = "Orcl";
//    private static final String DB = "Mysql";

    // 通过反射获取service

    /**
     * 命名规范统一
     *
     * @param clazz 实体类
     * @param <T>
     * @return
     */
    public static <T> T getService(Class<?> clazz) throws Exception {
        // service类名
        String classname = clazz.getName() + DB;
        // @param      className   the fully qualified name of the desired class.
        // forName 要求为全限定名
        return (T) Class.forName(classname).newInstance();
    }
}

