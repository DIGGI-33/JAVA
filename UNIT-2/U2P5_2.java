/* WRITE A JAVA PROGRAM TO USE METHOD OVERLOADING WITH DIFFERENT DATA TYPE */

class MethodOverloading
{
    void sum(int a, int b)
    {
        System.out.println("SUM OF 2 : " + (a + b));
    }

    void sum(double a, double b, double c)
    {
        System.out.println("SUM OF 3 : " + (a + b + c));
    }
}

class U2P5_2
{
    public static void main(String args[])
    {
        MethodOverloading obj = new MethodOverloading();

        obj.sum(1, 2);
        obj.sum(1.5, 2.6, 3.4);
    }
}