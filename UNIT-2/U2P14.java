/* WRITE A JAVA PROGRAM TO USE MULTIPLE INHERITANCE USING INTERFACES. */

interface PetAnimal
{
    void eat();
}

interface Animal extends PetAnimal
{
    void sleep();
}

class Dog implements Animal
{
    public void eat()
    {
        System.out.println("DOG EATS FOOD");
    }

    public void sleep()
    {
        System.out.println("ZZZZZZZZ");
    }

    void bark()
    {
        System.out.println("DOG BARKS: WOOF! WOOF!");
    }
}

class U2P14
{
    public static void main(String args[])
    {
        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}