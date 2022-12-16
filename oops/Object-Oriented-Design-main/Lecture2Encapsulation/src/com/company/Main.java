package com.company;

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.getAge();
        obj.setAge(10);
    }
}
 class  Human{
    private int age;
    private  int weight;
    //using getter and setter for private data membet access
     //fully encapsulated class have all data member as private
     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }