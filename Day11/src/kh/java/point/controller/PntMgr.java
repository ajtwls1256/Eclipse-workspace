package kh.java.point.controller;

import java.util.Scanner;

import kh.java.point.model.vo.Gold;
import kh.java.point.model.vo.Grade;
import kh.java.point.model.vo.Silver;
import kh.java.point.model.vo.Vip;
import kh.java.point.model.vo.Vvip;

public class PntMgr implements PntMgrInterface
{
    Scanner sc = new Scanner(System.in);
    
    private Grade [] member = new Grade[30];
    int index = 0;
    
    
    public PntMgr() {}
   
    @Override
    public void start()           //전체진행
    {
        while(true)
        {
            System.out.println();
            
            
            System.out.println("===== 포인트 관리 프로그램2 =====");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 정보 보기<전체>");
            System.out.println("3. 회원 정보 보기<1명>");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 회원 정보 삭제");
            System.out.println("0. 프로그램 종료");
            System.out.print("선택 > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: insertData();
                    break;
                case 2: printData();
                    break;
                case 3: printDataOne();
                    break;
                case 4: modifyData();
                    break;
                case 5: deleteData();
                    break;
                case 0: System.out.println("시스템을 종료합니다.");
                    return;
                default:System.out.println("잘못입력하셨습니다.");
                    break;
            }
        }
    }
    
    @Override
    public void insertData()       //회원가입
    {
        System.out.println();
        
        
        if(index > 30)
        {
            System.out.println("가입한 회원이 너무 많습니다!");
            return;
        }
        
        
        System.out.println("===== 회원 가입 =====");
        System.out.print("가입하실 회원의 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("가입하실 회원의 등급을 입력하세요(Silver/Gold/Vip/Vvip) : ");
        String grade = sc.next();
        System.out.print("가입하실 회원의 점수를 입력하세요 : ");
        int score = sc.nextInt();
        
        switch(grade)
        {
            case "Silver" : member[index] = new Silver(name, grade, score);
                break;
            case "Gold" : member[index] = new Gold(name, grade, score);
                break;
            case "Vip" : member[index] = new Vip(name, grade, score);
                break;
            case "Vvip" : member[index] = new Vvip(name, grade, score);
            break;    
                
            default : System.out.println("등급을 잘못 입력하셨습니다."); 
                return;
        }
        
        index++;
        
        System.out.println("회원 가입이 완료되었습니다!");
        
    }
    
    
    
    
    
    
    
    
    
    @Override
    public void printData()       //전체출력
    {
        System.out.println();
        
        
        System.out.println("===== 회원 전체 출력 =====");
        System.out.println("이름\t등급\t점수\t이자포인트\t");
        
        for(int i =0; i<index; i++)
        {
            System.out.println(member[i].getName() + "\t" + member[i].getGrade() + "\t" + member[i].getScore() + "\t" + member[i].getInterest());
        }
        
    }
    
    @Override
    public void printDataOne()    //1명출력
    {
        System.out.println();
        
        System.out.println("===== 회원 검색 =====");
        System.out.print("검색하실 회원의 이름을 입력해주세요 : ");
        
        int search = searchData();
        
        if(search == -1)
        {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }
        
        System.out.println("이름\t등급\t점수\t이자포인트\t");
        System.out.println(member[search].getName() + "\t" + member[search].getGrade() + "\t" + member[search].getScore() + "\t" + member[search].getInterest());
         
    }
    
    @Override
    public void modifyData()      //수정
    {
        System.out.println();
        
        System.out.println("===== 회원 정보 수정 =====");
        System.out.print("수정하실 회원의 이름을 입력해주세요 : ");
        
        int search = searchData();
        
        if(search == -1)
        {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }
        
        System.out.print("수정하실 회원의 등급을 입력하세요(Silver/Gold/Vip) : ");
        String grade = sc.next();
        System.out.print("수정하실 회원의 점수를 입력하세요 : ");
        int score = sc.nextInt();
        
        
        member[search].setGrade(grade); 
        member[search].setScore(score);
        
        
    }
    
    
    
    @Override
    public void deleteData()      //삭제
    {
        System.out.println();
        
        System.out.println("===== 회원 정보 삭제 =====");
        System.out.print("삭제하실 회원의 이름을 입력해주세요 : ");
        
        int search = searchData();
        
        
        if(search == -1)
        {
            System.out.println("존재하지 않는 회원입니다.");
            return;
        }
        
        
        
        
        for(int i=search; i<index -1; i++)
        {
            member[i] = member[i + 1];
        }
        
        index--;
        member[index] = null;
        
        
        
        System.out.println("회원 정보 삭제가 완료되었습니다!");

    }
    
    
    @Override
    public int searchData()       //조회  
    {    
        String name = sc.next();
        
        for(int i =0; i< index; i++)
        {
            if(name.equals(member[i].getName()))
                return i;
        }

        return -1;
    }
    
}
