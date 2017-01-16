import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();                       //input read done
        String nBinary = Integer.toBinaryString(n); //input converted to binary but in 'String' form
        char[] nCharacter = nBinary.toCharArray();
//        System.out.println(nArray.length);
        System.out.println(nBinary);
        long total = 0;
        long result = 0;
        for (int i = 0; i < nCharacter.length; i++) {
            if(nCharacter[i] == '1'){
                total = total + 1;
                result = Math.max(total, result);
            }
            if(nCharacter[i] == '0') {
                total = 0;
                result = Math.max(total, result);
            }
        }
        System.out.println(result);
    }
}
