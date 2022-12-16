package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int  choice;
    public static void main(String[] args) {
        do{
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.             \n");
            System.out.print("            2. SAMSUNG.            \n");
            System.out.print("            3. BLACKBERRY.         \n");
            System.out.print("            4. Exit.               \n");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            choice=sc.nextInt();
            ShopKeeper sk=new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.iphoneSale();
                }
                break;
                case 2:
                {
                    sk.samsungSale();
                }
                break;
                case 3:
                {
                    sk.blackberrySale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        }while(choice!=4);
}
}

