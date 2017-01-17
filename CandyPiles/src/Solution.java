
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int min = findMinimum(c);
//        System.out.println("min : "+min);
        int count = getCount(c, min);
        //System.out.println("count : "+count);
        int maxHappFactor = 2 * min;
        if (count > 1) {
            System.out.println(min + " " + count);
        } else {
            System.out.println(maxHappFactor + " " + count);
        }

    }

    private static int findMinimum(int[] c) {
        int min = c[0];
        for (int i = 0; i < c.length; i++) {
            if (min >= c[i]) {
                min = c[i];
            }
        }
        return min;
    }

    private static int getCount(int[] c, int min) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (min == c[i]) {
                count++;
            }
        }
        return count;
    }

}

/**
 * 1. Find Min
 * 2. Count duplicates of min; if any
 * 3. double the min
 * 4. if duplicate > 1 then print min
 * 5. else print double and duplicate
 */
