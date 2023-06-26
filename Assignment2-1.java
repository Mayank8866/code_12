import java.util.*;
public class  Assignment2-1{
    public static void main(String []args){
        int arr[]=new int[5];//{1,4,3,2};
        java.util.Scanner sc= new java.util.Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        kamL(arr);        
     
    }
    public  static void kamL(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
    
}
