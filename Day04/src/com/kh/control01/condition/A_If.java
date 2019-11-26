package com.kh.control01.condition;

import java.util.Scanner;

public class A_If
{
    // 프로그램의 진행은 순차적으로 진행된다.
    // 하지만 이 순차적인 흐름을 바꿀 때
    // "제어문" 이라는 걸 이용한다.
    
    // <조건문>
    // 조건식을 통해 참이냐 거짓이냐를 판단해서
    // 해당 조건이 만족하는 경우 그에 해당하는 실행
    
    // 삼항연산자도 조건문임
    
    // 조건문은 크게 if문이랑 switch문으로 나뉜다.
    
    // if문의 종류 3가지
    // 1. 단독 if문
    // 2. if else문
    // 3. if else if문
    
    
    // 단독 if문
    // if ( 조건식 ) {
    //     .. 실행할 코드 ..;
    // }
 
    // 조건식의 결과 값이 true(참)이면 중괄호({}) 안의 코드를 실행
    // 조건식의 결과 값이 false(거짓)이면 코드를 무시하고 넘어간다.
    
    
    Scanner sc = new Scanner(System.in);
    
    public void practice1()
    {
    
        System.out.println("숫자를 한 개 입력하세요: ");
        int num = sc.nextInt();
        
        if(num > 0)
        {
            if(num % 2 == 0)
                System.out.println("짝수다.");
            else
                System.out.println("홀수다.");
        }
        else
            System.out.println("양수만 입력해주세요.");
           
        
    }
    
    public void practice2()
    {
        System.out.println("1.입력 2.수정 3.조회 4.삭제 7.종료");
        System.out.println("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();
        
        if(num == 1)
            System.out.println("입력 메뉴입니다.");
        else if(num == 2)
            System.out.println("수정 메뉴입니다.");
        else if(num == 3)
            System.out.println("조회 메뉴입니다.");
        else if(num == 4)
            System.out.println("삭제 메뉴입니다.");
        else if(num == 7)
            System.out.println("프로그램이 종료됩니다.");
        else
            System.out.println("잘못된 입력입니다.");
        
        
        
    }
    
    
    
    
}
