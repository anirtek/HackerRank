/**
 * Write an efficient java code to return maximum occurring character in the 
 * input string e.g., if input string is “test” then function should return ‘t’.
 *
 * Following program takes O(n) space and O(1) time complexities */

import java.util.*;

public class MaxOccuringCharacter {

    public static char getMaximumOccuringChar(String S) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] ch = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            Integer count = charMap.get(S.charAt(i));
            if(count == null ) {
                charMap.put(S.charAt(i), 1);
            } else if(count >= 1){
                charMap.put(S.charAt(i), count + 1);
            }
        }

        Integer maxCharacterCount = charMap.get(S.charAt(0));
        Character resultChar = S.charAt(0);
        for (HashMap.Entry<Character, Integer> entry : charMap.entrySet()) {
            if(maxCharacterCount < entry.getValue()) {
                maxCharacterCount = entry.getValue();
                resultChar = entry.getKey();
            }
        }
        return resultChar;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        Character ch = getMaximumOccuringChar(S);
        System.out.println("Maximum Occuring Character is \"" + ch + "\"");

    }

}
