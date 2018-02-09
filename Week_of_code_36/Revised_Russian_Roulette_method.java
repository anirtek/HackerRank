import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] revisedRussianRoulette(int[] doors) {
        int minOps = 0;
        int maxOps = 0;
        for(int i = 0; i < doors.length; i++) {
            if(doors[i] == 1) {
                maxOps += 1;
            }
        }
        for(int i = 0; i < doors.length; i++) {
            if(doors[i] == 1) {
                doors[i] = 0;
                if(i+1 < doors.length)
                    doors[i+1] = 0;
                minOps += 1;
            }
        }
        //System.out.println(minOps + " " + maxOps);
        int[] result = {minOps, maxOps};
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
