/* WRITE A JAVA PROGRAM OF 2D ARRAY. */

import java.util.Scanner;

class U1P11_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int i, j;

        System.out.println("ENTER ARRAY ELEMENTS:");

        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("ARRAY ELEMENTS ARE:");

        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}