/* WRITE A JAVA PROGRAM TO USE METHOD OVERRIDING */

class OverridingA
{
    void sum(int a, int b)
    {
        System.out.println("ADDITION : " + (a + b));
    }
}

class OverridingB extends OverridingA
{
    void sum(int a, int b)
    {
        System.out.println("ADDITION : " + (a + b));
    }
}

class U2P6
{
    public static void main(String args[])
    {
        OverridingB obj = new OverridingB();

        obj.sum(1, 2);
    }
}