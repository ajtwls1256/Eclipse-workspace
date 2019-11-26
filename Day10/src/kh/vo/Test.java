package kh.vo;

public class Test
{
    // 기본 생성자
    public Test()
    {
        
    }
    
    
    
    // 메소드 오버로딩    
    public int sum(int num1, int num2)
    {
        return num1+num2;
    }
    
    // 리턴타입만 바꾼다고 오버로딩 x
//    public void sum(int num1, int num2)
//    {
//        return num1+num2;
//    }
    
    public int sum(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    
    
}
