
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /**
     * Complete the function below.
     */
    static void StairCase(int n) {
        int spaceCount = n - 1;
        for (int i = 1; i <= n; i++, spaceCount--) {
            /* printing spaces as per the requirement */ 
            if (i + spaceCount == n) {
                for (int j = 1; j <= spaceCount; j++) {
                    System.out.print(" ");
                }
            }
            int j = i;
            while(j > 0){
                System.out.print("#");
                j--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        StairCase(_n);

    }
}
