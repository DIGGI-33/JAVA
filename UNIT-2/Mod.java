package Modulus;

public class Mod
{
    int mod;
    public void calMod(int a, int b)
    {
        mod = a % b ;
    }
    public void dispMod()
    {
        System.out.println("Modulus is : " + mod);
    }
}