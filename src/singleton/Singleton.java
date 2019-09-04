package singleton;

public class Singleton {
    // 声明自身静态对象,始终保存在内存中
    private static Singleton singleton;

    private static Object object = new Object();

    /**
     * 私有化构造方法，外部无法访问
     */
    private Singleton() {

    }

    /**
     * 静态获取单例对象
     * @return
     */
    public static Singleton getInstance(){
        // 在多线程访问的情况下利用DSL 双重锁机制保证实例唯一
        // 因为是静态方法，所以使用类锁，或者使用lock 锁，与生成一个对象锁
        if(singleton == null){
            // 处理业务逻辑

            // DSL
            synchronized (object){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

}
