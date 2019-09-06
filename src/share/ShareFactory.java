package share;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式工厂类
 */
public class ShareFactory {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Map<String,Chess> map = new HashMap<>();

    private Chess black;
    private Chess white;

    public ShareFactory() {
        black = new BlackChess();
        white = new WhiteChess();

        map.put("white",white);
        map.put("black",black);
    }

    public Chess getChess(String key){
        return map.get(key);
    }

}
