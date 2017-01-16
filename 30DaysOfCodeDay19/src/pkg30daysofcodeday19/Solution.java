package pkg30daysofcodeday19;

import java.util.Scanner;

/**
 * HackerRank Coding of 30 days : Day 14 : 'Scope' program code
 *
 * @author anirtek
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {

    private int[] elements;
    public int maximumDifference;
    
    Difference(int [] a){
        this.elements = a;
    }

    void computeDifference() {
        int min = elements[0];
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if(max <= elements[i]) max = elements[i];
            if(min >= elements[i]) min = elements[i];
        }
//        System.out.println("MAX : "+max);
//        System.out.println("MIN : "+min);
        
        maximumDifference = Math.abs(max - min);
    }
    
    
}
