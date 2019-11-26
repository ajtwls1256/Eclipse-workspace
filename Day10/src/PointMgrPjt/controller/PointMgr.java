package PointMgrPjt.controller;

import java.util.Scanner;

import PointMgrPjt.vo.Gold;
import PointMgrPjt.vo.GradeIndex;
import PointMgrPjt.vo.Silver;
import PointMgrPjt.vo.Vip;
import PointMgrPjt.vo.Vvip;

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
    
    // search 후 등급과 인덱스를 담고있는 GradeIndex 클래스
    GradeIndex gradeIndex;
    
    
    Silver [] silver = new Silver[10];
    int sIndex = 0;
    Gold [] gold = new Gold[10];
    int gIndex = 0;
    Vip [] vip = new Vip[10];
    int vIndex = 0;
    Vvip [] vvip = new Vvip[10];
    int vvIndex = 0;
    
    
    
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
        
        for(int i =0; i< sIndex; i++)
        {
            System.out.println(silver[i].toString());
        }
        for(int i =0; i< gIndex; i++)
        {
            System.out.println(gold[i].toString());
        }
        for(int i =0; i< vIndex; i++)
        {
            System.out.println(vip[i].toString());
        }
        for(int i =0; i< vvIndex; i++)
        {
            System.out.println(vvip[i].toString());
        }
    }
    
    
    public void printOne()
    {
        System.out.println();
        
        System.out.println("<<<<< 회원 정보 출력 >>>>>");
        System.out.print("조회할 회원 이름을 입력하세요 : ");
        String insertName = sc.next();
        
        GradeIndex searchMember = search(insertName);
        
        if(searchMember == null)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            String searchGrade = searchMember.getGrade();
            int searchIndex = searchMember.getIndex();
            

            if(searchGrade.equals("Silver"))
            {
                System.out.println(silver[searchIndex].toString());
            }
            else if(searchGrade.equals("Gold"))
            {
                System.out.println(gold[searchIndex].toString());
            }
            else if(searchGrade.equals("Vip"))
            {
                System.out.println(vip[searchIndex].toString());
            }
            else if(searchGrade.equals("Vvip"))
            {
                System.out.println(vvip[searchIndex].toString());
            }
        }
        
        
    }
    
    public void updateMember()
    {
        System.out.println();
        
        System.out.println("<<<<< 회원 정보 수정 >>>>>");
        System.out.print("수정할 회원 이름을 입력하세요 : ");
        String insert = sc.next();
        
        GradeIndex searchMember = search(insert);
        
        if(searchMember == null)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            delete(searchMember);

            insert(insert);
            
            System.out.println("정보 수정 완료");
        }
        
    }
    
    public void deleteMember()
    {
        System.out.println();
        
        System.out.println("<<<<< 회원 정보 삭제 >>>>>");
        System.out.print("삭제할 회원 이름을 입력하세요 : ");
        String insertName = sc.next();
        
        GradeIndex searchMember = search(insertName);
        
        if(searchMember == null)
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
        switch(grade)
        {
            case "Silver" :
                if(sIndex > 10)
                {
                    System.out.println("Silver등급의 회원이 너무 많습니다.");
                    return;
                }
                break;
            case "Gold" :
                if(gIndex > 10)
                {
                    System.out.println("Gold등급의 회원이 너무 많습니다.");
                    return;
                }
                break;
            case "Vip" :
                if(vIndex > 10)
                {
                    System.out.println("Vip등급의 회원이 너무 많습니다.");
                    return;
                }
                break;
            case "Vvip" :
                if(vvIndex > 10)
                {
                    System.out.println("Vvip등급의 회원이 너무 많습니다.");
                    return;
                }
                break;
        }
 
        
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
                silver[sIndex] = new Silver(grade, name ,point);
                sIndex++;
                break;
            case "Gold" :
                gold[gIndex] = new Gold(grade, name ,point);
                gIndex++;
                break;
            case "Vip" :
                vip[vIndex] = new Vip(grade, name ,point);
                vIndex++;
                break;
            case "Vvip" :
                vvip[vvIndex] = new Vvip(grade, name ,point);
                vvIndex++;
                break;
        }
        
    }
    
    
    // 삭제
    public void delete(GradeIndex searchMember)
    {
        
        String searchGrade = searchMember.getGrade();
        int searchIndex = searchMember.getIndex();
        
        
        if(searchGrade.equals("Silver"))
        {
            
            if(searchIndex == 9)
            {
                silver[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < sIndex - 1; i++)
                {
                    silver[i] = silver[i + 1];
                }
            }

            
            sIndex--;
            silver[sIndex] = null;
            
        }
        else if(searchGrade.equals("Gold"))
        {
            
            if(searchIndex == 9)
            {
                gold[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < gIndex - 1; i++)
                {
                    gold[i] = gold[i + 1];
                }
            }

            
            gIndex--;
            gold[gIndex] = null;
            
        }
        else if(searchGrade.equals("Vip"))
        {

            if(searchIndex == 9)
            {
                vip[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < vIndex - 1; i++)
                {
                    vip[i] = vip[i + 1];
                }
            }

            
            vIndex--;
            vip[vIndex] = null;
        }   
        else if(searchGrade.equals("Vvip"))
        {

            if(searchIndex == 9)
            {
                vvip[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < vvIndex - 1; i++)
                {
                    vvip[i] = vvip[i + 1];
                }
            }

            
            vvIndex--;
            vvip[vvIndex] = null;
        }
        
    }
    
    
    // 탐색
    public GradeIndex search(String insertName)
    {
        gradeIndex = null;
        
        for(int i = 0; i < sIndex; i++)
        {
            if(insertName.equals(silver[i].getName()))
            {
                gradeIndex = new GradeIndex("Silver", i);
                return gradeIndex;
            }
        }
        
        for(int i = 0; i < gIndex; i++)
        {
            if(insertName.equals(gold[i].getName()))
            {
                gradeIndex = new GradeIndex("Gold", i);
                return gradeIndex;
            }
        }
        
        for(int i = 0; i < vIndex; i++)
        {
            if(insertName.equals(vip[i].getName()))
            {
                gradeIndex = new GradeIndex("Vip", i);
                return gradeIndex;
            }
        }
        
        for(int i = 0; i < vvIndex; i++)
        {
            if(insertName.equals(vvip[i].getName()))
            {
                gradeIndex = new GradeIndex("Vvip", i);
                return gradeIndex;
            }
        }
        
        
        return gradeIndex;
    }
    
    
}
