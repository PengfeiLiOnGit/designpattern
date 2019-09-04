package state;

/**
 * 状态抽象类
 * 消除复杂条件分支
 * 根据状态的不同生成新的状态
 */
public interface State {
    void handlerState(Work work);
}
