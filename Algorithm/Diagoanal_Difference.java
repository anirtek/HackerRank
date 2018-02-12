import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int pd = 0;
        int sd = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j)
                    pd = pd + a[a_i][a_j];
            }
        }
        for(int i=0, j=n-1; i < n && j >= 0; i++, j--){
             sd = sd + a[i][j];
        }
        System.out.println(Math.abs(pd - sd));
    }
}
