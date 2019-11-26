package kh.java.point.model.vo;

public class Vvip extends Grade
{
    public Vvip()
    {
        
    }
    
    public Vvip(String name, String grade, int score)
    {
        super(name, grade, score);
    }
    

    @Override
    public double getInterest()
    {
        return (getScore()*0.5);
    }
}
