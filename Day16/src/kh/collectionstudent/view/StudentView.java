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
            System.out.println("\n===== 학생 관리 프로그램 =====");
            System.out.println("1. 학생 전체 정보 출력");
            System.out.println("2. 학생 정보 조회(학번)");
            System.out.println("3. 학생 정보 입력");
            System.out.println("4. 학생 정보 변경");
            System.out.println("5. 학생 정보 삭제");
            System.out.println("0. 프로그램 종료");
            System.out.print("선택 > ");
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
                case 0: System.out.println("프로그램을 종료합니다.");
                    return;
                default : System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
        
    }
    
    public void selectAll()
    {
        System.out.println("\n===== 학생 전체 정보 출력 =====");
        ArrayList<Student> s = sct.selectAll();
        
        if(s.isEmpty())
        {
            System.out.println("등록된 학생이 없습니다!");
            return;
        }
        
        System.out.println("학번\t이름\t나이\t주소\t학점");
        for(Student i : s)
        {
            System.out.println(i.getClassNumber() + "\t" + i.getName() + "\t" + i.getAge() + "\t" + i.getAddress() + "\t" + i.getGrade());
        }
        
    }
    
    public void selectOne()
    {
        System.out.println("\n===== 학생 정보 조회(학번) =====");

        System.out.print("조회할 학생 번호 입력 : ");
        int classNumber = sc.nextInt();
        
        Student s = sct.selectOne(classNumber);
        
        if(s == null)
        {
            System.out.println("존재하지 않는 학생입니다!");
            return;
        }
        
        System.out.println("학번\t이름\t나이\t주소\t학점");
        System.out.println(s.getClassNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress() + "\t" + s.getGrade());
    }
    
    public void insertStudent()
    {
        System.out.println("\n===== 학생 정보 입력 =====");

        System.out.print("학생 번호 입력 : ");
        int classNumber = sc.nextInt();
        System.out.print("학생 이름 입력 : ");
        sc.nextLine();
        String name = sc.next();
        System.out.print("학생 나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("학생 주소 입력 : ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.print("학생 학점 입력 : ");
        int grade = sc.nextInt();
        
        sct.insertStudent(new Student(classNumber, name, age, address, grade));
        
        
        System.out.println("학생 정보 입력이 완료되었습니다!");
    }
    
    public void updateStudent()
    {
        System.out.println("\n===== 학생 정보 변경 =====");
        
        System.out.print("변경할 학생 번호 입력 : ");
        int classNumber = sc.nextInt();
        
        Student oldStudent = sct.selectOne(classNumber);
        
        if(oldStudent == null)
        {
            System.out.println("존재하지 않는 학생입니다!");
            return;
        }
        
        System.out.print("변경할 학생 이름 입력 : ");
        sc.nextLine();
        String name = sc.next();
        System.out.print("변경할 학생 나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("변경할 학생 주소 입력 : ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.print("변경할 학생 학점 입력 : ");
        int grade = sc.nextInt();
        
        sct.updateStudent(oldStudent, new Student(classNumber, name, age, address, grade));
        
        System.out.println("학생 정보 수정이 완료되었습니다!");
        
    }
    
    public void deleteStudent()
    {
        System.out.println("\n===== 학생 정보 삭제 =====");
        
        System.out.print("삭제할 학생 번호 입력 : ");
        int classNumber = sc.nextInt();
        
        sct.deleteStudent(classNumber);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


