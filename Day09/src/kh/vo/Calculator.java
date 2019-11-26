package kh.vo;

import java.util.Scanner;

public class Calculator
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        
        Calculator2();
        
    }
    
    
    public void Calculator()
    {
        while(true)
        {

            System.out.print("ù��° ���� �Է� : ");
            int num1 = sc.nextInt();
            System.out.print("�ι�° ���� �Է� : ");
            int num2 = sc.nextInt();
            System.out.print("������ �Է� (+,-,*,/) : ");
            char oper = sc.next().charAt(0);
            
            int result = 0;
            double divResult = 0.0;
            boolean isDiv = false;
            
            
            switch(oper)
            {
                case '+' : result = add(num1, num2);
                    break;
                    
                case '-' : result = minus(num1, num2);
                    break;
                    
                case '*' : result = multi(num1, num2);
                    break;
                    
                case '/' : divResult = div(num1, num2); isDiv = true;
                    break;   
                    
                default : System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�."); continue;   
            }
            
            if(isDiv)
            {
                System.out.println("��� ��� : " + divResult);
            }
            else
            {
                System.out.println("��� ��� : " + result);
            }
            
            
            sc.nextLine();
            System.out.print("�ѹ� �� �Ͻðڽ��ϱ�(y/n)? ");
            char restart = sc.next().charAt(0);
            
            if(restart == 'n')
            {
                break;
            } 
            
        }
        
        
    }
    
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    
    public int minus(int num1, int num2)
    {
        return num1 - num2;
    }
    
    public int multi(int num1, int num2)
    {
        return num1 * num2;
    }
    
    public double div(int num1, int num2)
    {
        return (double)num1 / num2;
    }
    
    
    
    
    public void Calculator2()
    {
        while(true)
        {

            System.out.print("ù��° ���� �Է� : ");
            int num1 = sc.nextInt();
            System.out.print("�ι�° ���� �Է� : ");
            int num2 = sc.nextInt();
            System.out.print("������ �Է� (+,-,*,/) : ");
            char oper = sc.next().charAt(0);
            
  
            
            switch(oper)
            {
                case '+' : add2(num1, num2);
                    break;
                    
                case '-' : minus2(num1, num2);
                    break;
                    
                case '*' : multi2(num1, num2);
                    break;
                    
                case '/' : div2(num1, num2); 
                    break;   
                    
                default : System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�."); continue;   
            }
           

            sc.nextLine();
            System.out.print("�ѹ� �� �Ͻðڽ��ϱ�(y/n)? ");
            char restart = sc.next().charAt(0);
            
            if(restart == 'n')
            {
                break;
            } 
            
        }
        
        
    }
    
    
    public void add2(int num1, int num2)
    {
        System.out.println("��� ��� : " + (num1 + num2));
    }
    
    public void minus2(int num1, int num2)
    {
        System.out.println("��� ��� : " + (num1 - num2));
    }
    
    public void multi2(int num1, int num2)
    {
        System.out.println("��� ��� : " + (num1 * num2));
    }
    
    public void div2(int num1, int num2)
    {
        System.out.println("��� ��� : " + (num1 / num2));
    }
    
    
    

    
    
    
}
