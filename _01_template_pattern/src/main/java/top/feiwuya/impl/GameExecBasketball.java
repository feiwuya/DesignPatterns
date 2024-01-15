package top.feiwuya.impl;

import lombok.extern.slf4j.Slf4j;
import top.feiwuya.AbstractGameBase;

/**
 * @Classname GameExecBasketball
 * @Description 实现类，真正实现功能的地方
 * @Date 2024/1/16 3:50
 * @Author by admin
 */
@Slf4j
public class GameExecBasketball extends AbstractGameBase {
    @Override
    protected void beginGame(String username) {
        log.info("{} 打开了篮球游戏...", username);
    }

    @Override
    protected void closeGame(String username) {
        log.info("{} 关闭篮球游戏...", username);
    }
}
