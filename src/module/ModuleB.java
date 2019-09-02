package module;

public class ModuleB extends AbsModule{
    @Override
    void answer() {
        question();
        System.out.println("no");

        questionTwo();
        System.out.println("yes");
    }
}
