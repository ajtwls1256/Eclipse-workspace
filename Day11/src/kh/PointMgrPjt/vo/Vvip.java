package kh.PointMgrPjt.vo;

public class Vvip extends Grade
{
    public Vvip()
    {
        
    }
    
    public Vvip(String grade, String name, int point)
    {
        super(grade, name, point);       // �θ��� ������ ȣ��
    }
    
    @Override
    public double getBonus()
    {
        return super.getPoint() * 0.07;
    }
}
