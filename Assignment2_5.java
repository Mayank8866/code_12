import java.util.*;
public class Assignment2_5{
    public static void main(String []args){
        
        java.util.Scanner sc= new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];//{1,4,3,2};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        kamL(arr);
      
     
           
     
    }
    public  static void kamL(int[] arr){
       int sum=1;
         for (int i = 0; i < arr.length; i++) {
            sum*=arr[i];
         }
        System.out.println(sum);
    }
    
}
