package com.knoldus;

import java.util.Scanner;

public abstract class Numbers implements Max {
    public static void main(String[] args) {
        MaxofNumbers obj = new MaxofNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = obj.maximum(a,b);
        System.out.println("Maximum Number: "+max);
    }
}
