final class DIGGI_DATA
{
    void showData()
    {
        System.out.println("Secure Confidential Records for Diggi");
    }
}

class HackData extends DIGGI_DATA 
{}

public class FINAL_CLASS
{
    public static void main(String[] args) 
    {
        DIGGI_DATA d = new DIGGI_DATA();
        d.showData();
    }
}