/* WRITE A JAVA PROGRAM TO DEMONSTRATE ENCAPSULATION. */

class U2P10
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String args[])
    {
        U2P10 emp = new U2P10();

        emp.setName("DIGGI");

        System.out.println("EMPLOYEE NAME : " + emp.getName());
    }
}