package top.feiwuya;


import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

/**
 * @Author admin
 * @Classname GameConfig
 * @Description 进行游戏的初始化操作
 * @Date 2024/1/16 3:30
 */
@Slf4j
public class GameConfig {
    @PostConstruct
    public void init() {
        log.info("游戏初始化ing...");
        log.info("游戏初始化完毕!!!");
    }

}
