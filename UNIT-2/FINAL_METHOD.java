class DIGGI
{
    final void verifyIdentify()
    {
        System.out.println("Student Diggi Identify Verified via Biometrics.");
    }
}

class AdvancedStudent extends DIGGI
{
    void verifyIdentify()
    {}
}

class FINAL_METHOD
{
    public static void main(String[] args) 
    {
        AdvancedStudent d = new AdvancedStudent();
        
        d.verifyIdentify();
    }
}