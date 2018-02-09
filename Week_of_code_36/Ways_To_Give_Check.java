import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int knight(char [][]board, int pi, int pj, int ki, int kj) {
        if(pi-1 == ki && pj-2 == kj) {
            return 1;
        } else if(pi-1 == ki && pj+2 == kj) {
            return 1;
        } else if(pi-2 == ki && pj-1 == kj) {
            return 1;
        } else if(pi-2 == ki && pj+1 == kj) {
            return 1;
        } else {
            return 0;
        }
    }
    
    static int bishop(char [][]board, int pi, int pj, int ki, int kj) {
        int iDiff = ki - pi;
        if(pj - iDiff == kj) {
            return 1;
        } else if(pj + iDiff == kj) {
            return 1;
        } else {
            return 0;
        }
    }

    static int rook(char [][]board, int pi, int pj, int ki, int kj) {
        if(pj == kj && pi != ki){ 
            return 1;
        } else if(pi == ki && pj != kj){
            return 1;
        } else {
            return 0;
        }
    }
    
    static int queen(char [][]board, int pi, int pj, int ki, int kj) {
        int num = rook(board, pi, pj, ki, kj);
        if(num == 0) {
            num = bishop(board, pi, pj, ki, kj);
        }
        return num;
    }


    static int waysToGiveACheck(char[][] board) {
        int kiPos = 0;
        int kjPos = 0;
        int piPos = 0;
        int pjPos = 0;
        int numOfChecks = 0;
        
        /* Find the positions of 'P' and 'k' */
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
               if('P' == board[i][j]) {
                   piPos = i;
                   pjPos = j;
               } 
               if('k' == board[i][j]) {
                   kiPos = i;
                   kjPos = j;
               }
            }
        }
        
        int piPromoted = piPos + 1;
        //System.out.println("P promoted at : " + piPromoted + ", " + pjPos);
        //System.out.println("k found at : " + kiPos + ", " + kjPos);
        numOfChecks += knight(board, piPromoted, pjPos, kiPos, kjPos);
        //System.out.println("From knight = " + numOfChecks);
        numOfChecks += queen(board, piPromoted, pjPos, kiPos, kjPos);
        //System.out.println("From queen = " + numOfChecks);
        numOfChecks += bishop(board, piPromoted, pjPos, kiPos, kjPos);
        //System.out.println("From bishop = " + numOfChecks);
        numOfChecks += rook(board, piPromoted, pjPos, kiPos, kjPos);
        //System.out.println("From rook = " + numOfChecks);
        
        return numOfChecks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            char[][] board = new char[8][8];
            for(int i = 7; i >= 0; i--){
                String str = in.next();
                char[] chars = str.toCharArray();
                for(int j = 0; j < chars.length; j++) {
                    board[i][j] = chars[j];
                }
            }
            int result = waysToGiveACheck(board);
            System.out.println(result);
        }
        in.close();
    }
}
