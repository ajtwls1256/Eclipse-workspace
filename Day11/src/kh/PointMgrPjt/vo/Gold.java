package kh.PointMgrPjt.vo;


public class Gold extends Grade
{
    public Gold()
    {
        
    }
    
    public Gold(String grade, String name, int point)
    {
        super(grade, name, point);       // �θ��� ������ ȣ��
    }
    
    // gold <-> Silver ���ʽ����� ����
    
    @Override
    public double getBonus()
    {
        return super.getPoint() * 0.03;
    }
    
}

