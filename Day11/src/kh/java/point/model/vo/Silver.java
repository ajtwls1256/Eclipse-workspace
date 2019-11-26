package kh.java.point.model.vo;

public class Silver extends Grade
{
    public Silver()
    {
        
    }
    
    public Silver(String name, String grade, int score)
    {
        super(name, grade, score);
    }
    
    
    @Override
    public double getInterest()
    {
        return (getScore()*0.03);
    }
    
    
}
