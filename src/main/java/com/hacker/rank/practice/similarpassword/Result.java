package com.hacker.rank.practice.similarpassword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mhuahuacondori
 */
public class Result {
    
    /*
    * A password detection system for HackerRank accounts detects a password as similar if the number of
    * vowels is equal to the number of consonants in the password.
    * Passwords consist of lowercase English characters only, and vowels are ('a', 'e', 'i', 'o', 'u').
    * To check the strength of a password and how easily it can be hacked, some manipulations can be made to
    * the password. In one operation, any character of the string can either be incremented or decremented. For
    * example, 'f' can be incremented to 'g', or decremented to 'e'. Note that character 'a' cannot be decremented
    * and 'z' cannot be incremented.
    * Find the minimum number of operations in which the password can be made similar.
    *
    *
    *
    * Complete the 'countMinimumOperations' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts STRING password as parameter.
    */

    public static int countMinimumOperations(String password) {
        // Write your code here
        int n = password.length();
        int v = 0;
        int c = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        List<Integer> ops = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if (new String(vowels).indexOf(ch) != -1) {
                v += 1;
            } else {
                int mn = 26;
                c += 1;
                for (char vowel : vowels) {
                    mn = Math.min(mn, Math.abs(ch - vowel));
                }
                ops.add(mn);
            }
        }
        if (v >= c) {
            return (v - c) / 2;
        }
        Collections.sort(ops);
        int num_chars = (c - v) / 2;
        return ops.subList(0, num_chars).stream().mapToInt(Integer::intValue).sum();
    }
}
