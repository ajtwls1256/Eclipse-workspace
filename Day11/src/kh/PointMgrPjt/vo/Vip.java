package kh.PointMgrPjt.vo;


public class Vip extends Grade
{
    public Vip()
    {
        
    }
    
    public Vip(String grade, String name, int point)
    {
        super(grade, name, point);       // �θ��� ������ ȣ��
    }
    
    @Override
    public double getBonus()
    {
        return super.getPoint() * 0.05;
    }
}














