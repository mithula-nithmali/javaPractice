package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int input1 = 6;
        int input2 = 13;
        int input3 = 1;
        int large = 0;
        if (input1 > input2 && input1 > input3) {
            large = input1;
        } else if (input2 > input1 && input2 > input3) {
            large = input2;
        } else if (input3 > input1 && input3 > input2) {
            large = input3;
        }

        System.out.print(large);


    }
}