package com.basics.oop;
import java.util.*;
class fan{
    public  boolean isOn;
    public static boolean power=true;

    fan(boolean f){
        this.isOn=f;

    }

    public static boolean powerChange(){
        if(power==true){
            power=false;
        }else{
            power=true;
        }
        return power;
    }
    public boolean fanOn(){
        isOn=true;
        return isOn;
    }
    public boolean fanOff(){
        isOn=false;
        return isOn;
    }
}
public class Demo {
    public static void main(String args[]){
        fan f=new fan(true);
        System.out.println(f.isOn);
        f.fanOn();
        System.out.println(f.isOn);
        f.fanOff();
        System.out.println(f.isOn);
        fan.powerChange();
        System.out.println("fan Power status : "+fan.power);
        fan f1=new fan(false);
        System.out.println("fan1 Power status : "+fan.power);
        System.out.println("fan1 fan status: "+f1.isOn);

    }
}
