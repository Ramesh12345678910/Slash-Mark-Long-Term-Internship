import java.util.*;
public class array{
    public void arrray(int [] a,int n)
    {
        System.out.println("the entered array elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
    class update extends array{
        public void increement(int []a,int n){
            System.out.println("the updated array elements are:");
            for(int i=0;i<n;i++)
        {
            a[i]=a[i]+1;
            System.out.println(a[i]);
        }
        }
       public static void main(String[] args)
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        update ar=new update();
        ar.arrray(a, n);
        ar.increement(a, n);
        sc.close();
       }
}