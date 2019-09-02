package decorate;

/**
 * 装饰抽象类
 */
abstract class Decorator extends Component{

    private Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component!=null){
            component.operation();
        }
    }
}
