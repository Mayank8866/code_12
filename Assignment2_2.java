import java.util.*;
public class Assignment2_2 { 
    
      public static int distributeCandies(int[] k) { 
        int[] count = new int[100];
        for (int k2 : k) {
          count[k2]++;
        } 
        int  nUc = 0;
        for (int i = 0; i < count.length; i++) {
          if (count[i] > 0) {
             nUc++;
          }
        }
        int halfLength = k.length / 2; 
        if (nUc<= halfLength) {
          return nUc;
        } else {
          return halfLength;
        }
      }
    
      public static void main(String[] args) {
        int[] k = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(k));
      }
    }
