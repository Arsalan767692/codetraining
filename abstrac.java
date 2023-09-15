package coding;
abstract class Animal
{
    abstract void sound();

}
class juuu extends Animal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }

}

public class abstrac {
    public static void main (String args[])
    {
        juuu obj=new juuu();
        obj.sound();
    }
    
}
