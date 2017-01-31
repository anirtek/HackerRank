
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String reverseButPreserveWhitespace(String initialMessage) {
        String reverseMessage = "";
        String str;
        String reverseStr;
        int fIndex = 0;
        int lastIndex;
        for (int i = 0; i < initialMessage.length(); i++) {
            if (Character.isWhitespace(initialMessage.charAt(i))) {
                lastIndex = i - 1;
                str = initialMessage.substring(fIndex, lastIndex+1);
                reverseStr = getReverse(str);
                reverseMessage = reverseMessage + reverseStr + initialMessage.charAt(i);
                fIndex = i + 1;
            }
            if(i == initialMessage.length()-1){
//                System.out.println(initialMessage.substring(fIndex, i+1));
                str = initialMessage.substring(fIndex, i+1);
                str = str.substring(0, str.length()-1);
                reverseStr = getReverse(str);
                reverseMessage = reverseMessage + reverseStr + initialMessage.charAt(i);
            }
        }
        return reverseMessage;
    }

    private static String getReverse(String str) {
        String reverse = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String res;
        String _reverseMe;
        try {
            _reverseMe = in.nextLine();
        } catch (Exception e) {
            _reverseMe = null;
        }

        res = reverseButPreserveWhitespace(_reverseMe);
        System.out.println(res);;
    }
}
