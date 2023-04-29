package com.hacker.rank.practice.extraordinarysubstrings;

/**
 *
 * @author mhuahuacondori
 */
public class Result {

    /*
    * Each character of the lowercase English alphabet has been mapped to digits as shown in the figure. The
    * numerical value corresponding to each letter is its mapped value.
    *
    * a, b → 1 ; c, d, e → 2 ; f, g, h → 3 ; i, j, k → 4 ;l, m, n → 5 ;
    * o, p, q → 6 ;r, s, t → 7 ; u, v, w → 8 ; x, y, z → 9.
    *
    * An extraordinary substring is one whose sum of the mapped values of each letter is divisible by its length.
    * Given string input_str, count its total number of non-empty extraordinary substrings.
    * 
    *
    *
    * Complete the 'countSubstrings' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts STRING input_str as parameter.
    */ 

    public static int countSubstrings(String input_str) {
        int n = input_str.length();
        //almacenar los valores asignados para todas las letras minúsculas en una matriz
        int[] val = new int[26];
        int x = 1;
        for (int i = 0; i < 26; i++) {
            //el valor asignado es el mismo para cada 3 caracteres excepto para 1
            if ((i + 1) % 3 == 0) {
                x += 1;
            }
            val[i] += x;
        }
        //precalcular y almacenar los valores asignados como suma de prefijos
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = val[input_str.charAt(i - 1) - 'a'];
            arr[i] += arr[i - 1];
        }
        //contar el número de subcadenas extraordinarias
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if ((arr[j] - arr[i]) % (j - i) == 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

}
