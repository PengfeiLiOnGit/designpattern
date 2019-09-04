package command;

import java.util.List;
import java.util.Map;

public class Update extends Command {
    @Override
    void exec() {
        System.out.println("需要更新操作");
        orm.update();
    }
}
