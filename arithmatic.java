import java.util.*;
class Operations{
    public void add(int n1,int n2)
    {
        System.out.println("the result of addition is:"+(n1+n2));
    }
    public  void add(int n1,int n2,int n3)
    {
        System.out.println("the result of addition is:"+(n1+n2+n3));
    }
    public  void Subtraction(int n1,int n2)
    {
        if(n1>=n2)
        {
            System.out.println("the result of subtraction is:"+(n1-n2));
        }
        else{
            System.out.println("the result of subtraction is:"+(n2-n1));

        }
    }
}
public class arithmatic{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hi! everyone welcome to calculator");
        Veryadvance op=new Veryadvance();
        System.out.println("enter the a and b values");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        op.Subtraction(n1,n2);
        op.add(n1,n2,n3);
        op.add(n1,n2);
        System.out.println("the result of multiplication is:"+op.multiplication(n1,n2));
        System.out.println("the result of divison is:"+op.divison(n1,n2));
        System.out.println("the result of power is:"+op.power(n1,n2));
        System.out.print(op.Thankyou());
        scanner.close();
    }
}
/*Method overloading:-Here we are defined two methods with same names as add but the parameter passing is completly different
 * in first method we are passing only two parameters whereas in second method we are are passing two parameters
 * but this wont ne any error 
 * 
 * 
 * 
 * simply a method overloading refers to using two same methods with different parameters;
 */