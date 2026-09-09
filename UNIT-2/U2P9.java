/* WRITE A JAVA PROGRAM TO USE INTERFACE. */

interface dog
{
    void sounddog();
    void eat();
}

interface cat extends dog
{
    void soundcat();
    void drink();
}

class puppy implements cat
{
    public void eat()
    {
        System.out.println("EAT BREAD");
    }

    public void drink()
    {
        System.out.println("MILK");
    }

    public void sounddog()
    {
        System.out.println("WOOF...WOOF...");
    }

    public void soundcat()
    {
        System.out.println("MEOW...MEOW...");
    }
}

class U2P9
{
    public static void main(String args[])
    {
        puppy p = new puppy();

        p.soundcat();
        p.drink();
        p.sounddog();
        p.eat();
    }
}