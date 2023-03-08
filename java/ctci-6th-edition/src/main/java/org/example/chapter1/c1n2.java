package org.example.chapter1;

/*
1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.

# 1.
Describe what it means for two strings to be permutations of each other. Now, look at that definition you provided. Can you check the strings against that definition?

# 84.
There is one solution that is 0(N log N) time. Another solution uses some space, but is O(N) time.

# 122.
Could a hash table be useful?

# 131.
Two strings that are permutations should have the same characters, but in different orders. Can you make the orders the same?
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class c1n2 {
    /*
    ** Using hash map to record the char count
    time complexity :   O(n+m+(m or n)) = O(3n) = O(n)
    space complexity :  O(n or m) = O(n)
     */
    static Boolean isPermutation(String str1, String str2) {
        System.out.println("isPermutation(" + str1 + ", " + str2 + ")");

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charMap = new HashMap();
        for (int i = 0; i < str1.length(); i++) {
            Integer alphabetCount = charMap.get(str1.charAt(i));
            if (alphabetCount == null) {
                charMap.put(str1.charAt(i), 1);
            } else {
                charMap.put(str1.charAt(i), alphabetCount + 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            Integer alphabetCount = charMap.get(str2.charAt(i));
            if (alphabetCount == null) {
                charMap.put(str2.charAt(i), -1);
            } else {
                charMap.put(str2.charAt(i), alphabetCount - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    /*
    ** Sort first before comparing
    time complexity :   O(nlogn)
    space complexity :  O(1)
     */
    static Boolean isPermutation2(String str1, String str2) {
        System.out.println("isPermutation2(" + str1 + ", " + str2 + ")");
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        return Arrays.equals(str1Array, str2Array);
    }
}
