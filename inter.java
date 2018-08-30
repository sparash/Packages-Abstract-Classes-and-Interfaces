import java.util.Scanner;

interface MyFirstInterface
{
    void speak();
    void eat();
}
class dog implements MyFirstInterface
{
    public void speak()
    {
        System.out.println("woof");
    }
    public void eat()
    {
        System.out.println("pedigree");
    }
}
class cat implements MyFirstInterface
{
    public void speak()
    {
        System.out.println("meow");
    }
    public void eat()
    {
        System.out.println("fish");
    }
}
class inter
{
    public static void main(String[] args)
    {
        dog d=new dog();
        d.speak();
        d.eat();
        cat c=new cat();
        c.speak();
        c.eat();
    }
}