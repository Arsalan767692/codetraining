package coding;
class student
{
    public void add()//user defined method
    {
        int a=3;
        int b=4;
        System.out.println(a+b);

    }
    
}

public class method {
    public static void info()//static method 
    {
        System.out.println("THis is static method");
    }
    public static void main(String args[])//user defined method
    {
     info();
    student obj=new student();
    obj.add();
    System.out.println("Biggest number between 8,10 is "+Math.max(8, 10));//math is predifine class and max is predefine method 

    }

    
}
