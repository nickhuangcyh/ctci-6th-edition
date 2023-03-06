package org.example.chapter1;

/*
1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
Hints: #44, #117, #132

## 44.
Try a hash table.

## 117.
Could a bit vector be useful?

## 132.
Can you solve it in O(N log N) time? What might a solution like that look like?
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c1n1 {
    public static void main(String[] args) {

        List<String> testStrings = new ArrayList() {{
            add("abcdefghijklmnopqrstuvwxyz");
            add("abcdeef");
        }};
        for (Integer i = 0; i < testStrings.size(); i++) {
            String testString = testStrings.get(i);
            System.out.println("[Output] " + isUniqueChars(testString));
            System.out.println("------------------------------");
            System.out.println();
        }
    }

    /*
    time complexity :   O(n)
    space complexity :  O(n)
     */
    static Boolean isUniqueChars(String str) {
        System.out.println("isUniqueChars(" + str + ")");

        Map<Character, Boolean> charMap = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            Boolean hasAlphabet = charMap.get(str.charAt(i));
            if (hasAlphabet != null) {
                return false;
            }
            charMap.put(str.charAt(i), true);
        }

        return true;
    }
}
