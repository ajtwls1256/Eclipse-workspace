package kh.vo;

public class Member
{
    private String id;
    private String pw;
    private String pw2;
    private String name;
    private int age;
    private String phone;
    private String addr;
    
    
    //getter, setter
    public String getID()
    {
        return id;
    }
    
    public String getPw()
    {
        return pw;
    }
    
    public String getPw2()
    {
        return pw2;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getAddr()
    {
        return addr;
    }
    
    
    public void setID(String id)
    {
        this.id = id;
    }
    
    public void setPw(String pw)
    {
        this.pw = pw;
    }
    
    public void setPw2(String pw2)
    {
        this.pw2 = pw2;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public void setAddr(String addr)
    {
        this.addr = addr;
    }
    
}
