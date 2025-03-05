import java.util.*;
public class multi{
    public  void array(int [][] a,int m,int n,Scanner sc)
    {
        System.out.println("enter the array elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
}
class updation extends multi
{
   public void product(int [][]a,int m,int n){
    System.out.println("the entered array elements are:");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]*=3;
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
    }
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("enter the no of rows and columns:");
        m=sc.nextInt();
        n=sc.nextInt();
        int [][] a=new int[m][n];
        //multi up=new multi();
        //up.array(a,m,n,sc);
        updation ap=new updation();
        ap.array(a,m,n,sc);
        ap.product(a,m,n);
        sc.close();

    }
}