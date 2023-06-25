class Find{
    public static void main(String[] args){
        int a[]={0,1,0,3,12};

        int min=a[0]; int j=a.length-1;   int i;
       
        for(i=0; i<a.length; i++){
    {
          if (a[i]==0 && i<j){
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;
               j--;
          }
         }  
        } for(int k:a)
        System.out.print(k +" ");
    }
}
