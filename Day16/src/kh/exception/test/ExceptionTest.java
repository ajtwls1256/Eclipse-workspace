package kh.exception.test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ExceptionTest
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        // 정수 두개를 입력받아서 몫을 출력하는 프로그램
        
        System.out.print("정수 두개를 입력해주세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        try 
        {
            int result = a/b;
            System.out.println(a + " / " + b + " = " + result);
            
        } catch(Exception e)
        {
            System.out.println("0으로는 나눌 수 없습니다.");
            System.out.println(e.getMessage());
        }
        
       
    
    }

    public void menuPrint()
    {
        System.out.println("<<< 메뉴 선택 >>>");
        System.out.println("1. Hello 출력");
        System.out.println("2. Hi 출력");
        System.out.println("3. Bye 출력");
        System.out.print("선택 > ");
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
            default : System.out.println("1~3 중에서 선택해주세요");
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
            System.out.println("숫자를 입력해주세요");
            //System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("종료되었습니다.");
        }

    }
    
    public void div(int num1, int num2)
    {
        if(num2 == 0)
        {
            //throw new ExceptionTest1("0으로는 나눌 수 없습니다.");
            
            try
            {
                throw new ExceptionTest2("0 으론 못나눠");
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
