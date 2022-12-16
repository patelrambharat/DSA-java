package com.company;
//import com.company.Plan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create factory to access object
        PlanFactory factory = new PlanFactory();

        //take input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of plan for which the bill will be generated");
        String planName = sc.nextLine();

        System.out.println("Enter the number of units for bill will be calculated:");
        int units = sc.nextInt();
        //object creation
        //factory wale class ka getPlan object call hua hai
        Plan plan = factory.getPlan(planName);
        System.out.println("Plan name is:");
        System.out.println(planName);

        System.out.println("Rate is :");
        plan.getRate();
        System.out.println(plan.rate);
        System.out.println("Total bill is :");
        plan.calculateBill(units);
    }
}
