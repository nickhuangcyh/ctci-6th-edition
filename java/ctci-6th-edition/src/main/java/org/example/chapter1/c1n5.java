package org.example.chapter1;

/*
1.5 One Away: There are three types of edits that can be performed on strings: insert a character, remove a character,
or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false

# 23.
Start with the easy thing. Can you check each of the conditions separately?

# 97.
What is the relationship between the "insert character" option and the "remove character" option? Do these need to be
 two separate checks?

# 130.
Can you do all three checks in a single pass?

 */

public class c1n5 {

    /*
    time complexity :   O(n)
    space complexity :  O(1)
     */
    static boolean isInsertOrRemoveOrReplaceOrNothingWay(String str1, String str2) {

        if (str1.length() == str2.length()) {
            return isOneEditReplace(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return isOneEditInsert(str1, str2);
        } else if (str1.length() - 1 == str2.length()) {
            return isOneEditRemove(str1, str2);
        } else {
            return false;
        }
    }

    static boolean isOneEditInsert(String str1, String str2) {
        var index1 = 0;
        var index2 = 0;
        var isFoundDifference = false;

        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) == str2.charAt(index2)) {
                index1 += 1;
                index2 += 1;
            } else {
                if (isFoundDifference) {
                    return false;
                }
                isFoundDifference = true;
                index2 += 1;
            }
        }

        return true;
    }

    static boolean isOneEditRemove(String str1, String str2) {
        return isOneEditInsert(str2, str1);
    }

    static boolean isOneEditReplace(String str1, String str2) {
        boolean isFoundDifference = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (isFoundDifference) {
                    return false;
                }
                isFoundDifference = true;
            }
        }
        return isFoundDifference;
    }

    static boolean isInsertOrRemoveOrReplaceOrNothingWayInSinglePass(String str1, String str2) {
        boolean isFoundDifference = false;
        String shorterStr = str1.length() < str2.length() ? str1 : str2;
        String longerStr = str1.length() < str2.length() ? str2 : str1;

        int longerStrIndex = 0;
        int shorterIndex = 0;
        while (longerStrIndex < longerStr.length() && shorterIndex < shorterStr.length()) {
            if (longerStr.charAt(longerStrIndex) != shorterStr.charAt(shorterIndex)) {
                if (isFoundDifference) {
                    return false;
                }
                isFoundDifference = true;
                if (longerStr.length() != shorterStr.length()) {
                    longerStrIndex += 1;
                } else  {
                    longerStrIndex += 1;
                    shorterIndex += 1;
                }
            } else {
                longerStrIndex += 1;
                shorterIndex += 1;
            }
        }
        return true;
    }
}
