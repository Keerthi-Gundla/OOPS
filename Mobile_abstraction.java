package com.basics.oop;
import java.util.*;

interface Mobile{
    public void sendMessage(String msg);
    public void call(String phone);
}

class Apple implements Mobile{
    ArrayList<String> contacts=new ArrayList<String>();
    public void sendMessage(String msg){
        System.out.println("Sending message from .......Apple mobile "+msg);
    }
    public void call(String phone)
    {
        System.out.println("calling from Apple "+phone);
    }
    public void addContact(String phone){
        contacts.add(phone);
        System.out.println("contact Added "+phone);
    }
}
public class Mobile_abstraction {
    public static void main(String args[]){
        Apple A=new Apple();
        A.sendMessage("hello good morning");
        A.call("2345678");
        A.addContact("2345678");

        samsung s=new samsung();
        s.sendMessage("hello good morning");
        s.call("2345678");
        s.addContact("2345678");

    }
}


abstract class mobilee{
    ArrayList<String> contacts=new ArrayList<String>();
    abstract public void call(String phone);
    abstract public void sendMessage(String msg);
    public void addContact(String phone){
        contacts.add(phone);
        System.out.println("contact Added "+phone);
    }
}

class samsung extends mobilee{
    public void sendMessage(String msg){
        System.out.println("Sending message from .......samsung mobile "+msg);
    }
    public void call(String phone)
    {
        System.out.println("calling from samsung "+phone);
    }

}

