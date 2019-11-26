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
            System.out.println("\n===== 학생 관리 프로그램 =====");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 정보 출력(전체)");
            System.out.println("3. 학생 정보 출력(1명)");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 정보 삭제");
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
    
    
    public void insert()
    {
        System.out.println("\n===== 학생 등록 =====");
        System.out.print("이름 입력 : ");
        String name = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("주소 입력 : ");
        sc.nextLine();
        String addr = sc.nextLine();
        
        Student s = new Student(name, age, addr);
        sm.insert(s);
        
        //sm.insert(name, age, addr);
    
    
        System.out.println("회원 가입 완료!!");
    
    }
    
    
    
    public void printAll()
    {
        System.out.println("\n===== 학생 전체 정보 출력 =====");
        
        Student [] s = sm.printAll();
        
        System.out.println("이름\t나이\t주소");
        for(int i = 0; i<sm.getCount(); i++)
        {
            System.out.println(s[i].getName() + "\t" + s[i].getAge() + "\t" + s[i].getAddr());
        }
        
        
    }
    
    public void printOne()
    {
        System.out.println("\n===== 학생 전체 정보 출력(1명) =====");
        System.out.print("조회할 학생 이름 입력 : ");
        String name = sc.next();
        int result = sm.search(name);
        
        if(result == -1)
        {
            System.out.println("일치하는 학생이 없습니다.");
            return;
        }
        
        Student s = sm.printOne(result);
        
        System.out.println("이름\t나이\t주소");
        System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
        
    }
    
    public void updateStudent()
    {
        System.out.println("\n===== 학생 정보 수정 =====");
        System.out.print("수정할 학생 이름 입력 : ");
        String name = sc.next();
        int result = sm.search(name);
        
        if(result == -1)
        {
            System.out.println("일치하는 학생이 없습니다.");
            return;
        }
        
        System.out.print("수정할 이름 입력 : ");
        String reName = sc.next();
        System.out.print("수정할 학생 나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("수정할 학생 주소 입력 : ");
        sc.nextLine();
        String addr = sc.nextLine();
        
        Student s = new Student(reName, age, addr);
        sm.updateStudent(s, result);
        
        
        System.out.println("정보 수정이 완료되었습니다!");
    }
    
    public void deleteStudent()
    {
        System.out.println("\n===== 학생 정보 삭제 =====");
        System.out.print("삭제할 학생 이름 입력 : ");
        String name = sc.next();
        int result = sm.search(name);
        
        if(result == -1)
        {
            System.out.println("일치하는 학생이 없습니다.");
            return;
        }
        
        sm.deleteStudent(result);
        
        System.out.println("정보 삭제가 완료되었습니다!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
