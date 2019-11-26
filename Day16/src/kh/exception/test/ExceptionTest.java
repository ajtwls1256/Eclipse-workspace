package kh.exception.test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ExceptionTest
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        // ���� �ΰ��� �Է¹޾Ƽ� ���� ����ϴ� ���α׷�
        
        System.out.print("���� �ΰ��� �Է����ּ��� : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        try 
        {
            int result = a/b;
            System.out.println(a + " / " + b + " = " + result);
            
        } catch(Exception e)
        {
            System.out.println("0���δ� ���� �� �����ϴ�.");
            System.out.println(e.getMessage());
        }
        
       
    
    }

    public void menuPrint()
    {
        System.out.println("<<< �޴� ���� >>>");
        System.out.println("1. Hello ���");
        System.out.println("2. Hi ���");
        System.out.println("3. Bye ���");
        System.out.print("���� > ");
    }
    
    public void print(int select)
    {
        switch(select)
        {
            case 1: System.out.println("Hello !");
                break; 
            case 2: System.out.println("Hi !");
                break;
            case 3: System.out.println("Bye !");
                break;
            default : System.out.println("1~3 �߿��� �������ּ���");
        }
    }

    public void start()
    {
        menuPrint();

        try 
        {
            int sel = sc.nextInt();
            print(sel);
        }
        catch(Exception e)
        {
            System.out.println("���ڸ� �Է����ּ���");
            //System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("����Ǿ����ϴ�.");
        }

    }
    
    public void div(int num1, int num2)
    {
        if(num2 == 0)
        {
            //throw new ExceptionTest1("0���δ� ���� �� �����ϴ�.");
            
            try
            {
                throw new ExceptionTest2("0 ���� ������");
            }
            catch (ExceptionTest2 e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        System.out.println(num1/num2);
    }


}
