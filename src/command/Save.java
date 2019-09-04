package command;

import java.util.List;
import java.util.Map;

public class Save extends Command {
    @Override
    void exec() {
        System.out.println("需要保存操作");
        orm.save();
    }
}
