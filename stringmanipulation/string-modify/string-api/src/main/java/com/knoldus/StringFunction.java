package com.knoldus;

public class StringFunction {

    //function for reverse a string
    String reverseString(String inputString) {
        String reverseString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString += inputString.charAt(i);
        }

        return reverseString;
    }


    //function for get the length of the string
    int getStringLength(String inputString) {
        int stringLength = 0;

        for (int i = 0; i <= inputString.length(); i++) {
            stringLength++;
        }

        return stringLength;
    }

}