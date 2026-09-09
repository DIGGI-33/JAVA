/* WRITE A JAVA PROGRAM TO USE FINAL METHOD. */

class DiggiPolicy
{
    final void verifyIdentity()
    {
        System.out.println("STUDENT DIGGI IDENTITY VERIFIED VIA BIOMETRICS.");
    }
}

class AdvancedStudent extends DiggiPolicy
{
}

class U2P8_2
{
    public static void main(String args[])
    {
        AdvancedStudent a = new AdvancedStudent();

        a.verifyIdentity();
    }
}