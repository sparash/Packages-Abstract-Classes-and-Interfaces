import java.util.Scanner;
abstract class animal
{
    String color,breed,name;
    abstract void eat();
    void speak()
    {
        System.out.println("roar");
    }
}
class animals extends animal
{
    void eat()
    {
        System.out.println("oats");
    }
}
public class abss
{
    public static void main(String[] args)
    {
        animals x=new animals();
        x.speak();
        x.eat();
    }
}