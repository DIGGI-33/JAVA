/* WRITE A JAVA PROGRAM TO USE METHOD OVERLOADING */

class Overloading
{
    void sum(int a, int b)
    {
        System.out.println("SUM OF 2 : " + (a + b));
    }

    void sum(int a, int b, int c)
    {
        System.out.println("SUM OF 3 : " + (a + b + c));
    }
}

class U2P5_1
{
    public static void main(String args[])
    {
        Overloading obj = new Overloading();

        obj.sum(1, 2);
        obj.sum(1, 2, 3);
    }
}