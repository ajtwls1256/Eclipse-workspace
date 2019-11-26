package kh.java.point.model.vo;

public class Gold extends Grade
{
    public Gold()
    {
        
    }
    
    public Gold(String name, String grade, int score)
    {
        super(name, grade, score);
    }
    
    
    @Override
    public double getInterest()
    {
        return (getScore()*0.05);
    }
}
