package kh.vo;

public class Student
{
    private String name;
    private int age;
    private int stuNo;
    
    // ������ ������ġ�� ������ getter setter ����
    // �⺻������
    public Student()
    {
        this.name = "�̿�ȣ";
        this.age = 20;
        this.stuNo = 10;
    }
        
    public Student(String name, int age, int stuNo)
    {
        this.name = name;
        this.age = age;
        this.stuNo = stuNo;
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
    public int getStuNo()
    {
        return stuNo;
    }
    public void setStuNo(int stuNo)
    {
        this.stuNo = stuNo;
    }
    
    
    
    
    
    
}
