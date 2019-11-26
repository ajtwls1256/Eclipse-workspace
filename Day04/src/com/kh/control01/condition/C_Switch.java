package com.kh.control01.condition;

import java.util.Scanner;

public class C_Switch
{
    // swtich도 if문과 같이 조건문이다.
    
    // 다만 if문과의 차이점은
    // if문은 조건의 범위를 지정할 수 있었다.
    // 하지만 switch문은 확실한 값의 조건이여야 한다.
    
    //switch문
    //
    // switch(동등 비교할 대상자){
    // case 값1 : 실행코드1; break;
    // case 값2 : 실행코드2; break;
    //
    // ...
    // default : 실행코드3
    // }
    
    // 비교할 대상자 == 값1, 실행코드1을 실행하고 break를 받아 빠져나온다.
    
    Scanner sc = new Scanner(System.in);
    
    public void method1()
    {
        System.out.println("1~3 사이의 정수를 입력하세요: ");
        int num = sc.nextInt();
        
        switch(num)
        {
            case 1: System.out.println("빨간색 입니다.");
            break;
            case 2: System.out.println("파란색 입니다.");
            break;
            case 3: System.out.println("초록색 입니다.");
            break;
            
            default: System.out.println("잘못 입력하셨습니다.");
        }
    
    }
    
    public void method2()
    {
        System.out.println("정수 두개와 연산기호를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //sc.nextLine();
        char op = sc.nextLine().charAt(1);
        
        switch(op)
        {
            case '+': System.out.println("num1" + op + "num2 = " + (num1+num2));
                break;
            case '-': System.out.println("num1" + op + "num2 = " + (num1-num2));
                break;
            case '*': System.out.println("num1" + op + "num2 = " + (num1*num2));
                break;
            case '/': System.out.println("num1" + op + "num2 = " + (num1/num2));
                break;
            case '%': System.out.println("num1" + op + "num2 = " + (num1%num2));
                break;
                
            default: System.out.println("잘못 입력하셨습니다.");
        }
        
    }
    
    public void method3()
    {
        System.out.println("월을 입력하세요: ");
        int month = sc.nextInt();
        int 일;
        
        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 일 = 31;
                break;
                
            case 4: case 6: case 9: case 11: 일 = 30;
                break;
            case 2: 일 = 29;
                break;
            default: System.out.println("잘못 입력하셨습니다."); return;
        }
        
        System.out.println(month + "월의 일수는 " + 일 + "일 입니다.");
            
    }
    
    
    
    
    
    
    
}
