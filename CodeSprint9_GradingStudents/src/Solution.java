
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int grade = in.nextInt();
            if (grade < 38) {
                System.out.println(grade);
            } else {
                int quotient = getNextMultipleof5(grade);
                //System.out.println("quot : "+quotient);
                if(quotient*5 - grade < 3){
                    System.out.println(quotient*5);
                } else {
                    System.out.println(grade);
                }
            }
        }
    }

    static int getNextMultipleof5(int dividend) {
        int q = dividend / 5;
        //System.out.println(q);
        return (q + 1);
    }
}
