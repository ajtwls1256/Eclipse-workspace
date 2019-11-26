package kh.setLotto.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LottoController
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    
    public void main()
    {
        HashSet<Integer> myLotto = new HashSet<>();
        
        
        System.out.println("\n===== �ζ� ���α׷� =====");
        
        while(myLotto.size() < 6)
        {
            System.out.print((myLotto.size()+1) + "��° ��ȣ �Է� : ");
            int sel = sc.nextInt();
            
            if(sel < 1 || sel > 45)
            {
                System.out.println("1~45 ������ ���� �Է����ּ���!");
                continue;
            }
            
            if(!myLotto.add(sel))
            {
                System.out.println("�ߺ��� �����Դϴ�!");
                continue;
            }
        }
        
        int count = 0;
        int round = 1;
        
        while(count != 6)
        {
            count = 0;
            
            HashSet<Integer> comLotto = new HashSet<>();
            
            while(comLotto.size() < 6)
            {
                int sel = r.nextInt(45) + 1;
                
                if(sel < 1 || sel > 45)
                {
                    System.out.println("��ǻ�� ���� �� ���ڹ߻� random��������");
                    continue;
                }
                
                if(!comLotto.add(sel))
                {
//                    System.out.println("��ǻ�� �ߺ��� ���ڹ߻�");
                    continue;
                }
            }
            
            
            ArrayList<Integer> my = new ArrayList<>(myLotto);
            ArrayList<Integer> com = new ArrayList<>(comLotto);
            
        
            
            for(int i=0; i<com.size(); i++)
            {
                for(int j=0; j<my.size(); j++)
                {
                    if(com.get(i) == my.get(j))
                    {
                        count++;
                        break;
                    }
                }
            }
            
            
            for(int i =0; i<my.size(); i++)
                System.out.print(my.get(i) + " ");
            
            System.out.println();
            
            for(int i =0; i<com.size(); i++)
                System.out.print(com.get(i) + " ");
            
            
            System.out.println(round + "ȸ�� ���� ���� : " + count);
            round++;
        }
        
        
    }
}
