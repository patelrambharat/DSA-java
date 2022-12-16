package com.company;

public class Singleton {
//data member
    static Singleton  instance = null;
    //constructor private  -> koi aur object na bane
    private Singleton(){

    }
    static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void sayHello(){
        System.out.println("Hi,i an a singleton class");
        System.out.println(instance);
    }
}
