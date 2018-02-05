import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int date1 = in.nextInt();
        int month1 = in.nextInt();
        int year1 = in.nextInt();
        int date2 = in.nextInt();
        int month2 = in.nextInt();
        int year2 = in.nextInt();

        int fine = 0;

        int yearsDifference, monthsDifference, datesDifference = 0;


        if(year1 <= year2) {
            if(month1 <= month2) {
                if(date1 <= date2) {
                    fine = 0;
                } else if(date1 > date2) {
                    fine += (date1 - date2) * 15;
                }
            } else if(month1 > month2) {
                fine += (month1 - month2) * 500;
                if(date1 > date2) {
                    fine += (getNumberOfDays(year1, year2, month1, month2, date1, date2)) * 15;
                }
            }
        } else if(year1 > year2) {
            fine += 10000;
            fine += (getNumberOfDays(year1, year2, month1, month2, date1, date2)) * 15 + (getNumberOfMonths(month1, month2)) * 500;
        }

        System.out.println(fine);

    }
    public static int getNumberOfDays(int y1, int y2, int m1, int m2, int d1, int d2) {
        int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int actualDays = days[m1] - d1;
        int totalDays = 0;
        for(; m2 <= 12; m2++) {
            if(m2 == 2 && isYearLeap(y2)) {
                totalDays += days[m2] + 1;
            } else if(m2 == 2) {
                totalDays += days[m2];
            } else {
                totalDays += days[m2];
            }
        }
        for(int i = 1; i <= m1; m1++) {
            if(i == 2 && isYearLeap(y2)) {
                totalDays += days[i] + 1;
            } else if(i == 2) {
                totalDays += days[i];
            } else {
                totalDays += days[i];
            }
        }
        return totalDays - d2 - 1 - actualDays;
    }
    public static boolean isYearLeap(int year) {
        if(year % 4 == 0) 
            if(year % 100 == 0)
                if(year % 400 == 0) 
                    return true;
        return false;
    }
    public static int getNumberOfMonths(int m1, int m2) {
        int totalMonths = 0;
        for(; m2 <= 12; m2++)
            totalMonths += 1;
        for(int i = 1; i <= m1; i++) 
            totalMonths += 1;
        return totalMonths;
    }
}
