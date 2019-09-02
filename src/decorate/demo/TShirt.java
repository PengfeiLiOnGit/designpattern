package decorate.demo;

public class TShirt extends Clothes{
    @Override
    public void show() {
        // 调用抽象方法
        super.show();
        System.out.println("穿上TShire");
        addState();
        showName();
    }

    private void addState(){
        System.out.println("this is addstate");
    }

    @Override
    public void showName() {
        super.showName();
        System.out.println("展示名称结束");
    }
}
