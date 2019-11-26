package com.practice.for01;

import java.util.Random;
import java.util.Scanner;

public class RandomTest
{
 
    
    public void randomTest1()
    {
        Random r= new Random();
//        int num = r.nextInt(100); // 0~99사이의 랜덤수
//        System.out.println("랜덤 수 : " + num);
        
        //1~9 범위의 랜덤 수 추출
//        int num2 = r.nextInt(9) + 1;
//        System.out.println("랜덤 수 : " + num2);
        
        //20~35
        int num3 = r.nextInt(16) + 20;
        System.out.println("랜덤 수 : " + num3);
        
        //0 또는 1
        int num4 = r.nextInt(2);
        System.out.println("랜덤 수 : " + num4);
        
    }
    
    
    Scanner sc = new Scanner(System.in);
    
    
    public void exam1()
    {
        //동전 앞뒤 맞추기
        
        System.out.println("==== 동전 앞/뒤 맞추기 ====");
        System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
        int userN = sc.nextInt();
        
        Random r = new Random();
        int random = r.nextInt(2);
        
        if(userN == random + 1)
        {
            System.out.println("정답!!");
        }
        else
        {
            System.out.println("땡!!!!!!!");
        }
    }
    
    
    public void exam2()
    {
        // 가위바위보 게임
        
        while(true)
        {
        System.out.println("=== 가위 바위 보 게임 ===");
        System.out.println("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
        int userN = sc.nextInt();
        
        Random r = new Random();
        int comN = r.nextInt(3) + 1;
        
        String result = "";
        
        if(userN == comN)
        {
            result = "비겼습니다.";
        }
        else if((userN - 1  == comN) || (userN + 2 == comN))
        {
            result = "이겼습니다.";
        }
        else
        {
            result = "졌습니다.";
        }
        
        
       
        String userS = "";
        String comS = "";
        
        String tempS = "";
        
        
        if(userN == 1)
            userS = "가위";
        else if(userN == 2)
            userS = "바위";
        else if(userN == 3)
            userS = "보";
        
        if(comN == 1)
            comS = "가위";
        else if(comN == 2)
            comS = "바위";
        else if(comN == 3)
            comS = "보";
        
//        for(int i = 0; i < 2; i++)
//        {
//            int tempN;
//          
//            if(i == 0)
//            {
//                tempN = userN;
//                tempS = userS;
//            }
//            else
//            {
//                tempN = comN;
//                tempS = comS;
//            }
//            
//            
//            if(tempN == 1)
//                tempS = "가위";
//            else if(tempN == 2)
//                tempS = "바위";
//            else if(tempN == 3)
//                tempS = "보";
//            
//        }
        
        
        System.out.println("====== 결과 ======");
        System.out.println("당신은 " + userS + "를 냈습니다.");
        System.out.println("컴퓨터는 " + comS + "를 냈습니다.");
        
       
        System.out.println("==================");
        System.out.println(result);
        }
        
    }
    
    
    
    public void test()
    {
        // String 생성 방식 test
        // 리터럴로 생성 시 같은 문자열을 넣으면 동일한 주소값을 반환한다.
        
        
        //String temp1 = new String("abc");
//        String temp1 = "abc";
//        String temp2 = "abc";
        //String temp2 = new String("abc");
        
        String temp1 = sc.nextLine();
        //sc.nextLine();
        String temp2 = sc.nextLine();
   
        
        System.out.println(temp1 == temp2);
        System.out.println(temp1.equals(temp2));
    }
    
    
}
