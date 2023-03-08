package org.example.chapter1;

/*
1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
The palindrome does not need to be limited to just dictionary words.

EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)

# 106.
You do not have to-and should not-generate all permutations. This would be very inefficient.

#121.
What characteristics would a string that is a permutation of a palindrome have?

#134.
Have you tried a hash table? You should be able to get this down to 0(N) time.

#136.
Can you reduce the space usage by using a bit vector?

 */

import java.util.HashMap;
import java.util.Map;

public class c1n4 {
    /*
    time complexity :   O(n)
    space complexity :  O(n)
     */
    static Boolean isPalindromePermutation(String str) {
        System.out.println("isPalindromePermutation(" + str + ")");
        char[] strArray = str.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            Character charName = Character.toLowerCase(strArray[i]);
            if (charName == ' ') continue;
            Integer count = charMap.get(charName);
            if (count == null) {
                charMap.put(charName, 1);
            } else {
                charMap.put(charName, count + 1);
            }
        }

        int oddCharCount = 0;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddCharCount += 1;
            }
        }

        return oddCharCount <= 1;
    }
}
