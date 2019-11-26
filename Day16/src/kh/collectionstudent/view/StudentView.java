package kh.collectionstudent.view;

import java.util.ArrayList;
import java.util.Scanner;

import kh.collectionstudent.controller.StudentController;
import kh.collectionstudent.vo.Student;

public class StudentView
{
    Scanner sc = new Scanner(System.in);
    
    StudentController sct = new StudentController();
    
    
    
    public void mainMenu()
    {
        while(true)
        {
            System.out.println("\n===== �л� ���� ���α׷� =====");
            System.out.println("1. �л� ��ü ���� ���");
            System.out.println("2. �л� ���� ��ȸ(�й�)");
            System.out.println("3. �л� ���� �Է�");
            System.out.println("4. �л� ���� ����");
            System.out.println("5. �л� ���� ����");
            System.out.println("0. ���α׷� ����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: selectAll();
                    break;
                case 2: selectOne();
                    break;
                case 3: insertStudent();
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
    
    public void selectAll()
    {
        System.out.println("\n===== �л� ��ü ���� ��� =====");
        ArrayList<Student> s = sct.selectAll();
        
        if(s.isEmpty())
        {
            System.out.println("��ϵ� �л��� �����ϴ�!");
            return;
        }
        
        System.out.println("�й�\t�̸�\t����\t�ּ�\t����");
        for(Student i : s)
        {
            System.out.println(i.getClassNumber() + "\t" + i.getName() + "\t" + i.getAge() + "\t" + i.getAddress() + "\t" + i.getGrade());
        }
        
    }
    
    public void selectOne()
    {
        System.out.println("\n===== �л� ���� ��ȸ(�й�) =====");

        System.out.print("��ȸ�� �л� ��ȣ �Է� : ");
        int classNumber = sc.nextInt();
        
        Student s = sct.selectOne(classNumber);
        
        if(s == null)
        {
            System.out.println("�������� �ʴ� �л��Դϴ�!");
            return;
        }
        
        System.out.println("�й�\t�̸�\t����\t�ּ�\t����");
        System.out.println(s.getClassNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress() + "\t" + s.getGrade());
    }
    
    public void insertStudent()
    {
        System.out.println("\n===== �л� ���� �Է� =====");

        System.out.print("�л� ��ȣ �Է� : ");
        int classNumber = sc.nextInt();
        System.out.print("�л� �̸� �Է� : ");
        sc.nextLine();
        String name = sc.next();
        System.out.print("�л� ���� �Է� : ");
        int age = sc.nextInt();
        System.out.print("�л� �ּ� �Է� : ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.print("�л� ���� �Է� : ");
        int grade = sc.nextInt();
        
        sct.insertStudent(new Student(classNumber, name, age, address, grade));
        
        
        System.out.println("�л� ���� �Է��� �Ϸ�Ǿ����ϴ�!");
    }
    
    public void updateStudent()
    {
        System.out.println("\n===== �л� ���� ���� =====");
        
        System.out.print("������ �л� ��ȣ �Է� : ");
        int classNumber = sc.nextInt();
        
        Student oldStudent = sct.selectOne(classNumber);
        
        if(oldStudent == null)
        {
            System.out.println("�������� �ʴ� �л��Դϴ�!");
            return;
        }
        
        System.out.print("������ �л� �̸� �Է� : ");
        sc.nextLine();
        String name = sc.next();
        System.out.print("������ �л� ���� �Է� : ");
        int age = sc.nextInt();
        System.out.print("������ �л� �ּ� �Է� : ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.print("������ �л� ���� �Է� : ");
        int grade = sc.nextInt();
        
        sct.updateStudent(oldStudent, new Student(classNumber, name, age, address, grade));
        
        System.out.println("�л� ���� ������ �Ϸ�Ǿ����ϴ�!");
        
    }
    
    public void deleteStudent()
    {
        System.out.println("\n===== �л� ���� ���� =====");
        
        System.out.print("������ �л� ��ȣ �Է� : ");
        int classNumber = sc.nextInt();
        
        sct.deleteStudent(classNumber);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


