package kh.PointMgrPjt.vo;



public class GradeIndex
{
    private String grade;
    private int index;
    
    
    public GradeIndex()
    {
        
    }
    
    public GradeIndex(String grade, int index)
    {
        this.grade = grade;
        this.index = index;
    }
    
    
    public String getGrade()
    {
        return grade;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    public int getIndex()
    {
        return index;
    }
    public void setIndex(int index)
    {
        this.index = index;
    }
    
    
}
