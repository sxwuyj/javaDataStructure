package com.wuyj.modle.command.middle;

import com.wuyj.modle.command.simple.Command;

/**
 * @author wuyj
 * @date 2022/1/22 11:20 下午
 */
public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
