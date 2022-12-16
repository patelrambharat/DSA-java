package com.company;

abstract class Plan {   //yaha abstract kiya like commerical domestic and institutional
    protected double rate;
    abstract void getRate();
    public void calculateBill(int units){  //agar number of units pata chal jaye to bill nikal lenge
        System.out.println("value of rate is"+this.rate);
        System.out.println("total bill is"+(units*rate));
    }

}
