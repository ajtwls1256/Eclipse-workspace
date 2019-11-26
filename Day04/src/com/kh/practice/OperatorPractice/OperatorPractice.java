package com.kh.practice.OperatorPractice;

import java.util.Scanner;

public class OperatorPractice
{
    Scanner sc = new Scanner(System.in);
    
    public void practice1()
    {
       
        System.out.println("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        
        String result = num > 0 ? "양수입니다." : "양수가 아닙니다.";
        
        System.out.println("입력받은 정수 " + num + " 은/는 " + result);
        
    }
    
    public void practice2()
    {
        System.out.println("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        
        String result = num > 0 ? "양수입니다." : num == 0 ? "0입니다." : "음수입니다.";
        
        System.out.println("입력받은 정수 " + num + " 은/는 " + result);
    }
    
    public void practice3()
    {
        System.out.println("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        
        String result = num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
        
        System.out.println("입력받은 정수 " + num + " 은/는 " + result);
    }
    
    public void practice4()
    {
        System.out.println("인원 수와 사탕 개수를 입력하세요 : ");
        int pNum = sc.nextInt();
        int cNum = sc.nextInt();
        
        int p1Candy = cNum / pNum;
        int lCandy = cNum % pNum;
        
        System.out.println("1인당 사탕 개수 : " + p1Candy);
        System.out.println("남는 사탕 개수 : " + lCandy);
    }
    
    public void practice7()
    {
        System.out.println("국어 영어 수학 점수를 입력하세요 : ");
        int kScore = sc.nextInt();
        int eScore = sc.nextInt();
        int mScore = sc.nextInt();
        
        int sum = kScore + eScore + mScore;
        float ave = sum / 3.0f;
        
        String result = (kScore >= 40 && eScore >= 40 && mScore >= 40) && ave >= 60 ? "합격" : "불합격"; 
        
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + ave);
        System.out.println(result);
        
    }
    
    public void practice8()
    {
        System.out.println("주민 번호를 입력하세요(- 포함) : ");
        String pNum = sc.nextLine();
        
        String sNum = pNum.substring(pNum.lastIndexOf("-")+1,pNum.lastIndexOf("-")+2);
        
        
        String result = Integer.parseInt(sNum) == 1 || Integer.parseInt(sNum) == 3 ? "남자" : "여자";
        
        
        System.out.println(result);
        
        
        
    }
    
    public void practice10()
    {
        System.out.println("3개의 수를 입력하세요 : ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        boolean result = num == num2 ? (num2 == num3 ? true : false) : false;
        
        System.out.println("입력1 : " + num);
        System.out.println("입력2 : " + num2);
        System.out.println("입력3 : " + num3);
        
        System.out.println(result);
    }
    
}
