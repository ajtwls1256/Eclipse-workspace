package kh.vo;

public class MethodTest
{
    public void main()
    {
        int result = add(10,20);
        System.out.println(result);
        
        int result2 = sub(10,20);
        System.out.println(result2);
        
        int result3 = mul(10,20);
        System.out.println(result3);
        
        double result4 = div(10,20);
        System.out.println(result4);
        
        int result5 = add1(10, 20, 30);
        System.out.println(result5);
        
        
        String test = test();
        System.out.println(test);

    }
    
    public String test()
    {
        String str = "Hello";
        return str;
    }
    
    
    // ���ϱ�
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

    // ����
    public int sub(int num1, int num2)
    {
        return num1 - num2;
    }
    
    // ���ϱ�
    public int mul(int num1, int num2)
    {
        return num1 * num2;
    }
    
    // ������
    public double div(int num1, int num2)
    {
        return (double)num1 / num2;
    }
    
    public int add1(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}
