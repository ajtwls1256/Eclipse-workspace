package kh.studentMgrPjt;

import java.util.Scanner;

public class StudentMgr
{
    Scanner sc = new Scanner(System.in);
    
    
    // 학생 정보 10명 저장할 배열
    Student [] students = new Student[10];
    // 현재 배열을 어디까지 사용하고있는지 기록하는 변수
    int index = 0;
    
    
    
    //전체메뉴
    public void main()
    {
        while(true)
        {
            System.out.println();
            
            System.out.println("<<<<< 학생 관리 프로그램 >>>>>");
            System.out.println("1. 학생 정보 등록");
            System.out.println("2. 학생 정보 보기<전체>");
            System.out.println("3. 학생 정보 보기<1명>");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 정보 삭제");
            System.out.println("0. 프로그램 종료");
            System.out.print("선택 > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: insertStudent();
                    break;
                case 2: printAll();
                    break;
                case 3: printOne();
                    break;
                case 4: updateStudent();
                    break;
                case 5: deleteStudent();
                    break;
                case 0: System.out.println("시스템을 종료합니다.");
                    return;
                default:System.out.println("잘못입력하셨습니다.");
                    break;
            }
            
            
        }
       
        
    }
    
    public void insertStudent()
    {
        System.out.println();
        
        if(index > 10)
        {
            System.out.println("등록된 학생 수가 너무 많습니다.");
        }
        else
        {
            System.out.println("<<<<< 학생 정보 입력 >>>>>");
            System.out.print("이름 입력 : ");
            String name = sc.next();
            System.out.print("나이 입력 : ");
            int age = sc.nextInt();
            System.out.print("주소 입력 : ");
            sc.nextLine();
            String addr = sc.nextLine();
            
            students[index] = new Student(name, age, addr);
            index++;
            
            System.out.println("정보 등록 완료");
        }
        
    }
    
    public void printAll()
    {
        System.out.println();
        
        System.out.println("<<<<< 전체 학생 정보 >>>>>");
        System.out.println("이름\t나이\t주소");
        
        for(int i =0; i< index; i++)
        {
            System.out.println(students[i].getName() + "\t" + students[i].getAge() + "\t" + students[i].getAddr());
        }

    }
    
    public void printOne()
    {
        System.out.println();
        
        System.out.println("<<<<< 학생 정보 출력 >>>>>");
        System.out.print("조회할 학생 이름을 입력하세요 : ");
        String insert = sc.next();
        
        int sameIndex = search(insert);
        
        if(sameIndex == -1)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            System.out.println(students[sameIndex].getName() + "\t" + students[sameIndex].getAge() + "\t" + students[sameIndex].getAddr());
        }

    }
    
    public void updateStudent()
    {
        System.out.println();
        
        System.out.println("<<<<< 학생 정보 수정 >>>>>");
        System.out.print("수정할 학생 이름을 입력하세요 : ");
        String insert = sc.next();
        
        int sameIndex = search(insert);
        
        if(sameIndex == -1)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            System.out.print("변경 할 이름 입력 : ");
            students[sameIndex].setName(sc.next());
            System.out.print("변경 할 나이 입력 : ");
            students[sameIndex].setAge(sc.nextInt());
            System.out.print("변경 할 주소 입력 : ");
            sc.nextLine();
            students[sameIndex].setAddr(sc.nextLine());
            
            System.out.println("정보 수정 완료");
        }

    }
    
    public void deleteStudent()
    {
        System.out.println();
        
        System.out.println("<<<<< 학생 정보 삭제 >>>>>");
        System.out.print("삭제할 학생 이름을 입력하세요 : ");
        String insert = sc.next();
        
        int sameIndex = search(insert);
        
        if(sameIndex == -1)
        {
            System.out.println("일치하는 회원 정보가 없습니다.");
            return;
        }
        else
        {
            if(sameIndex == 9)
            {
                students[sameIndex] = null;
            }
            else
            {
                for(int i = sameIndex; i < index - 1; i++)
                {
                    students[i] = students[i + 1];
                }
            }
            
            System.out.println("정보 삭제 완료");
            
            index--;
            students[index] = null;
        }
    }
    
    
    // search() -> 매개변수, 리턴타입 지정
    public int search(String insertName)
    {
        int search = -1;
        
        for(int i = 0; i < index; i++)
        {
            if(insertName.equals(students[i].getName()))
            {
                search = i;
                break;
            }
        }
        
        return search;
    }
    
}
