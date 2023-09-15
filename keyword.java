package coding;
class data
{
    static int a;
    static String name;
System.out.println(this);
    data(int a,String n)
    {
        
        this.a=a;
        this.name=n;

  
    }
    void dis()
{
    System.out.println("Id is "+a+" Name is "+name);
    
}


    
}

public class keyword {
    public static void main(String args[])
    {
        data obj=new data(1,"Arsalan");
        obj.dis();
    
        


    }
    
}
