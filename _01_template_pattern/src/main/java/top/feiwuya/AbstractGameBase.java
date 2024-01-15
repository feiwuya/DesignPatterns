package top.feiwuya;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname AbstractGameBase
 * @Description 在这里定义模板方法，但是不实现，定义抽象的游戏过程
 * @Date 2024/1/16 3:42
 * @Author by admin
 */
@Slf4j
public abstract class AbstractGameBase extends GameSupport implements IGameExec {
    @Override
    public String doGame(String username) {

        this.beginGame(username);

        // 调用基础支持
        super.query(username);

        this.closeGame(username);
        return username;
    }

    protected abstract void beginGame(String username);

    protected abstract void closeGame(String username);
}
