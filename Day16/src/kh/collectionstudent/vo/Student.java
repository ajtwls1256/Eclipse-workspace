package kh.collectionstudent.vo;

public class Student
{
    private int classNumber;
    private String name;
    private int age;
    private String address;
    private double grade;

    
    public Student()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(int classNumber, String name, int age, String address,
            double grade)
    {
        super();
        this.classNumber = classNumber;
        this.name = name;
        this.age = age;
        this.address = address;
        this.grade = grade;
    }

    public int getClassNumber()
    {
        return classNumber;
    }

    public void setClassNumber(int classNumber)
    {
        this.classNumber = classNumber;
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

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }
    
    
    
}
