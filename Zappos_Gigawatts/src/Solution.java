
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
 * Complete the function below.
     */
    static boolean GigawattPower(int[] batteryOne, int[] batteryTwo, int gigawattTarget) {
        boolean target = false;
        int batteryOne_Max = 0;
        for (int i = 0; i < batteryOne.length; i++) {
            batteryOne_Max = Math.max(batteryOne[i], batteryOne_Max);
        }
        int need = gigawattTarget - batteryOne_Max;
        for (int i = 0; i < batteryOne.length; i++) {
            if (batteryTwo[i] == need) {
                target = true;
                break;
            }
        }
        return target;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        boolean res;

        int _batteryOne_size = 0;
        _batteryOne_size = Integer.parseInt(in.nextLine().trim());
        int[] _batteryOne = new int[_batteryOne_size];
        int _batteryOne_item;
        for (int _batteryOne_i = 0; _batteryOne_i < _batteryOne_size; _batteryOne_i++) {
            _batteryOne_item = Integer.parseInt(in.nextLine().trim());
            _batteryOne[_batteryOne_i] = _batteryOne_item;
        }

        int _batteryTwo_size = 0;
        _batteryTwo_size = Integer.parseInt(in.nextLine().trim());
        int[] _batteryTwo = new int[_batteryTwo_size];
        int _batteryTwo_item;
        for (int _batteryTwo_i = 0; _batteryTwo_i < _batteryTwo_size; _batteryTwo_i++) {
            _batteryTwo_item = Integer.parseInt(in.nextLine().trim());
            _batteryTwo[_batteryTwo_i] = _batteryTwo_item;
        }

        int _gigawattTarget;
        _gigawattTarget = Integer.parseInt(in.nextLine().trim());

        res = GigawattPower(_batteryOne, _batteryTwo, _gigawattTarget);
        bw.write(String.valueOf(res ? 1 : 0));
        bw.newLine();

        bw.close();
    }
}
