package com.wuyj.modle.command.simple;

/**
 * @author wuyj
 * @date 2022/1/22 10:43 下午
 */
public class SimpleRemoteControl {
    Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
