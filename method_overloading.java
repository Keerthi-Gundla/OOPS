package com.basics.oop;

class Addition{
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}

public class method_overloading {
    public static void main(String args[]){
        Addition a=new Addition();
        System.out.println(a.sum(10,20));
        System.out.println(a.sum(10.0,20.2));
        System.out.println(a.sum(10,20,30));
    }
}
