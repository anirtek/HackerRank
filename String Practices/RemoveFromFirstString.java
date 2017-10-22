
import java.util.HashMap;
import java.util.Scanner;

/**
 * Remove characters from the first string which are present in the second string
 * Write an efficient C function that takes two strings as arguments and removes the
 * characters from first string which are present in second string (mask string).
 * 
 * My algorithm takes : O(n) time complexity with O(n) space complexity due to hashMap 
 */

public class RemoveFromFirstString {
    public static String getModifiedString(String first, String second) {
        HashMap<Character, Boolean> firstMap = new HashMap<Character, Boolean>();
        /**
         * Put entire first in the HashMap
         */
        for (int i = 0; i < first.length(); i++) {
            firstMap.put(first.charAt(i), Boolean.TRUE);
        }
        /**
         * Check if second string's characters are present in the first string's HashMap
         * If they are, remove them from the map of first string
         */
        for (int i = 0; i < second.length(); i++) {
            if(firstMap.containsKey(second.charAt(i)))
                firstMap.remove(second.charAt(i));
        }
        /**
         * Modify the first string and return it.
         */
        String result = "";
        for(HashMap.Entry<Character, Boolean> entry : firstMap.entrySet()) {
            result = result.concat(Character.toString(entry.getKey()));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println("First string after removing elements of second : "+ getModifiedString(first, second));
        
    }
}
