package top.feiwuya;

import org.junit.Test;
import top.feiwuya.impl.GameExecBasketball;
import top.feiwuya.impl.GameExecFootball;

/**
 * @Classname GameExecTest
 * @Description 测试类
 * @Date 2024/1/16 3:52
 * @Author by admin
 */
public class GameExecTest {
    @Test
    public void test() {
        IGameExec basketballGameExec = new GameExecBasketball();
        basketballGameExec.doGame("老王");
        IGameExec footballGameExec = new GameExecFootball();
        footballGameExec.doGame("老孙");
    }
}
