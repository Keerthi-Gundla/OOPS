package com.basics.oop;

class vechile{
    public void run(){
        System.out.println("This is run method of vehicle");
    }
}
class Car extends vechile{
    public void run(){
        System.out.println("car is running");
    }
}
public class method_overriding {
    public static void main(String args[]){

        System.out.println(a);
        vechile v=new vechile();
        v.run();
        Car c=new Car();
        c.run();
        vechile c1=new Car();
        c1.run();

    }
}
