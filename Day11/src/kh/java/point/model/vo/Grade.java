package kh.java.point.model.vo;

public abstract class Grade
{
    private String name;
    private String grade;
    private int score;
    
    
    public Grade()
    {
        
    }
    
    public Grade(String name, String grade, int score)
    {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }
    
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getGrade()
    {
        return grade;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    public int getScore()
    {
        return score;
    }
    public void setScore(int score)
    {
        this.score = score;
    }
   
    public abstract double getInterest();

}
