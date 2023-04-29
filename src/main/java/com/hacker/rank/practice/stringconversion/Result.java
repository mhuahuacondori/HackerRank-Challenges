package com.hacker.rank.practice.stringconversion;

/**
 *
 * @author mhuahuacondori
 */
public class Result {
    
    /*
    * Given a binary string consisting of characters '0's and '1', the following operation can be performed on it:
    *
    * Choose two adjacent characters, and replace both the characters with their bitwise XOR value. For
    * example, if binaryStr = "1100" and the first two characters are chosen, then after one operation, the
    * string becomes binaryStr = "0000".
    *
    * The goal is to find the minimum number of operations needed to convert all characters of the string to '0'.
    *
    *
    *
    * Complete the 'getMinimumOperations' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts STRING binaryStr as parameter.
    */

    public static int getMinimumOperations(String binaryStr) {
        // Write your code here
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            char elem = binaryStr.charAt(i);
            if (elem == '1') {
                cnt += 1;
            } else {
                ans += cnt / 2 + (cnt % 2 == 0 ? 0 : 2);
                cnt = 0;
            }
        }
        ans += cnt / 2 + (cnt % 2 == 0 ? 0 : 2);
        return ans;
    }

}
