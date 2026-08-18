/* WRITE A JAVA PROGRAM TO USE METHOD OVERLOADING AND TAKE VALUES FROM USER */

import java.util.Scanner;

class U2P5_3
{
    void sum(int a, int b)
    {
        System.out.println("SUM OF 2 : " + (a + b));
    }

    void sum(int a, int b, int c)
    {
        System.out.println("SUM OF 3 : " + (a + b + c));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("ENTER VALUE 1 : ");
        a = sc.nextInt();

        System.out.print("ENTER VALUE 2 : ");
        b = sc.nextInt();

        System.out.print("ENTER VALUE 3 : ");
        c = sc.nextInt();

        U2P5_3 obj = new U2P5_3();

        obj.sum(a, b);
        obj.sum(a, b, c);
    }
}