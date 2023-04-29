package com.hacker.rank.practice.passwordsecurity;

/**
 *
 * @author mhuahuacondori
 */
public class Result {

    /*
    * A password string, pwd, consists of binary characters (0s and 1s). A cyber security expert is trying to
    * determine the minimum number of changes required to make the password secure. To do so, it must be
    * divided into substrings of non-overlapping, even length substrings. Each substring can only contain 1s or
    * 0s, not a mix. This helps to ensure that the password is strong and less vulnerable to hacking attacks.
    *
    * Find the minimum number of characters that must be flipped in the password string, i.e. changed from 0 to
    * 1 or 1 to 0 to allow the string to be divided as described.
    * Note: A substring is a contiguous sequence of characters in a string.
     */


    public static int getMinFlips(String pwd) {
        int n = pwd.length();
        int cur = 0;
        int ans = 0;
        int i = 1;
        while (i < n) {
            if (pwd.charAt(i) == pwd.charAt(i - 1)) {
                cur++;
            } else {
                if (cur % 2 == 0) {
                    ans++;
                    i++;
                }                
                cur = 0;
            }
            i++;
        }
        return ans;
    }

}
