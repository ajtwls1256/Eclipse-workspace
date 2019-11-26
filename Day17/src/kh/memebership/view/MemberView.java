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
            System.out.println("\n===== ȸ�� ���� ���α׷� =====");
            System.out.println("1. ȸ�� ����");
            System.out.println("2. ȸ�� Ȯ��");
            System.out.println("3. ȸ�� ��ȸ");
            System.out.println("4. ȸ�� ����");
            System.out.println("5. ȸ�� ����");
            System.out.println("0. ����");
            System.out.print("���� > ");
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
                case 0: System.out.println("���α׷��� �����մϴ�.");
                    return;
                default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
                    break;           
            }

        }

    }
    
    public void memberJoin()
    {
        System.out.println("\n===== ȸ�� ���� =====");
        System.out.print("���̵� �Է� : ");
        String userId = sc.next();
        System.out.print("��й�ȣ �Է� : ");
        String userPwd = sc.next();
        System.out.print("�̸� �Է� : ");
        String userName = sc.next();
        System.out.print("���� �Է� : ");
        int age = sc.nextInt();
        System.out.print("����ó �Է� : ");
        sc.nextLine();
        String phoneNumber = sc.next();
        
        Member m = new Member(userId, userPwd, userName, age, phoneNumber);
        
        if(!memberController.memberJoin(m))
        {
            System.out.println("�ߺ��� ���̵� �Դϴ�!");
            return;
        }
        
        System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!");
        
    }
    
    public void memberCheck()
    {
        System.out.println("\n===== ȸ�� Ȯ�� =====");
        System.out.print("���̵� �Է� : ");
        String userId = sc.next();
        
        // ���̵� ������
        if(memberController.memberCheck(userId))
        {
            System.out.println("�����ϴ� ���̵� �Դϴ�!");
            return;
        }
        
        System.out.println("���������ʴ� ���̵� �Դϴ�!");
    }
    public void memberSelect()
    {
        System.out.println("\n===== ȸ�� �˻� =====");
        System.out.print("���̵� �Է� : ");
        String userId = sc.next();
        
        Member m = memberController.memberSelect(userId);
        
        if(m == null)
        {
            System.out.println("���������ʴ� ���̵��Դϴ�!");
            return;
        }
        
        System.out.println("���̵�\t��й�ȣ\t�̸�\t����\t����ȣ");
        System.out.println(m.getUserId() + "\t" + m.getUserPwd() + "\t\t" + m.getUserName() + "\t" + m.getAge() + "\t" + m.getPhoneNumber());
        
    }
    public void memberModify()
    {
        System.out.println("\n===== ȸ�� ���� =====");
        System.out.print("���̵� �Է� : ");
        String userId = sc.next();
        
        Member m = memberController.memberSelect(userId);
        
        if(m == null)
        {
            System.out.println("���������ʴ� ���̵��Դϴ�!");
            return;
        }
        
        System.out.print("��й�ȣ �Է� : ");
        String userPwd = sc.next();
        System.out.print("�̸� �Է� : ");
        String userName = sc.next();
        System.out.print("���� �Է� : ");
        int age = sc.nextInt();
        System.out.print("����ó �Է� : ");
        sc.nextLine();
        String phoneNumber = sc.next();
        
        m = new Member(m.getUserId(), userPwd, userName, age, phoneNumber);
        
        if(memberController.memberModify(m))
        {
            System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!");
        }
    }
    
    public void memberDelete()
    {
        System.out.println("\n===== ȸ�� ���� =====");
        System.out.print("���̵� �Է� : ");
        String userId = sc.next();
        
        
        if(memberController.memberDelete(userId))
        {
            System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!");
            return;
        }
        
        System.out.println("ȸ�� ������ �����߽��ϴ�!");
        
    }
    
    
    
}
