package org.example.chapter1;

import java.util.ArrayList;
import java.util.Arrays;

/*
1.3 URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: if
implementing in Java, please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13
Output: "Mr%20John%20Smith"

# 53.
It's often easiest to modify strings by going from the end of the string to the beginning.

# 118.
You might find you need to know the number of spaces. Can you just count them?

 */
public class c1n3 {
    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith ".toCharArray(), 13));
        System.out.println(urlify("Mr Nick Huang is a man who live in Taipei".toCharArray(), 23));
    }

    /*
    time complexity :   O(n)
    space complexity :  O(n)
     */
    static char[] urlify(char[] str, int trueLength) {
        System.out.println("urlify(" + str + ", " + trueLength + ")");
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount += 1;
            }
        }
        int urlifyStrLength = trueLength - spaceCount + 3 * spaceCount;
        char[] urlifyStr = new char[urlifyStrLength];

        int index = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                urlifyStr[index] = '%';
                urlifyStr[index + 1] = '2';
                urlifyStr[index + 2] = '0';
                index += 3;
            } else {
                urlifyStr[index] = str[i];
                index += 1;
            }
        }
        return urlifyStr;
    }
}
