package kh.vo;

public class Student
{
    private String name;
    private int age;
    private int stuNo;
    
    // 생성자 생성위치는 변수와 getter setter 사이
    // 기본생성자
    public Student()
    {
        this.name = "이영호";
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
