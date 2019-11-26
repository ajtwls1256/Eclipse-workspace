package PointMgrPjt.vo;

/*public class Vip
{
    private String grade;
    private String name;
    private int point;
    private double bonus;
    
    public Vip()
    {
        
    }
    
    public Vip(String grade, String name, int point, double bonus)
    {
        this.grade = grade;
        this.name = name;
        this.point = point;
        this.bonus = bonus;
    }
    
    
    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPoint()
    {
        return point;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
}
*/

public class Vip extends Silver
{
    public Vip()
    {
        
    }
    
    public Vip(String grade, String name, int point)
    {
        super(grade, name, point);       // 부모의 생성자 호출
    }
    
    @Override
    public double getBonus()
    {
        return super.getPoint() * 0.05;
    }
}














