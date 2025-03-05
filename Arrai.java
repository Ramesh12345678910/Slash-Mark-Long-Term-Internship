import java.util.*;
public class Arrai{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int E=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0,ind=0;
        while(t!=0){
            for(int i=0;i<n;i++){
                
                if(a[i]==E || a[i]>E){
                    ind--;
                    if(a[i]==E)
                    {
                        ind=i;
                    }
                    break;
                }  
            }
            ind++;
            System.out.println(ind);
            
            t--;


        }
        sc.close();
    }
}