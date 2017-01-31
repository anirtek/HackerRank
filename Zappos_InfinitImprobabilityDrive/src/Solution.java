
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
 * Complete the function below.
     */

    static String improbabilityCalculator(String coordinates, int remove) {
        
        String str = null;
        if(remove > 0 && remove <= coordinates.length()) {
            str = coordinates.substring(remove-1, coordinates.length()-1);
        }
        if(remove > coordinates.length()){
            str = "0";
        }
        if (remove == 0)
            str = coordinates;
        return str;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _coordinates;
        try {
            _coordinates = in.nextLine();
        } catch (Exception e) {
            _coordinates = null;
        }

        int _remove;
        _remove = Integer.parseInt(in.nextLine().trim());

        res = improbabilityCalculator(_coordinates, _remove);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}
