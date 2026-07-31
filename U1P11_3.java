/* WRITE A JAVA PROGRAM FOR 2D ARRAY. */

import java.util.Scanner;

class U1P11_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("ENTER ELEMENTS:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("ARRAY ELEMENTS:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}