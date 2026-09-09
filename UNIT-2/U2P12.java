/* WRITE A JAVA PROGRAM TO PERFORM HYBRID INHERITANCE. */

class Animal
{
    void eat()
    {
        System.out.println("THIS ANIMAL EATS FOOD.");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("THE DOG BARKS: WOOF! WOOF!");
    }
}

interface PetAnimal
{
    void weep();
}

class Puppy extends Dog implements PetAnimal
{
    public void weep()
    {
        System.out.println("PUPPY IS WEEPING.");
    }

    void sleep()
    {
        System.out.println("ZZZZZZZZZ");
    }
}

class U2P12
{
    public static void main(String args[])
    {
        Puppy p = new Puppy();

        p.eat();
        p.weep();
        p.bark();
        p.sleep();
    }
}