package kh.lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int LOTTO_MAX = 6;
    
    public void main()
    {
        System.out.println("==== 로또 프로그램 ====");
        
        int count = 0;
        int [] insertNum = new int[LOTTO_MAX]; 
        
        // 사용자 번호 입력
        while(count < insertNum.length)
        {
            boolean overlapNum = false;
            
            
            System.out.print((count+1) + "번째 번호 입력 : ");
            insertNum[count] = sc.nextInt();
            
            // 중복검사
            for(int i = 0; i < insertNum.length; i ++)
            {
                if(i == count)
                {
                    continue;
                }
                else
                {
                    if(insertNum[i] == insertNum[count])
                    {
                        System.out.println("중복된 숫자입니다.");
                        overlapNum = true;
                        break;
                    }
                }
                
            }
            
            // 중복된 수가 있을 시 다시 입력
            if(overlapNum)
            {
                continue;
            }
              
            
            count++;
        }
        
        int winCount = 0;
        
        while(true)
        {
            
            // 정답 로또 생성
            int lottoCount = 0;
            int [] lottoNum = new int[LOTTO_MAX];
            
            while(lottoCount < lottoNum.length)
            {
                boolean overlapNum = false;
                
                
                lottoNum[lottoCount] = r.nextInt(45) + 1;
                
                // 중복검사
                for(int i = 0; i < lottoNum.length; i ++)
                {
                    if(i == lottoCount)
                    {
                        continue;
                    }
                    else
                    {
                        if(lottoNum[i] == lottoNum[lottoCount])
                        { 
                            //System.out.println("로또 생성하다가 " + (lottoCount+1) + "번째 수에 중복 발생");
                            overlapNum = true;
                            break;
                        }
                    }
                }
                
             // 중복된 수가 있을 시 다시 생성
                if(overlapNum)
                {
                    continue;
                }
                
                
                lottoCount++;
            }
            
            
            // 맞은 갯수 검사
            int sameNum = 0;
            
            for(int i = 0; i < insertNum.length; i++)
            {
                for(int j = 0; j < lottoNum.length; j++)
                {
                    if(insertNum[i] == lottoNum[j])
                    {
                        sameNum++;
                    }
                    
                }    
            }
            
            // 입력받은 로또번호와 정답로또번호, 맞은갯수 출력
            
            for(int i = 0; i < insertNum.length; i++)
            {
                System.out.print(insertNum[i] + " ");
            }
                
            System.out.println();
            
            for(int i = 0; i < lottoNum.length; i++)
            {
                System.out.print(lottoNum[i] + " ");
            }
            
            System.out.println("맞은 갯수 : " + sameNum);
            
            winCount++;
            
            
            
            if(sameNum == 6)
            {
                System.out.println(winCount + "만에 1등 당첨!");
                break;
            }
            else
            {
                System.out.println(winCount + "회차 실패ㅠ");
            }
            
        }
        
        
        

    }
    
}
