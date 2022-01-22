package com.wuyj.modle.command.middle;

import com.wuyj.modle.command.simple.GarageDoor;
import com.wuyj.modle.command.simple.GarageDoorCloseCommand;
import com.wuyj.modle.command.simple.GarageDoorOpenCommand;
import com.wuyj.modle.command.simple.Light;

/**
 * @author wuyj
 * @date 2022/1/22 11:25 下午
 */
public class RemoteLoader {
    public static void main(String[] args) {
        //创建装置
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        //依次创建命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        //加载到对应遥控器插槽
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(1,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.setCommand(2,stereoOnWithCDCommand,stereoOffWithCDCommand);

        System.out.println(remoteControl);

        //操作遥控器
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        System.out.println("===================");

        LightOnCommand lightOnCommandUndo = new LightOnCommand(light);
        LightOffCommand lightOffCommandUndo = new LightOffCommand(light);
        remoteControl.setCommand(3,lightOnCommandUndo,lightOffCommandUndo);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
