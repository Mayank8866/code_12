public class D {
    public static int findUniqueChars(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int k=-1;
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                 k=i;
                 break;
            }
            
        }
        return k;
    }
    
    public static void main(String[] args) {
      //  String s = "loveleetcode";
      //String s = "kamleshhh";
      java.util.Scanner sc=new java.util.Scanner(System.in);
      String s=sc.nextLine();
      sc.close();

       System.out.println(findUniqueChars(s));
    }
}
