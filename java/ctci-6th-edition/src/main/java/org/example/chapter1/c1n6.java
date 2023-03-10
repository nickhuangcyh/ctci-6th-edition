package org.example.chapter1;

/*
1.6 String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the
original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

# 92.
Do the easy thing first. Compress the string, then compare the lengths.

# 110.
Be careful that you aren't repeatedly concatenating strings together. This can be very inefficient.
 */
public class c1n6 {

    /*
    time complexity :   O(n)
    space complexity :  O(n)
     */
    static String stringCompression(String str) {
        StringBuilder compressedStr = new StringBuilder();
        char recordChar = 0;
        int recordCharCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == recordChar) {
                recordCharCount += 1;
            } else {
                if (recordChar != 0) {
                    compressedStr.append(recordChar);
                    compressedStr.append(recordCharCount);
                }
                recordChar = currentChar;
                recordCharCount = 1;
            }
            if (i == str.length() - 1) {
                compressedStr.append(recordChar);
                compressedStr.append(recordCharCount);
            }
        }

        return str.length() < compressedStr.length() ? str : compressedStr.toString();
    }
}
