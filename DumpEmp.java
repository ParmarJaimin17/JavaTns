public class DumpEmp
{
    private String ename;
    private String emailId;
    private String resaddr;
    private int mobileno;

    public void setEname(String ename) 
    {
        this.ename = ename;
    }

    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }

    public void setResaddr(String resaddr) 
    {
        this.resaddr = resaddr;
    }

    public void setMobileno(int mobileno) 
    {
        this.mobileno = mobileno;
    }
    
    public String toString() 
    {
        return "Employee Name: " + ename + ", Email: " + emailId + ", Address: " + resaddr + ", Mobile No: " + mobileno;
    }
    
    public static void main(String[] args)
    {
        DumpEmp de = new DumpEmp();

        de.setEname("Jaimin");
        de.setEmailId("parmarjaimin930@gmail.com");
        de.setResaddr("Ahmedabad");
        de.setMobileno(9510011098);

        System.out.println(de);

        DumpEmp ed1 = new DumpEmp();

        ed1.setEname("Keyur");
        ed1.setResaddr("Surat");

        System.out.println(ed1);
    }
}