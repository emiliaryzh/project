package com.company;

import java.util.Scanner;

public class Main {
    static void printSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rect() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a new number:");
        int length = in.nextInt();
        System.out.println("Input second number:");
        int width = in.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void triangle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter a new number:");
        int l = s.nextInt();
        for (int i = 0; i <= l; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void mirroredTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a new number:");
        int length = in.nextInt();
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("  "); //один пробел – ровная ёлка
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void upsidedown() {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Please, enter a new number:");
        int length = in1.nextInt();
        for (int i = 0; i <= length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void rhombus() {
        Scanner in2 = new Scanner(System.in);
        System.out.println("Please, enter a new number:");
        int l = in2.nextInt();

        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= l - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = l - 1; i >= 0; i--) {
            for (int j = 0; j <= l - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        printSquare();
        rect();
        triangle();
        mirroredTriangle();
        upsidedown();
        rhombus();
    }
}
