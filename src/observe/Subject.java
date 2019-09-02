package observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知类
 */
public abstract class Subject {
    List<Observer> list = new ArrayList<>();

    // 通知者
    private String name;

    public void add(Observer observer){
        list.add(observer);
    }

    public void remove(Observer observer){
        list.remove(observer);
    }

    public void notifyAllOb(){
        for (Observer observer:list) {
            observer.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
