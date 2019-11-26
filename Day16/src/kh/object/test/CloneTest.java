package kh.object.test;

public class CloneTest implements Cloneable
{
    private int data;
    
    public CloneTest()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public CloneTest(int data)
    {
        super();
        this.data = data;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }
    
    public Object clone() 
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return -1;
    }
    
    // 다형성을 이용하면 CloneTest, CloneTest2 둘다 Object의 후손 -> Object타입으로 리턴
    
    
}
