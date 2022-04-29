package com.basics.oop;
class Account{
    private String username="data_hiding";
    private String pwd="password@123";
    private double balance=1000.0;

    public double getBalance(String username, String password){
        if(username.equals(this.username) && password.equals(this.pwd)){
            return balance;
        }else{
            return 0.0;
        }
    }
}
public class DataHiding_demo_Account{
    public static void main(String args[]){
        Account act=new Account();
        System.out.println("available Balance in the account = "+act.getBalance("data_hiding","password@123"));
    }

}
