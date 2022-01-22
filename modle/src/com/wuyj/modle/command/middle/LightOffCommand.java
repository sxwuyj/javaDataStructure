package com.wuyj.modle.command.middle;

import com.wuyj.modle.command.simple.Command;
import com.wuyj.modle.command.simple.Light;

/**
 * @author wuyj
 * @date 2022/1/22 10:41 下午
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
