package com.game;

import java.util.Random;
import java.util.Scanner;

public class BaskinRobbins31
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    // score 체크용 변수
    int myScore = 0;
    int comScore = 0;
    
    
    public void main()
    {
 
        boolean bool = true;
        
        
        while(bool)
        {
            System.out.println();
            System.out.println(" === Baskin Robbins31 Game === ");
            System.out.println("1. Game Start");
            System.out.println("2. Game Score");
            System.out.println("3. End Game");
            System.out.print("선택 > ");
            
            int sel = sc.nextInt();
            switch(sel)
            {
                case 1: 
                    // 실제 게임 로직 작성
                    GameStart();
                    break;
                case 2: 
                    // 전적 출력 후 선택화면으로
                    System.out.println("<< 당신의 전적 >>");
                    System.out.println("WIN : " + myScore);
                    System.out.println("LOSE : " + comScore);
                    break;
                
                case 3: bool = false; 
                    break;
            }
            
        }
        
    }
    
    
    public void GameStart()
    {
        System.out.println("<< Game Start >>");
        System.out.println();
        
        int startNum = 0;
        int isEnd = 0;
        
        while(true)
        {
            // 내 차례
            System.out.println("<<Your Turn>>");
            System.out.print("Input Number (1~3) : ");
            int userN = sc.nextInt();
            
            if(userN < 1 || userN > 3)
            {
                System.out.println("1~3 사이의 수만 입력해주세요.");
                continue;
            }
            
           
            for(int i = 0; i < userN; i++)
            {
                startNum++;
                System.out.println(startNum + "!");
                
                if(startNum >= 31)
                {
                    isEnd = 1;
                    comScore++;
                    
                    System.out.println("당신이 패배했습니다.");
                    System.out.println();
                    break;
                }  
            }
            
            System.out.println();
            
            if(isEnd == 1)
                break;
            
            // 컴퓨터 차례
            System.out.println("<<Computer Trun>>");
           
            int comN = 0;
      
                
            comN = r.nextInt(3) + 1;
            
            
            // 승리조건 : startNum 이 26이면 무조건 진다.
            // 26 아래 수 일때는 상대에게 26을 주게하고
            // 27 이상일땐 30을 외쳐 상대를 지게 한다.
            if(startNum >= 23 && startNum <= 25)
            {
                comN = 26 - startNum;
            }
            else if(startNum >= 27 && startNum <= 29)
            {
                comN = 30 - startNum;
            }
          
                
            for(int i = 0; i < comN; i++)
            {
                startNum++;
                System.out.println(startNum + "!");
                
                if(startNum >= 31)
                {
                    isEnd = 1;
                    myScore++;              
                    
                    System.out.println("당신이 승리했습니다.");
                    System.out.println();
                    break;
                }  
            }
            
            System.out.println();
            
            if(isEnd == 1)
                break;
        
        }
        
     
        
        
    }
    
    
}
