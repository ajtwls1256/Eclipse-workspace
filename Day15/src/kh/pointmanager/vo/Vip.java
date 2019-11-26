package kh.pointmanager.vo;

public class Vip extends Grade
{

    public Vip()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public Vip(String grade, String name, int point)
    {
        super(grade, name, point);
        // TODO Auto-generated constructor stub
    }
    
    public double getBonus()
    {
        return getPoint()*0.05;
    }
}
