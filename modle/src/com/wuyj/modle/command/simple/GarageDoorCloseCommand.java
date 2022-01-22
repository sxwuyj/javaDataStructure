package com.wuyj.modle.command.simple;

/**
 * @author wuyj
 * @date 2022/1/22 10:51 下午
 */
public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
    }
}
