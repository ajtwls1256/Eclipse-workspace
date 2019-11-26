package kh.vo;

import java.util.Scanner;

public class Motel
{
    Scanner sc = new Scanner(System.in);
    
    int [] room = new int[10];
    boolean [] room2 = new boolean[10];
    
    
    public void main()
    {
        boolean bool = true;
        
        while(bool)
        {
            System.out.println("= = = = = 모텔 관리 프로그램 v.10 = = = = =");
            System.out.println("1.입실    2.퇴실    3.방보기    4.종료");
            System.out.print("선택 > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1:
                    entrance();
                    break;
                case 2:
                    departure();
                    break;
                case 3:
                    roomCheck();
                    break;
                case 4: bool = false;
                    break;
            }
           
        }
        
    }
    
    
    
    public void entrance()
    {
        System.out.print("몇번방에 입실하시겠습니까? ");
        int sel = sc.nextInt() - 1;
        
        if(room2[sel] == true)
        {
            System.out.println((sel+1) +"번방에는 현재 손님이 있습니다.");
        }
        else
        {
            room2[sel] = true;
        }
    }
    
    
    public void departure()
    {
        System.out.print("몇번방에서 퇴실하시겠습니까? ");
        int sel = sc.nextInt() - 1;
        
        if(room2[sel] == false)
        {
            System.out.println((sel+1) +"번방은 현재 비어있습니다.");
        }
        else
        {
            room2[sel] = false;
        }
    }
    
    public void roomCheck()
    {
        for(int i=0;i<10; i++)
        {
            if(room2[i] == true)
            {
                System.out.println((i+1) + "번방에는 현재 손님이 있습니다.");
            }
            else
            {
                System.out.println((i+1) + "번방이 현재 비어있습니다.");
            }
        }
    }
    
    
    
}
