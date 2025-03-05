    class Calculator{
    public int add(int num1,int num2)
    {
        int r=num1+num2;
        return r;
    }
}

public class Demo{
    public static void main(String[] args)
    {
        int num1=10;
        int num2=20;
        Calculator cal=new Calculator();
        int result=cal.add(num1,num2);
        System.out.println("the result of the addition is:"+result);

    }
}
/* 
in java we are going to develop real world applications by using oops concept the
here assume a mobile phone design a mobie phone an object is the mobile and its design is a class
so a class can be called as a design for an object which consists of proprties and behaviour where
propeties refers to values and  behaviur refers to mrthods we call those method by using the object"""
*/