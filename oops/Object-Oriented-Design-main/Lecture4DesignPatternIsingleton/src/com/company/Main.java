package com.company;

public class  Main {
    public static void main(String[] args) {
        //check if this is working or not
        /////singleton s =  new singleton();

        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.sayHello();

        //what are some real life examples of singleton pattern?
    }
}
