package absfactory;

public class OrclFactory implements IFactory {
    @Override
    public IUser createUserFactory() {
        return new SysUserOrcl();
    }
}
