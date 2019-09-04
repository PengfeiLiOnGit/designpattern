package memo;

import java.util.HashMap;
import java.util.Map;

/**
 * 备忘录管理者
 * 负责保存备忘录的信息
 * 可以保存集合
 */
public class Caretaker {
    private static Map<String ,Memento> saves = new HashMap<>();

    public Memento getMemento(String tag) {
        return saves.get(tag);
    }

    public void setMemento(String tag,Memento memento) {
        saves.put(tag,memento);
    }
}
