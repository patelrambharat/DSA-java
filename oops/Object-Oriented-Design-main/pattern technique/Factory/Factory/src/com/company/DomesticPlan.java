package com.company;

public class DomesticPlan extends Plan{

    public void getRate() {
        this.rate = 3;
        System.out.println("rate updated to " + this.rate);
    }

}
