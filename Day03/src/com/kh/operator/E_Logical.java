package com.kh.operator;

import java.util.Scanner;

public class E_Logical
{
   /*
    *  - 논리 값 두개를 비교하는 연산자
    AND : &&(그리고, ~면서)
    OR : ||(또는, ~거나)
    논리값 && 논리값, 논리값 || 논리값
    */
    
    public void 함수1()
    {
        // 입력한 정수값이 1~100사이의 숫자인지 확인하기
        
        Scanner 스캐너 = new Scanner(System.in);
        
        System.out.println("정수 하나 입력 : ");
        int 숫자1 = 스캐너.nextInt();
        
        // && : 두개의 조건이 모두 true여야 && 연산의 결과값이 true
        //      하나라도 조건이 false가 되면 &&연산의 결과값은 false
        
        boolean 참이냐 = (숫자1 >= 1) && (숫자1 <= 100);
        
        System.out.println("1부터 100사이인지 확인 : " + 참이냐);
        
        
    }
    
    public void 함수2()
    {
        // 입력한 문자 값이 대문자인지 확인
        
        Scanner 스캐너 = new Scanner(System.in);
        
        //문자 하나 입력 받기
        System.out.println("문자 하나 입력 : ");
        char 문자1 = 스캐너.nextLine().charAt(0);
        
        boolean 참인지 = (문자1 >= 'A') && (문자1 <= 'Z');
        System.out.println("영어 대문자 확인 : " + 참인지);
        
        System.out.println("계속 하시려면 y혹은 Y를 입력하세요 : ");
        char 문자2 = 스캐너.next().charAt(0);
        
        System.out.println("영문자 y인지 확인 : " + (문자2 == 'y' || 문자2 == 'Y'));

        
        
    }
    
    public void 함수3()
    {
        // &&와 ||는 앞의 결과가 무엇인지에 따라서 뒤를 실행 안하기도 함
        // 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안하고
        // 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
        
        int 숫자1 = 10;
        
        System.out.println("&& 연산 전 num : " + 숫자1);
        
        boolean 결과1 = false && ++숫자1 >0;
        
        System.out.println("result1 확인 : " + 결과1);
        
        System.out.println("&& 연산 후 num : " + 숫자1);
        
        System.out.println();
        
        System.out.println("|| 연산 전 num : " + 숫자1);
        boolean 결과2 = true || ++숫자1 > 0;
        System.out.println("result2 확인 : " + 결과2);
        
        System.out.println("|| 연산 후 num : " + 숫자1);
        
    }
    
    public void 함수4()
    {
        int 숫자1 = 2;
        int 숫자2 = 3;
        
        boolean 논리1 = 숫자1 > 숫자2;                // false
        boolean 논리2 = ++숫자1 <= 숫자2++;           // true 숫자1 = 3, 숫자2 = 3->4
        
        System.out.println("(a % b ) == 1 : " + ((숫자1 % 숫자2) == 1));                    //false
        System.out.println("(a == 3) && (b == 4) : " + ((숫자1 == 3) && (숫자2 == 4)));     //true
        System.out.println("!d || (a - b) > 0 : " + (!논리2 || (숫자1 - 숫자2) > 0));       //false
        
        System.out.println();
        
        System.out.println("!(c == d) && ((a * b) == 10) || (b % 2 == 0)) : " + (!(논리1 == 논리2) && ((숫자1 *  숫자2) == 10) || (숫자2 % 2 == 0)));
        // true
        
    }
    
    
    
    
}
