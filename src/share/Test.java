package share;

public class Test {
    public static void main(String[] args){
        ShareFactory shareFactory = new ShareFactory();

        Chess chess = shareFactory.getChess("white");
        System.out.println(chess.getClass().getSimpleName());

        Chess chess1 = shareFactory.getChess("black");
        System.out.println(chess1.getClass().getSimpleName());
    }
}
