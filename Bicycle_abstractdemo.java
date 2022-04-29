package com.basics.oop;

abstract class Bicycle{
    public int x=10;
    public abstract void ride();
    public abstract void stop();
    public abstract void start();
    public void Horn(){
        System.out.println("Horn.....................horn...............");
    }
}
class Bicycle1 extends Bicycle{
    public void ride(){
        System.out.println("Riding the bicycle");
    }
    public void stop(){
        System.out.println("Stopped riding the bicycle");
    }
    public void start(){
        System.out.println("Started the bicycle");
    }

}
public class Bicycle_abstractdemo{
    public static void main(String args[]){
        Bicycle1 b=new Bicycle1();
        b.start();
        b.ride();
        b.Horn();
        b.stop();

    }
}