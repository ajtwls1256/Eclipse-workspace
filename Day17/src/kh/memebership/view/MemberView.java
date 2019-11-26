package kh.memebership.view;

import java.util.Scanner;

import kh.memebership.controller.MemberController;
import kh.memebership.vo.Member;

public class MemberView
{
    Scanner sc = new Scanner(System.in);

    private MemberController memberController = new MemberController();
    
    public void mainMenu()
    {
        while(true)
        {
            System.out.println("\n===== 회원 관리 프로그램 =====");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 확인");
            System.out.println("3. 회원 조회");
            System.out.println("4. 회원 수정");
            System.out.println("5. 회원 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: memberJoin();
                    break;
                case 2: memberCheck();
                    break;
                case 3: memberSelect();
                    break;
                case 4: memberModify();
                    break;
                case 5: memberDelete();
                    break;
                case 0: System.out.println("프로그램을 종료합니다.");
                    return;
                default: System.out.println("잘못 입력하셨습니다.");
                    break;           
            }

        }

    }
    
    public void memberJoin()
    {
        System.out.println("\n===== 회원 가입 =====");
        System.out.print("아이디 입력 : ");
        String userId = sc.next();
        System.out.print("비밀번호 입력 : ");
        String userPwd = sc.next();
        System.out.print("이름 입력 : ");
        String userName = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("연락처 입력 : ");
        sc.nextLine();
        String phoneNumber = sc.next();
        
        Member m = new Member(userId, userPwd, userName, age, phoneNumber);
        
        if(!memberController.memberJoin(m))
        {
            System.out.println("중복된 아이디 입니다!");
            return;
        }
        
        System.out.println("회원 가입이 완료되었습니다!");
        
    }
    
    public void memberCheck()
    {
        System.out.println("\n===== 회원 확인 =====");
        System.out.print("아이디 입력 : ");
        String userId = sc.next();
        
        // 아이디가 있으면
        if(memberController.memberCheck(userId))
        {
            System.out.println("존재하는 아이디 입니다!");
            return;
        }
        
        System.out.println("존재하지않는 아이디 입니다!");
    }
    public void memberSelect()
    {
        System.out.println("\n===== 회원 검색 =====");
        System.out.print("아이디 입력 : ");
        String userId = sc.next();
        
        Member m = memberController.memberSelect(userId);
        
        if(m == null)
        {
            System.out.println("존재하지않는 아이디입니다!");
            return;
        }
        
        System.out.println("아이디\t비밀번호\t이름\t나이\t폰번호");
        System.out.println(m.getUserId() + "\t" + m.getUserPwd() + "\t\t" + m.getUserName() + "\t" + m.getAge() + "\t" + m.getPhoneNumber());
        
    }
    public void memberModify()
    {
        System.out.println("\n===== 회원 수정 =====");
        System.out.print("아이디 입력 : ");
        String userId = sc.next();
        
        Member m = memberController.memberSelect(userId);
        
        if(m == null)
        {
            System.out.println("존재하지않는 아이디입니다!");
            return;
        }
        
        System.out.print("비밀번호 입력 : ");
        String userPwd = sc.next();
        System.out.print("이름 입력 : ");
        String userName = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("연락처 입력 : ");
        sc.nextLine();
        String phoneNumber = sc.next();
        
        m = new Member(m.getUserId(), userPwd, userName, age, phoneNumber);
        
        if(memberController.memberModify(m))
        {
            System.out.println("회원 수정이 완료되었습니다!");
        }
    }
    
    public void memberDelete()
    {
        System.out.println("\n===== 회원 삭제 =====");
        System.out.print("아이디 입력 : ");
        String userId = sc.next();
        
        
        if(memberController.memberDelete(userId))
        {
            System.out.println("회원 삭제가 완료되었습니다!");
            return;
        }
        
        System.out.println("회원 삭제가 실패했습니다!");
        
    }
    
    
    
}
