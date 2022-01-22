package com.wuyj.modle.command.simple;

/**
 * @author wuyj
 * @date 2022/1/22 10:46 下午
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setSlot(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garage = new GarageDoorOpenCommand(garageDoor);
        remote.setSlot(garage);
        remote.buttonWasPressed();
    }
}
