package com.wuyj.modle.command.middle;

/**
 * @author wuyj
 * @date 2022/1/22 11:20 下午
 */
public class Stereo {

    public void on(){
        System.out.println("音响被打开了");
    }

    public void off(){
        System.out.println("音响被关闭了");
    }

    public void setCD(){
        System.out.println("播放cd");
    }
    public void setDvd(){
        System.out.println("换了DVD");
    }
    public void setVolume(){
        System.out.println("引流调整为10");
    }
}
