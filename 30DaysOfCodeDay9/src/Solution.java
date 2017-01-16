import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(fact(n));
        }
    }
    static int fact(int n){
        if(n==1 || n==0)
            return 1;
        else return n*fact(n-1);
    }
}