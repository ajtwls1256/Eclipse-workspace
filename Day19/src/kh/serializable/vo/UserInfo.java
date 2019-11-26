package kh.serializable.vo;

import java.io.Serializable;

public class UserInfo implements Serializable
{
    private static final long serialVersionUID = 1111L; // ���ڴ� ũ�Ի������ L�� �ٿ� Long���� �־��ش�.
    
    private String name;
    private transient String password;  // ����ȭ ����
    private int age;
    private String addr;
    
    public UserInfo()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public UserInfo(String name, String password, int age, String addr)
    {
        super();
        this.name = name;
        this.password = password;
        this.age = age;
        this.addr = addr;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getAddr()
    {
        return addr;
    }
    public void setAddr(String addr)
    {
        this.addr = addr;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    
}
