package top.feiwuya.impl;

import lombok.extern.slf4j.Slf4j;
import top.feiwuya.AbstractGameBase;

/**
 * @Classname GameExecFootball
 * @Description
 * @Date 2024/1/16 3:49
 * @Author by admin
 */
@Slf4j
public class GameExecFootball extends AbstractGameBase {
    @Override
    protected void beginGame(String username) {
        log.info("{} 打开了足球游戏...", username);
    }

    @Override
    protected void closeGame(String username) {
        log.info("{} 关闭足球游戏...", username);
    }
}
