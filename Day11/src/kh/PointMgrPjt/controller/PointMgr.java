package kh.PointMgrPjt.controller;

import java.util.Scanner;

import kh.PointMgrPjt.vo.Gold;
import kh.PointMgrPjt.vo.Grade;
import kh.PointMgrPjt.vo.GradeIndex;
import kh.PointMgrPjt.vo.Silver;
import kh.PointMgrPjt.vo.Vip;
import kh.PointMgrPjt.vo.Vvip;



public class PointMgr
{
    //1. 회원 추가
    // -> 등급을 물어보고 등급에 맞는 객체를 생성
    // 등급 입력(Silver, Gold, Vip) : 
    // 등급, 이름, 포인트 입력받음
    // 보너스는 자동으로 아래와 같이 대입
    // silver = point * 0.02
    // gold = point * 0.03
    // vip = popint * 0.05

    //2. 회원 전체 정보 출력
        // silver -> gold -> vip 배열 순서대로 출력
    
    //3. 회원정보 출력(1명)
    //4. 수정
        // 검색된 객체 삭제 -> 새로운 객체 생성해서 배열 마지막으로
    //5. 삭제
    
    //탐색 메소드 -> silver, gold, vip를 다 검색 해야함.
        
    
    Scanner sc = new Scanner(System.in);
   
    
    Grade [] g = new Grade[20];
    int index = 0;
    
    
    public void main()
    {
        while(true)
        {
            System.out.println();
            
            
            System.out.println("<<<<< 포인트 관리 프로그램 >>>>>");
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
                case 1: insertMember();
                    break;
                case 2: printAll();
                    break;
                case 3: printOne();
                    break;
                case 4: updateMember();
                    break;
                case 5: deleteMember();
                    break;
                case 0: System.out.println("시스템을 종료합니다.");
                    return;
                default:System.out.println("잘못입력하셨습니다.");
                    break;
            }
            
            
        }
       
        
    }
    
    public void insertMember()
    {
        System.out.println("");
        
        System.out.println("<<<<< 회원 추가 >>>>>");
        
        insert(null);
        
        System.out.println("회원 추가 완료");
        

    }
    
  
    public void printAll()
    {
        System.out.println();
        
        System.out.println("<<<<< 전체 멤버 정보 >>>>>");
        System.out.println("등급\t이름\t포인트\t보너스");
        
        for(int i =0; i< index; i++)
        {
            System.out.println(g[i].toString());
        }
  
    }
    
    
    public void printOne()
    {
        System.out.println();
        
        System.out.println("<<<<< 회원 정보 출력 >>>>>");
        System.out.print("조회할 회원 이름을 입력하세요 : ");
        String insertName = sc.next();
        
        int searchMember = search(insertName);
        
        if(searchMember == -1)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            System.out.println(g[searchMember].toString());
        }
        
        
    }
    
    public void updateMember()
    {
        System.out.println();
        
        System.out.println("<<<<< 회원 정보 수정 >>>>>");
        System.out.print("수정할 회원 이름을 입력하세요 : ");
        String insert = sc.next();
        
        int searchMember = search(insert);
        
        if(searchMember == -1)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            System.out.print("수정할 회원 등급 입력(Silver/Gold/Vip/Vvip) :");
            String grade = sc.next();
            System.out.print("수정할 회원 포인트 입력 : ");
            int point = sc.nextInt();
            
            switch(grade)
            {
                case "Silver" :
                    g[searchMember] = new Silver(grade, insert, point);
                    break;
                case "Gold" :
                    g[searchMember] = new Gold(grade, insert, point);
                    break;
                case "Vip" :
                    g[searchMember] = new Vip(grade, insert, point);
                    break;
                case "Vvip" :
                    g[searchMember] = new Vvip(grade, insert, point);
                    break;
            }
            
            
            System.out.println("정보 수정 완료");
        }
        
    }
    
    public void deleteMember()
    {
        System.out.println();
        
        System.out.println("<<<<< 회원 정보 삭제 >>>>>");
        System.out.print("삭제할 회원 이름을 입력하세요 : ");
        String insertName = sc.next();
        
        int searchMember = search(insertName);
        
        if(searchMember == -1)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            delete(searchMember);
            
            System.out.println("정보 삭제 완료");
        }
        
        
    }
    
    
    
    
    
    
    //매개변수 name == null 이면 삽입, 아니면 변경
    public void insert(String name)
    {
        System.out.print("등급 입력 (Silver/Gold/Vip/Vvip) : ");
        String grade = sc.next();

        
        if(name == null)
        {
            System.out.print("이름 입력 : ");
            name = sc.next();
        }
        
        System.out.print("포인트 입력 : ");
        int point = sc.nextInt();
        
        
        switch(grade)
        {
            case "Silver" :
                g[index] = new Silver(grade, name ,point);
                index++;
                break;
            case "Gold" :
                g[index] = new Gold(grade, name ,point);
                index++;
                break;
            case "Vip" :
                g[index] = new Vip(grade, name ,point);
                index++;
                break;
            case "Vvip" :
                g[index] = new Vvip(grade, name ,point);
                index++;
                break;
        }
        
    }
    
    
    // 삭제
    public void delete(int searchMember)
    {
        
        if(searchMember == 9)
        {
            g[searchMember] = null;
            
            index--;
        }
        else
        {
            for(int i = searchMember; i < index - 1; i++)
            {
                g[i] = g[i + 1];
            }
            
            index--;
            g[index] = null;
        }
        
        

    }
    
    
    // 탐색
    public int search(String insertName)
    {

        for(int i = 0; i < index; i++)
        {
            if(insertName.equals(g[i].getName()))
            {
                return i;
            }
        }
  
        return -1;
    }
    
    
}
