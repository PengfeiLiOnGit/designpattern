package singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args){
        Executor executor = Executors.newFixedThreadPool(2);
//        for (int i = 0; i < 10; i++) {
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("xxx");
//                }
//            });
//        }
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    // 打印对象散列值，查看是否一致
                    System.out.println(Singleton.getInstance());
                }
            };
            executor.execute(runnable);
        }
    }
}
