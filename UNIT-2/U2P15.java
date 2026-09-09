/* WRITE A JAVA PROGRAM TO USE 1 PACKAGE. */

package add;

class Addition
{
    int a = 10, b = 20;

    void add()
    {
        System.out.println("THE ADDITION : " + (a + b));
    }
}

class U2P15
{
    public static void main(String args[])
    {
        Addition a = new Addition();

        a.add();
    }
}