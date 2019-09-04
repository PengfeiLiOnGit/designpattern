package command;

public class Test {
    public static void main(String[] args){
        Command save = new Save();
        Command update = new Update();

        Service service = new Service();
        service.setCommand(save);
        service.setCommand(update);

        service.exec();
    }
}
