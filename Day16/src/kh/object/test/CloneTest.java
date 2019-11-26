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
    
    // �������� �̿��ϸ� CloneTest, CloneTest2 �Ѵ� Object�� �ļ� -> ObjectŸ������ ����
    
    
}
