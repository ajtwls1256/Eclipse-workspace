package kh.pointmanager.view;

import java.util.Scanner;

import kh.pointmanager.controller.pointMgr;
import kh.pointmanager.vo.Gold;
import kh.pointmanager.vo.Grade;
import kh.pointmanager.vo.Silver;
import kh.pointmanager.vo.Vip;



public class View
{
    Scanner sc = new Scanner(System.in);
    pointMgr pm = new pointMgr();
    
    
    public void main()
    {
        while(true)
        {
            System.out.println("\n===== 포인트 관리 시스템 =====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회(전체)");
            System.out.println("3. 회원 조회(1명)");
            System.out.println("4. 회원 수정");
            System.out.println("5. 회원 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: insert();
                    break;
                case 2: printAll();
                    break;
                case 3: printOne();
                    break;
                case 4: update();
                    break;
                case 5: delete();
                    break;
                case 0: System.out.println("프로그램을 종료합니다.");
                    return;
                default : System.out.println("잘못 입력하셨습니다."); return;
            }
            
        }
        
    }
    
    
    public void insert()
    {
        System.out.println("\n===== 회원 등록 =====");
        System.out.print("등록하실 회원의 등급을 입력하세요(Silver,Gold,Vip) : ");
        String grade = sc.next();
        System.out.print("등록하실 회원의 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("등록하실 회원의 포인트를 입력하세요 : ");
        int point = sc.nextInt();
        
        
        switch(grade)
        {
            case "Silver" :
                pm.insert(new Silver(grade, name, point));
                break;
            case "Gold" :
                pm.insert(new Gold(grade, name, point));
                break;
            case "Vip" :
                pm.insert(new Vip(grade, name, point));
                break;
                
            default : System.out.println("등급을 잘못 입력하셨습니다."); return;
        }
        
        System.out.println("회원 가입이 완료되었습니다!");
        
    }
    
    
    public void printAll()
    {
        System.out.println("\n===== 회원 조회(전체) =====");
        
        
        Grade [] member = pm.getMember();
        int index = pm.getMemberIndex();
        
        
        System.out.println("등급\t이름\t포인트\t보너스");
        for(int i =0; i <index; i++)
        {
            System.out.println(member[i].getGrade() + "\t" + member[i].getName() + "\t" + member[i].getPoint() + "\t" + member[i].getBonus());
        }
        
        
    }
    
    
    public void printOne()
    {
        System.out.println("\n===== 회원 조회(1명) =====");
        
        System.out.print("조회하실 학생의 이름을 입력하세요 : ");
        String name = sc.next();
        
        int result = pm.search(name);
        
        if(result == -1)
        {
            System.out.println("일치하는 회원이 없습니다.");
            return;
        }
        
        Grade [] member = pm.getMember();
        
        System.out.println("등급\t이름\t포인트\t보너스");
        System.out.println(member[result].getGrade() + "\t" + member[result].getName() + "\t" + member[result].getPoint() + "\t" + member[result].getBonus());
        
    }
    
    public void update()
    {
        System.out.println("\n===== 회원 수정 =====");
        
        System.out.print("수정하실 회원의 이름을 입력하세요 : ");
        String name = sc.next();
        
        int result = pm.search(name);
        
        if(result == -1)
        {
            System.out.println("일치하는 회원이 없습니다.");
            return;
        }
        
        System.out.print("수정하실 회원의 등급을 입력하세요(Silver,Gold,Vip) : ");
        String grade = sc.next();
        System.out.print("수정하실 회원의 이름을 입력하세요 : ");
        String reName = sc.next();
        System.out.print("수정하실 회원의 포인트를 입력하세요 : ");
        int point = sc.nextInt();
        
        switch(grade)
        {
            case "Silver" :
                pm.update(new Silver(grade, reName, point), result);
                break;
            case "Gold" :
                pm.update(new Gold(grade, reName, point), result);
                break;
            case "Vip" :
                pm.update(new Vip(grade, reName, point), result);
                break;
                
            default : System.out.println("등급을 잘못 입력하셨습니다."); return;
        }
        
        System.out.println("수정 완료!");

    }
    
    
    
    
    public void delete()
    {
        System.out.println("\n===== 회원 삭제 =====");
        
        System.out.print("삭제하실 회원의 이름을 입력하세요 : ");
        String name = sc.next();
        
        int result = pm.search(name);
        
        if(result == -1)
        {
            System.out.println("일치하는 회원이 없습니다.");
            return;
        }
        
        pm.delete(result);
        
        System.out.println("삭제 완료!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
