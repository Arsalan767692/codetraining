package coding;
class defcons
{
    public void dis()
    {
        System.out.println("THis is an exmaple of defualt constructor");
    }

}
class paramcons
{
    paramcons()
    {
        System.out.println("This is an example of parameterized constructor");
    }

}
class pa
{
    int id;
    String name ;
    pa(int i,String n)
{
    id=i;
    name =n;
    System.out.println(id+" "+name);
}
    pa(pa s)
    {
        id =s.id;
        name=s.name;
        System.out.println(id+" "+name);
    }

}
public class constructor {
    public static void main(String args[])
    {

        defcons d=new defcons();//this is an default constructor
        d.dis();
        paramcons p=new paramcons();//this is an parameterized constructor
        pa a=new pa(1,"Arsalan");//parameterized constructor 
        pa b=new pa(a);//copy a constructor

    }
    
}
