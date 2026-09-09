/* WRITE A JAVA PROGRAM TO PERFORM OVERRIDING OF ABSTRACT CLASS. */

abstract class Animal
{
    abstract void sound();
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("DOG BARKS");
    }
}

class U2P11
{
    public static void main(String args[])
    {
        Animal a = new Dog();

        a.sound();
    }
}