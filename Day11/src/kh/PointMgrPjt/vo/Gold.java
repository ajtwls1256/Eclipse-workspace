package kh.PointMgrPjt.vo;


public class Gold extends Grade
{
    public Gold()
    {
        
    }
    
    public Gold(String grade, String name, int point)
    {
        super(grade, name, point);       // 부모의 생성자 호출
    }
    
    // gold <-> Silver 보너스율의 차이
    
    @Override
    public double getBonus()
    {
        return super.getPoint() * 0.03;
    }
    
}

