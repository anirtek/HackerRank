import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine(); 
        boolean result = isStringUnique(input);
        if(isStringUnique(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    static boolean isStringUnique(String s) {
        String str = s.replaceAll("\\s+", "");
        boolean[] char_set = new boolean[256];
        int val = 0;
        for(int i = 0; i < str.length(); i++) {
            val = (int)str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;        
    }
}

