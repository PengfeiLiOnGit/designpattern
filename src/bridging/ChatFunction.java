package bridging;

public class ChatFunction extends Function{
    public ChatFunction(String name) {
        super(name);
    }

    @Override
    void description() {
        System.out.println("聊天功能");
    }
}
