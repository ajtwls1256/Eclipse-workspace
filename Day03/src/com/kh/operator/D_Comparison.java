package com.kh.operator;

public class D_Comparison
{
    // �� ������ ( ���� ������)
    // �� ���� ���ϴ� ������, �ٸ� ���� ���� ������ ��� ��
    // �� ����ڴ� ������ �����ϸ� true, �ƴϸ� false �� ��ȯ��
    
    public void method1()
    {
        int a = 10;
        int b = 25;
        
        boolean result1, result2, result3;
        
        result1 = (a == b);
        result2 = (a <= b);
        result3 = ( a > b );
        
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        
        System.out.println("b�� ¦���ΰ�? " + ((b%2) == 0));
        System.out.println("a�� Ȧ���ΰ�? " + ((a%2) == 1));
        
    }
}
