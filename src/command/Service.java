package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 接收者，持有具体的命令
 */
public class Service {
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command){
        // 业务逻辑判断，比如连接池已满需等待等等
        commands.add(command);
    }

    /**
     * 一次执行所有命令执行完毕且无异常的情况下进行commit
     */
    public void exec(){
        // 执行命令
        for (Command command:commands) {
            command.exec();
        }
        commit();
    }

    public void commit(){
        System.out.println("提交");
    }
}
