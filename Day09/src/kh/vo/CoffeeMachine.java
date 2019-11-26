package kh.vo;

import java.util.Scanner;

public class CoffeeMachine
{
    Scanner sc = new Scanner(System.in);
    
    private boolean power = false;
    
    
    public void main() throws InterruptedException
    {
        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            
            System.out.println("==== 메뉴 선택 ====");
            System.out.println("1. 메뉴판");
            System.out.println("2. 주문하기");
            System.out.println("3. 전원");
            System.out.println("4. 종료");
            System.out.println("================");
            System.out.print("입력 : ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: menu();
                    break;
                case 2: order();
                    break;
                case 3: power();
                    break;
                case 4: return;
                
                default : 
            }
            
            
            
            
          
            
        }
    }
    
    



    
    
    
    private void menu()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("==== 원두 목록 ====");
        System.out.println("에티오피아");
        System.out.println("케냐");
        System.out.println("콜롬비아");
        System.out.println("과테말라");
        System.out.println("==== 커피 종류 ====");
        System.out.println("에스프레소");
        System.out.println("아메리카노");
        System.out.println("카페라떼");
        System.out.println("카페모카");
        System.out.println("==== 음료 크기 ====");
        System.out.println("Tall: 12 / Grande: 17");
        
        
    }
    
    
    private void order() throws InterruptedException
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        if(!power)
        {
            System.out.println("전원이 꺼져있습니다.");
            System.out.println("전원을 먼저 켜주세요");
            return;
        }
        
        while(true)
        {

            Coffee coffee = new Coffee();
            
            System.out.println("==== 커피 주문 ====");
            System.out.print("▶ 커피 온도 선택 <1.ice /2.Hot> : ");
            String degree = "";
            if(sc.nextInt() == 1)
            {
                degree = "Ice";
            }
            else
            {
                degree = "Hot";
            }
            coffee.setDegree(degree);
            
            System.out.println("▶ 원두선택");
            System.out.println(" ▷ 에티오피아");
            System.out.println(" ▷ 케냐");
            System.out.println(" ▷ 콜롬비아");
            System.out.println(" ▷ 과테말라");
            System.out.print("선택 : ");
            coffee.setBean(sc.next());
            System.out.println(coffee.getBean() + " 원두를 선택하셨습니다.");
            
            System.out.println("▶ 커피선택");
            System.out.println(" ▷ 에스프레소");
            System.out.println(" ▷ 아메리카노");
            System.out.println(" ▷ 카페라떼");
            System.out.println(" ▷ 카페모카");
            System.out.print("입력 : ");
            coffee.setCoffee(sc.next());
            System.out.println(coffee.getCoffee() + "를 선택하셨습니다.");
            
            System.out.println("▶ 사이즈 선택");
            System.out.println(" ▷ 12oz or Tall");
            System.out.println(" ▷ 17oz or Grande");
            System.out.print("입력 : ");
            coffee.setSize(sc.next());
            System.out.println(coffee.getSize() + "를 선택하셨습니다.");
            
            System.out.print("▷ 수량 입력 : ");
            coffee.setQuantity(sc.nextInt());
            
            System.out.println("▶ 주문 확인");

            System.out.println("입력하신 정보가 " + coffee.getDegree() + " " + coffee.getBean() + " " + coffee.getCoffee() + " "
                               + coffee.getSize() + " " + coffee.getQuantity() + "잔이 맞으십니까?");
            System.out.print("입력하신 정보가 맞다면 1 / 다시 주문 2 : ");
            int sel = sc.nextInt();
            
            if(sel == 2)
            {
                continue;
            }
            
            System.out.println("주문 완료");
            System.out.println("========================");
            Thread.sleep(1000);
            System.out.println("    ┌─┐     ");
            Thread.sleep(1000);     
            System.out.println("    │ │     ");
            Thread.sleep(1000);     
            System.out.println("    │ │     ");
            Thread.sleep(1000);     
            System.out.println("    │ │     ");
            Thread.sleep(1000);     
 
            
            System.out.println("┌───┴─┴───┐");
            System.out.println("│         │");
            System.out.println("│─────────│ ");
            System.out.println("│         │ ");
            System.out.println("│─────────│ ");
            System.out.println("│         │");
            System.out.println("└─────────┘");
            System.out.println("음료 완성");
            
            break;
        }
        

    }
    
    
    private void power()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        if(power == false)
        {
            System.out.println("전원이 켜졌습니다.");
        }
        else
        {
            System.out.println("전원이 꺼졌습니다.");
        }
        
        power = !power;
    }
}
