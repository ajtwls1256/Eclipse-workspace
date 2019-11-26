package com.kh.control01.condition;

import java.util.Scanner;

public class B_Else
{
    // if-else문
    // if (조건식) {
    // .. 실행코드1 ..;
    // } else {
    // .. 실행코드2 ..;
    // }
    
    // 조건식의 결과가 true인 경우 실행코드1 수행
    // 조건식의 결과가 false인 경우 실행코드2 수행
    
    // if-else-if문
    
    // if(조건식) {
    // .. 실행코드1 ..;
    // } else if(조건식2) {
    // .. 실행코드2 ..;
    // } else {
    // .. 실행코드3 ..;
    // }
    
    // 조건식1의 결과가 true인 경우 실행코드1을 수행하고
    // if-else-if문을 빠져나간다.
    // 하지만 조건식1의 결과가 false인 경우 실행코드2를 수행
    // 조건식2의 결과가 false인 경우 실행코드3을 수행
    
    // 조건식1, 조건식2 모두 false이면 else 다음의 코드가 수행
   
    Scanner sc = new Scanner(System.in);
    
    public void practice1()
    {
        System.out.println("숫자를 한 개 입력하세요: ");
        int num = sc.nextInt();
        
        if (num > 0)
        {
            if (num % 2 == 0)
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
    
    
    public void practice3()
    {
        System.out.println("중간고사, 기말고사, 과제점수, 출석회수를 입력하세요 : ");
        int mScore = sc.nextInt();
        int fScore = sc.nextInt();
        int hScore = sc.nextInt();
        int 출석회수 = sc.nextInt();
        
        int 총강의회수 = 20;
        String result;
        
        float mRatio = 0f;
        float fRatio = 0f;
        float hRatio = 0f;
        float 출석Ratio = 0f;
        float lRatio = 0f;
        
        
        mRatio = mScore * 0.2f;
        fRatio = fScore * 0.3f;
        hRatio = hScore * 0.3f;
        출석Ratio = 출석회수;
        
        lRatio = mRatio + fRatio + hRatio + 출석Ratio;
        
        
        System.out.println("==============결과===============");
        System.out.println("중간고사 점수(20) : " + mRatio);
        System.out.println("기말고사 점수(30) : " + fRatio);
        System.out.println("과제 점수    (30) : " + hRatio);
        System.out.println("출석 점수    (20) : " + 출석Ratio);
        System.out.println("총점 : " + lRatio);
        
        
        if((float)출석회수/총강의회수 < 0.7f && lRatio < 70)
            System.out.print("Fail [출석미달] [점수미달]");
        else if((float)출석회수/총강의회수 < 0.7f)
            System.out.print("Fail [출석미달] ");
        else if(lRatio < 70)
            System.out.print("Fail [점수미달] ");
        else
            System.out.print("PASS");
    
        
    }
    
    
    
    
    
}
