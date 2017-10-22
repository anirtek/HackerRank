
import java.util.Scanner;
import java.util.HashMap;


/**
 * Remove all duplicates from a given string
 */
public class RemoveDuplicates {

    public static String removeDuplicates(String S) {
        HashMap<Character, Boolean> stringMap = new HashMap<Character, Boolean>();
        for (int i = 0; i < S.length(); i++) {
            stringMap.putIfAbsent(S.charAt(i), Boolean.TRUE);
        }
        String result = "";
        for(HashMap.Entry<Character, Boolean> entry : stringMap.entrySet()) {
            result = result.concat(Character.toString(entry.getKey()));
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println("The string after removing deuplicates : " + removeDuplicates(S));
        
    }

}
