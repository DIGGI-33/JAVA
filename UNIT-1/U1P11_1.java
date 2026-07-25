/* WRITE A JAVA PROGRAM OF 2D ARRAY. */

class U1P11_1
{
    public static void main(String args[])
    {
        int a[][] = {{10,20},{30,40}};

        int i, j;

        for(i = 0; i < 2; i++)
        {
            for(j = 0; j < 2; j++)
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}