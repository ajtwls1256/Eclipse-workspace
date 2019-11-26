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
        System.out.println("==== �ζ� ���α׷� ====");
        
        int count = 0;
        int [] insertNum = new int[LOTTO_MAX]; 
        
        // ����� ��ȣ �Է�
        while(count < insertNum.length)
        {
            boolean overlapNum = false;
            
            
            System.out.print((count+1) + "��° ��ȣ �Է� : ");
            insertNum[count] = sc.nextInt();
            
            // �ߺ��˻�
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
                        System.out.println("�ߺ��� �����Դϴ�.");
                        overlapNum = true;
                        break;
                    }
                }
                
            }
            
            // �ߺ��� ���� ���� �� �ٽ� �Է�
            if(overlapNum)
            {
                continue;
            }
              
            
            count++;
        }
        
        int winCount = 0;
        
        while(true)
        {
            
            // ���� �ζ� ����
            int lottoCount = 0;
            int [] lottoNum = new int[LOTTO_MAX];
            
            while(lottoCount < lottoNum.length)
            {
                boolean overlapNum = false;
                
                
                lottoNum[lottoCount] = r.nextInt(45) + 1;
                
                // �ߺ��˻�
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
                            //System.out.println("�ζ� �����ϴٰ� " + (lottoCount+1) + "��° ���� �ߺ� �߻�");
                            overlapNum = true;
                            break;
                        }
                    }
                }
                
             // �ߺ��� ���� ���� �� �ٽ� ����
                if(overlapNum)
                {
                    continue;
                }
                
                
                lottoCount++;
            }
            
            
            // ���� ���� �˻�
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
            
            // �Է¹��� �ζǹ�ȣ�� ����ζǹ�ȣ, �������� ���
            
            for(int i = 0; i < insertNum.length; i++)
            {
                System.out.print(insertNum[i] + " ");
            }
                
            System.out.println();
            
            for(int i = 0; i < lottoNum.length; i++)
            {
                System.out.print(lottoNum[i] + " ");
            }
            
            System.out.println("���� ���� : " + sameNum);
            
            winCount++;
            
            
            
            if(sameNum == 6)
            {
                System.out.println(winCount + "���� 1�� ��÷!");
                break;
            }
            else
            {
                System.out.println(winCount + "ȸ�� ���Ф�");
            }
            
        }
        
        
        

    }
    
}
