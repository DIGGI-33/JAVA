/* WRITE A JAVA PROGRAM OF 1D ARRAY. */

import java.util.Scanner;

class U1P10_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int scores[] = new int[5];
        int i;

        for(i = 0; i < 5; i++)
        {
            System.out.print("ENTER SCORE : ");
            scores[i] = sc.nextInt();
        }

        System.out.println("\nARRAY ELEMENTS ARE:");

        for(i = 0; i < 5; i++)
        {
            System.out.println(scores[i]);
        }
    }
}