package PointMgrPjt.vo;

public class Vvip extends Silver
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
