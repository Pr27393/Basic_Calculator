package com.project;

import java.util.Scanner;

    public class calculator {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two number");
            System.out.print("1st value = ");
            int a = sc.nextInt();

            System.out.print("2nd value = ");
            int b = sc.nextInt();

            System.out.println("choose operator +,-,*,/");
            char var =sc.next().charAt(0);

            switch(var){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);

            }
        }
    }