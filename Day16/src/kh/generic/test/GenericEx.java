package kh.generic.test;

public class GenericEx<T,E>
{
    private T data;
    private E data2;

    public GenericEx()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public GenericEx(T data, E data2)
    {
        super();
        this.data = data;
        this.data2 = data2;
    }
    
    public T getData()
    {
        return data;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    public E getData2()
    {
        return data2;
    }
    
    public void setData2(E data2)
    {
        this.data2 = data2;
    }
}
