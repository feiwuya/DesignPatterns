package top.feiwuya;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname GameSupport
 * @Description TODO
 * @Date 2024/1/16 3:39
 * @Author by admin
 */
@Slf4j
public class GameSupport extends GameConfig {
    protected void query(String username) {
        log.info("查询游戏数据ing...");
        log.info("查询到用户 {} 的数据", username);
        log.info("查询游戏数据完毕!!!");
    }
}
