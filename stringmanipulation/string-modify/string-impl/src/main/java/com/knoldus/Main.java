package com.knoldus;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringFunction sf = new StringFunction();

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the string");

        String inputString = scan.nextLine();

        System.out.println("reversed String : " + sf.reverseString(inputString));

        System.out.println("length of the String : " + sf.getStringLength(inputString));

    }
}