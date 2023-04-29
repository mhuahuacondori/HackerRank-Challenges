package com.hacker.rank.practice.maximumindex;

/**
 *
 * @author mhuahuacondori
 */
public class Result {

    /*
    * There is an infinite array of integers numbered consecutively from 0. At each step, a pointer can move from
    * index i to index i + j, or remain where it is. The value of i begins at 0. The value of j begins at 1 and at each
    * step, j increments by 1. There is one known index that must be avoided. Determine the highest index that
    * can be reached in a given number of steps.
    *
    *
    * 
    * Complete the 'maxIndex' function below.    
    *    
    * The function is expected to return an INTEGER.    
    * The function accepts following parameters:    
    * 1. INTEGER steps    
    * 2. INTEGER badIndex    
     */
    public static int maxIndex(int steps, int badIndex) {
        // Write your code here
        int i = 0;
        int j = 1;
        for (int k = 0; k < steps; k++) {
            if (i + j == badIndex) {
                i -= 1;
            }
            i += j;
            j += 1;
        }
        return i;
    }
}
