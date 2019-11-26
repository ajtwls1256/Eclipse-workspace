package kh.java.point.model.vo;

public class Vip extends Grade
{
    public Vip()
    {
        
    }
    
    public Vip(String name, String grade, int score)
    {
        super(name, grade, score);
    }
    

    @Override
    public double getInterest()
    {
        return (getScore()*0.1);
    }
}
