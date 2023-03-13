package org.example.chapter1;

public class c1n9 {

    /*
    time complexity :   O(n)
    space complexity :  O(1)
     */
    static boolean isARotationSubstring(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            return isSubstring(s2 + s2, s1);
        }
        return false;
    }

    static boolean isSubstring(String str1, String str2) {
        return str1.contains(str2);
    }
}
