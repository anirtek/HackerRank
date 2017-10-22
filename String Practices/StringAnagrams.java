
import java.util.HashMap;
import java.util.Scanner;

public class StringAnagrams {

    public static boolean areStringsAnagrams(String first, String second) {
        boolean result = true;
        HashMap<Character, Integer> fMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();

        /**
         * The fMap will contain separate count of each character in the first
         * string
         */
        for (int i = 0; i < first.length(); i++) {
            Integer count = fMap.get(first.charAt(i));
            if (count == null) {
                fMap.put(first.charAt(i), 1);
            } else {
                fMap.put(first.charAt(i), count + 1);
            }
        }
        
        for (HashMap.Entry<Character, Integer> entry : fMap.entrySet()) {
            System.out.println("Key = " + entry.getKey()+" Count = "+ entry.getValue());
        }

        /**
         * The sMap will contain separate count of each character in the second
         * string
         */
        for (int i = 0; i < second.length(); i++) {
            Integer count = sMap.get(second.charAt(i));
            if (count == null) {
                sMap.put(second.charAt(i), 1);
            } else {
                sMap.put(second.charAt(i), count + 1);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : sMap.entrySet()) {
            System.out.println("Key = " + entry.getKey()+" Count = "+ entry.getValue());
        }
        
        /**
         * Compare both fMap and sMap; if count differs anywhere; set "result =
         * false" and return the flag. It means strings are not anagrams
         * Otherwise, they are anagrams.
         */
        if (fMap.size() == sMap.size()) {
            for (HashMap.Entry<Character, Integer> entry : fMap.entrySet()) {
                if(sMap.containsKey(entry.getKey())) {
                    if(entry.getValue().equals(sMap.get(entry.getKey()))) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();

        boolean status = areStringsAnagrams(first, second);
        if(status) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

    }

}
