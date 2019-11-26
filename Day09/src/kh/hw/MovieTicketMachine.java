package kh.hw;

import java.util.Scanner;


public class MovieTicketMachine
{
    Scanner sc = new Scanner(System.in);
    
    MovieTicket mt = new MovieTicket(); 
    boolean check = false;
    
    public void main() 
    {
        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            
            System.out.println("==== 메뉴 선택 ====");
            System.out.println("1. 예매");
            System.out.println("2. 예매확인");
            System.out.println("3. 예매취소");
            System.out.println("4. 종료");
            System.out.println("================");
            System.out.print("입력 : ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: ticketing();
                    break;
                case 2: checkTicket();
                    break;
                case 3: cancelTicket();
                    break;
                case 4: return;
            }
 
        }
    }
    
    
    public void ticketing()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        while(true)
        {
            
            System.out.println("예매를 시작합니다.");
            System.out.println();
            
            System.out.println("===== 상영 중인 영화 목록 ====");
            System.out.println("라이온킹");
            System.out.println("알라딘");
            System.out.println("엄복동");
            System.out.print("예매하실 영화 제목을 입력해주세요 : ");
            mt.setMovieName(sc.next());
            
            System.out.println("===== " + mt.getMovieName() + " 예매가능한 극장 ====");
            System.out.println("당산");
            System.out.println("건대입구");
            System.out.println("안양");
            System.out.print(mt.getMovieName() + " 예매하실 극장을 입력해주세요 : ");
            mt.setTheaterName(sc.next());
            
            sc.nextLine();
            
            System.out.println("===== " + mt.getMovieName() + " " + mt.getTheaterName() + "점 예매가능한 영화 시간 ====");
            System.out.println("오후 6 : 30");
            System.out.println("오후 7 : 50");
            System.out.println("오후 9 : 15");
            System.out.print(mt.getTheaterName() + "점 예매하실 영화 시간을 입력해주세요 : ");
            mt.setStartTime(sc.nextLine());
            

            System.out.println("===== 예매가능한 좌석 ====");
            System.out.println("A열 5번");
            System.out.println("D열 12번");
            System.out.println("F열 8번");
            System.out.print("예매하실 좌석을 입력해주세요 : ");
            mt.setSit(sc.nextLine());

            
            System.out.println("입력하신 정보가 " + mt.getMovieName() + " " + mt.getTheaterName() + "점 " + mt.getStartTime() + " "
                    + mt.getSit() + "이 맞으십니까?");
            System.out.print("입력하신 정보가 맞다면 1 / 다시 예매하시려면 2를 입력하세요 : ");
            int sel = sc.nextInt();
            
            if(sel == 2)
            {
                continue;
            }
            
            System.out.println("예매 완료");
            check = true;
            break;
        }
        
        
    }
    
    
    public void checkTicket()
    {
        if(!check)
        {
            System.out.println("예매하신 티켓이 없습니다. 예매를 진행해주세요!");
            return;
        }
        
        System.out.println("예매하신 티켓은 " + mt.getMovieName() + " " + mt.getTheaterName() + "점 " 
        + mt.getStartTime() + " " + mt.getSit() + "입니다.");
    }
    
    
    public void cancelTicket()
    {
        if(!check)
        {
            System.out.println("예매하신 티켓이 없습니다.");
            return;
        }
        
        System.out.println("예매하신 티켓은 " + mt.getMovieName() + " " + mt.getTheaterName() + "점 " 
                + mt.getStartTime() + " " + mt.getSit() + "입니다.");
        
        System.out.print("예매를 취소하시겠습니까?(y/n): ");
        char sel = sc.next().charAt(0);
        
        if(sel == 'y')
        {
            mt = new MovieTicket(); 
            check = false;
            System.out.println("예매가 취소되었습니다.");
        }
        else
        {
            System.out.println("예매취소가 취소되었습니다.");
        }
    }
}
