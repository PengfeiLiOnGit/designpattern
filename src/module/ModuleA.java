package module;

public class ModuleA extends AbsModule{
    @Override
    void answer() {
        question();
        System.out.println("yes");

        questionTwo();
        System.out.println("no");
    }
}
