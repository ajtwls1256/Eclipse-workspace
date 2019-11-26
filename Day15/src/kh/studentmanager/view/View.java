package kh.studentmanager.view;

import java.util.Scanner;

import kh.studentmanager.controller.StuMgr;
import kh.studentmanager.vo.Student;

public class View
{
    Scanner sc = new Scanner(System.in);
    
    StuMgr sm = new StuMgr();
    
    
    public void main()
    {
        while(true)
        {
            System.out.println("\n===== �л� ���� ���α׷� =====");
            System.out.println("1. �л� ���");
            System.out.println("2. �л� ���� ���(��ü)");
            System.out.println("3. �л� ���� ���(1��)");
            System.out.println("4. �л� ���� ����");
            System.out.println("5. �л� ���� ����");
            System.out.println("0. ����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: insert();
                    break;
                case 2: printAll();
                    break;
                case 3: printOne();
                    break;
                case 4: updateStudent();
                    break;
                case 5: deleteStudent();
                    break;
                case 0: System.out.println("���α׷��� �����մϴ�."); 
                    return;
                default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
                    break;
            }
            
            
        }
    }
    
    
    public void insert()
    {
        System.out.println("\n===== �л� ��� =====");
        System.out.print("�̸� �Է� : ");
        String name = sc.next();
        System.out.print("���� �Է� : ");
        int age = sc.nextInt();
        System.out.print("�ּ� �Է� : ");
        sc.nextLine();
        String addr = sc.nextLine();
        
        Student s = new Student(name, age, addr);
        sm.insert(s);
        
        //sm.insert(name, age, addr);
    
    
        System.out.println("ȸ�� ���� �Ϸ�!!");
    
    }
    
    
    
    public void printAll()
    {
        System.out.println("\n===== �л� ��ü ���� ��� =====");
        
        Student [] s = sm.printAll();
        
        System.out.println("�̸�\t����\t�ּ�");
        for(int i = 0; i<sm.getCount(); i++)
        {
            System.out.println(s[i].getName() + "\t" + s[i].getAge() + "\t" + s[i].getAddr());
        }
        
        
    }
    
    public void printOne()
    {
        System.out.println("\n===== �л� ��ü ���� ���(1��) =====");
        System.out.print("��ȸ�� �л� �̸� �Է� : ");
        String name = sc.next();
        int result = sm.search(name);
        
        if(result == -1)
        {
            System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
            return;
        }
        
        Student s = sm.printOne(result);
        
        System.out.println("�̸�\t����\t�ּ�");
        System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
        
    }
    
    public void updateStudent()
    {
        System.out.println("\n===== �л� ���� ���� =====");
        System.out.print("������ �л� �̸� �Է� : ");
        String name = sc.next();
        int result = sm.search(name);
        
        if(result == -1)
        {
            System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
            return;
        }
        
        System.out.print("������ �̸� �Է� : ");
        String reName = sc.next();
        System.out.print("������ �л� ���� �Է� : ");
        int age = sc.nextInt();
        System.out.print("������ �л� �ּ� �Է� : ");
        sc.nextLine();
        String addr = sc.nextLine();
        
        Student s = new Student(reName, age, addr);
        sm.updateStudent(s, result);
        
        
        System.out.println("���� ������ �Ϸ�Ǿ����ϴ�!");
    }
    
    public void deleteStudent()
    {
        System.out.println("\n===== �л� ���� ���� =====");
        System.out.print("������ �л� �̸� �Է� : ");
        String name = sc.next();
        int result = sm.search(name);
        
        if(result == -1)
        {
            System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
            return;
        }
        
        sm.deleteStudent(result);
        
        System.out.println("���� ������ �Ϸ�Ǿ����ϴ�!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
