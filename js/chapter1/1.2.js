/*
**
1.2 Check Permutation: Given two strings,write a method to decide if one is a permutation of the
other.

# 1.
Describe what it means for two strings to be permutations of each other. Now, look at that definition you provided. Can you check the strings against that definition?

# 84.
There is one solution that is 0(N log N) time. Another solution uses some space, but isO(N) time.

# 122.
Could a hash table be useful?

# 131.
Two strings that are permutations should have the same characters, but in different orders. Can you make the orders the same?

*/

/* 
** Using hash map to record the char count
time complexity :   O(n+m+(m or n)) = O(3n) = O(n) 
space complexity :  O((m or n)) = O(n) = O(n)
*/
function isPermutation(str1, str2) {
  console.log("isPermutation()");
  console.log("[Input]");
  console.log("str1 : " + str1);
  console.log("str2 : " + str2);

  if (str1.length != str2.length) {
    return false;
  }

  let countMap = {};
  for (let i = 0; i < str1.length; i++) {
    if (countMap[str1[i]] == null) {
      countMap[str1[i]] = 1;
    } else {
      countMap[str1[i]] += 1;
    }
  }

  for (let i = 0; i < str2.length; i++) {
    countMap[str2[i]] -= 1;
  }

  for (let char in countMap) {
    if (countMap[char] != 0) {
      return false;
    }
  }

  return true;
}

console.log(isPermutation("abcde", "cbdae"));
console.log(isPermutation("abcdef", "cbdaefg"));
console.log(isPermutation("abcdefg", "cbdaef"));
console.log(isPermutation("abdef", "cbdae"));

/*
** Sort first before comparing
time complexity :   O(n+m+(m or n)) = O(3n) = O(n) 
space complexity :  O((m or n)) = O(n) = O(n)
*/

function isPermutation2(str1, str2) {
  console.log("isPermutation2()");
  console.log("[Input]");
  console.log("str1 : " + str1);
  console.log("str2 : " + str2);

  let sortedStr1 = str1.split("").sort().join("");
  let sortedStr2 = str2.split("").sort().join("");

  if (sortedStr1 === sortedStr2) {
    return true;
  }

  return false;
}

console.log(isPermutation2("abcde", "cbdae"));
console.log(isPermutation2("abcdef", "cbdaefg"));
console.log(isPermutation2("abcdefg", "cbdaef"));
console.log(isPermutation2("abdef", "cbdae"));
