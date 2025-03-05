import java.util.*;
class Features{
    private String brand;
    private int seater;
    private int price;
    public Features(String br,int se,int pr)
    {
        this.brand=br;
        this.seater=se;
        this.price=pr;
    }
    public String Display(String br)
    {
        return brand;
    }
    public void Diplay(int se,int pr)
    {
        System.out.println(seater+" "+price);
    }

}
public class cars{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car name,seater and price value:");
        String br=sc.next();
        int se=sc.nextInt();
        int pr=sc.nextInt();
        Features fe=new Features(br,se,pr);
        System.out.println("the brand you choosen is:"+ fe.Display(br));
        sc.close();
    }
}
/*Normally a main function is created for user which is also a class the user should not directly interact with data that is stored in design or
 * in another class for that we are using encapsulation method in which variables are declared as private and those can be initialized
 * by using constructor/methos of each class which increases security.
 */


 /*Setters can be called as a method which is used to initialize a variables in another class if we use a constructor method then we can
  * avoid detter functions.
  Getters can be called as a method which is used to dislay a information or access the data variables in that specific class.
 */

 //this keyword is used if global variable and local variable both have same name to avoid confusion this keyword refers to that variable is belongs to this class only

