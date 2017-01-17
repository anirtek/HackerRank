package arrayleftrotation;

import java.util.Scanner;

public class Solution {

    public static void arrayLeftRotation(int[] a, int d, int n) {
        int i, j, k, temp;
        for(i=0; i< gcd(d, n); i++){
            temp = a[i];
            j = i;
            while(true){
                k = j+d;
                if(k >= n)
                    k = k - n;
                if(k == i)
                    break;
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
      
        arrayLeftRotation(a, d, n);
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
      
        System.out.println();
      
    }

    private static int gcd(int d, int n) {
        if(n==0)
            return d;
        else
            return gcd(n, d%n);
    }
}
