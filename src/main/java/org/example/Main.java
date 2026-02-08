package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int c=4;
        int b=7;
        int a;
        // a= 4
        a = c;
        //c = 7
        c = b;
        b= 4;
        b= a;
        System.out.print("c"+c);
        System.out.print("b"+b);
    }
}