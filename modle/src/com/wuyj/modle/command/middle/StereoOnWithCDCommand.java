package com.wuyj.modle.command.middle;

import com.wuyj.modle.command.simple.Command;

/**
 * @author wuyj
 * @date 2022/1/22 11:20 下午
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
