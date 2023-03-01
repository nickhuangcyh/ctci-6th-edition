/*
** 
1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
Hints: #44, #117, #132

## 44.
Try a hash table.

## 117.
Could a bit vector be useful?

## 132.
Can you solve it in O(N log N) time? What might a solution like that look like?

*/

function isUniqueChars(str) {
  console.log("[Input] " + str);
  let charsMap = {};

  for (let i = 0; i < str.length; i++) {
    if (charsMap[str[i]] != null) {
      return false;
    }
    charsMap[str[i]] = true;
  }

  return true;
}

let testStrings = ["abcdefghijklmnopqrstuvwxyz", "abcdeef"];
for (const testString of testStrings) {
  let result = isUniqueChars(testString);
  console.log("[Result]");
  console.log(result);
}
