public class type_casting
{
    public static void main(String[] args){
        int n1=65;
        double n2=n1; //it is an implicit data type conversion where data is converted from low data type size to large data type size
        System.out.println("implicit conversion:" + n2);
        char n3=(char)n1;
        System.out.println("explicit conversion:" + n3);
    }
}