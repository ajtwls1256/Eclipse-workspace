package com.kh.operator;

public class B_InDecrease
{
    // ++ : 1����, ++��(���� ������), ��++(���� ������)�� ����Ѵ�.
    // -- : 1����, --��(���� ������), ��--(���� ������)�� ����Ѵ�.
    
    
    
    public void method1()
    {
        // ���� ���� ������
        
        int num1 = 10;
        
        System.out.println("���� ������ ���� �� : " + num1);
        System.out.println("++num�� 1ȸ ���� �� ��� : " + (++num1) );
        System.out.println("++num�� 2ȸ ���� �� ��� : " + (++num1) );
        System.out.println("++num�� 3ȸ ���� �� ��� : " + (++num1) );
        System.out.println("++num�� 4ȸ ���� �� ��� : " + (++num1) );
        System.out.println("++num�� 5ȸ ���� �� ��� : " + (++num1) );
        System.out.println("���� ���� ���� ���� �� num1�� �� " + num1 );
        
        
        // ��輱 ���
        System.out.println("=======================================");
        
        
        //���� ���� ������
        
        int num2 = 10;
        
        System.out.println("���� ���� ������ ���� �� : " + num2);
        System.out.println("num2++�� 1ȸ ���� �� ��� : " + (num2++) );
        System.out.println("num2++�� 2ȸ ���� �� ��� : " + (num2++) );
        System.out.println("num2++�� 3ȸ ���� �� ��� : " + (num2++) );
        System.out.println("num2++�� 4ȸ ���� �� ��� : " + (num2++) );
        System.out.println("num2++�� 5ȸ ���� �� ��� : " + (num2++) );
        System.out.println("���� ���� ���� ���� �� num2�� �� " + num2 );
        
    }
    
    public void method2()
    {
        int age = 20;
        
        System.out.println("���� ���̴� ? " + age);
        
        System.out.println("++age�� ? " + ++age);
        
        System.out.println("age++�� ?" + age++);
        
        System.out.println("--age�� ? " + --age);
        
        System.out.println("age--�� ? " + age--);
        
        System.out.println("���� ���̴� ? " + age);
    
    }
    
    public void method3()
    {
        int num1 =20;
        int result = num1++ * 3;
        
        System.out.println("result : " + result);
        System.out.println("num1 : " + num1);
        
        int num2 = 20;
        
        int result2 = ++num2 * 3;
        
        System.out.println("result2 : " + result2);
        System.out.println("num2 : " + num2);
        
        
    }
    
    public void method4()
    {
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println(a++);
        
        System.out.println((++a) + (b++));
   
        System.out.println( (a++) + (--b) + (--c) );
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        
    }
    
    
}
