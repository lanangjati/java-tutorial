package com.lanjati.Interface;

/**
 * @author Lanang Jati
 */
public class MobilePhone implements Telephone {
    private String name;
    private String sound;
    private String msg;

    public MobilePhone() {
        this.name = "Mobile Phone";
        this.sound = "Riiiing!";
        this.msg = "Hai";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void ring() {
        System.out.println(name + " " + sound);
    }

    @Override
    public void makeCall(String customer) {
        System.out.println("Calling " + customer + " with " + this.name);
    }

    public void sendMsg() {
        System.out.println("Send SMS: " + msg);
    }
}
