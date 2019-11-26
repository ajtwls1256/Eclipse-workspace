package kh.pointmanager.vo;

public class Grade
{
    private String grade;
    private String name;
    private int point;
    
    public Grade()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Grade(String grade, String name, int point)
    {
        super();
        this.grade = grade;
        this.name = name;
        this.point = point;
    }
    
    public String getGrade()
    {
        return grade;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getPoint()
    {
        return point;
    }
    public void setPoint(int point)
    {
        this.point = point;
    }
    
    public double getBonus()
    {
        double d = 0.0;
        return d;
    }
    
    
}
