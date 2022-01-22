package com.wuyj.modle.command.simple;

/**
 * 命令接口
 * @author wuyj
 * @date 2022/1/22 10:39 下午
 */
public interface Command {
    void execute();

    void undo();
}
