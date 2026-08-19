/* ABSTRACT CLASS. */

abstract class Animal 
{
    public abstract void animalSound()

    public void sleep()
    {
        System.out.println("Zzzzz");
    }
}

class Dog extends Animal 
{
    public void animalSound()
    {
        System.out.println("The dog says: Woof... wooff...");
    }
}

class U2P7
{
    public static void main(String args[])
    {
        Dog d = new Dog();

        d.animalSound();
        d.sleep();
    }
}