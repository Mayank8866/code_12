import java.util.*;
public class Assibnment2_6 {
    public static void main(String []args){
        
        java.util.Scanner sc= new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int arr[]=new int[n];//{1,4,3,2};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        kamL(arr,t);
      
     
           
     
    }
    public  static void kamL(int[] arr,int t){
       int sum=0;
         for (int i = 0; i < arr.length; i++) {
            if(arr[i]==t){
                sum=i;
                break;
            }
         }
        System.out.println(sum);
    }
    
}
