package kh.pointmanager.vo;

public class Gold extends Grade
{

    public Gold()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public Gold(String grade, String name, int point)
    {
        super(grade, name, point);
        // TODO Auto-generated constructor stub
    }
    
    public double getBonus()
    {
        return getPoint()*0.03;
    }
}
