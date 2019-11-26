package kh.wrapperclass.vo;

import java.util.Scanner;

public class Calculator implements CalculatorI
{
    Scanner sc = new Scanner(System.in);
    
    @Override
    public int add(String su1, String su2)
    {
        // TODO Auto-generated method stub
        int result = Integer.parseInt(su1) + Integer.parseInt(su2);
        
        
        return result;
    }

    @Override
    public int subtract(String su1, String su2)
    {
        // TODO Auto-generated method stub
        int result = Integer.parseInt(su1) - Integer.parseInt(su2);
        

        return result;
    }

    @Override
    public int multiply(String su1, String su2)
    {
        // TODO Auto-generated method stub
        int result = Integer.parseInt(su1) * Integer.parseInt(su2);
        
        
        return result;
    }

    @Override
    public double divide(String su1, String su2)
    {
        // TODO Auto-generated method stub
        double result = Double.parseDouble(su1) / Double.parseDouble(su2);
        
        
        return result;
    }

    @Override
    public void start()
    {
        // TODO Auto-generated method stub
        
        while(true)
        {
            System.out.println("\n===== ���� =====");
            System.out.print("������ �Է�(+,-,*,/) : ");
            String op = sc.next();
            System.out.print("ù��° ���� �Է� : ");
            String num1 = sc.next();
            System.out.print("�ι�° ���� �Է� : ");
            String num2 = sc.next();
            
            switch(op)
            {
                case "+": System.out.println(add(num1, num2));
                    break;
                case "-": System.out.println(subtract(num1, num2));
                    break;
                case "*": System.out.println(multiply(num1, num2));
                    break;
                case "/": System.out.println(divide(num1, num2));
                    break;
                default : return;
            }
            
        }
        
    }
    
}
