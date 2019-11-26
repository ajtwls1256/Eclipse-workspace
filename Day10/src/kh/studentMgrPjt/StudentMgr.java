package kh.studentMgrPjt;

import java.util.Scanner;

public class StudentMgr
{
    Scanner sc = new Scanner(System.in);
    
    
    // �л� ���� 10�� ������ �迭
    Student [] students = new Student[10];
    // ���� �迭�� ������ ����ϰ��ִ��� ����ϴ� ����
    int index = 0;
    
    
    
    //��ü�޴�
    public void main()
    {
        while(true)
        {
            System.out.println();
            
            System.out.println("<<<<< �л� ���� ���α׷� >>>>>");
            System.out.println("1. �л� ���� ���");
            System.out.println("2. �л� ���� ����<��ü>");
            System.out.println("3. �л� ���� ����<1��>");
            System.out.println("4. �л� ���� ����");
            System.out.println("5. �л� ���� ����");
            System.out.println("0. ���α׷� ����");
            System.out.print("���� > ");
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
                case 0: System.out.println("�ý����� �����մϴ�.");
                    return;
                default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
                    break;
            }
            
            
        }
       
        
    }
    
    public void insertStudent()
    {
        System.out.println();
        
        if(index > 10)
        {
            System.out.println("��ϵ� �л� ���� �ʹ� �����ϴ�.");
        }
        else
        {
            System.out.println("<<<<< �л� ���� �Է� >>>>>");
            System.out.print("�̸� �Է� : ");
            String name = sc.next();
            System.out.print("���� �Է� : ");
            int age = sc.nextInt();
            System.out.print("�ּ� �Է� : ");
            sc.nextLine();
            String addr = sc.nextLine();
            
            students[index] = new Student(name, age, addr);
            index++;
            
            System.out.println("���� ��� �Ϸ�");
        }
        
    }
    
    public void printAll()
    {
        System.out.println();
        
        System.out.println("<<<<< ��ü �л� ���� >>>>>");
        System.out.println("�̸�\t����\t�ּ�");
        
        for(int i =0; i< index; i++)
        {
            System.out.println(students[i].getName() + "\t" + students[i].getAge() + "\t" + students[i].getAddr());
        }

    }
    
    public void printOne()
    {
        System.out.println();
        
        System.out.println("<<<<< �л� ���� ��� >>>>>");
        System.out.print("��ȸ�� �л� �̸��� �Է��ϼ��� : ");
        String insert = sc.next();
        
        int sameIndex = search(insert);
        
        if(sameIndex == -1)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
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
        
        System.out.println("<<<<< �л� ���� ���� >>>>>");
        System.out.print("������ �л� �̸��� �Է��ϼ��� : ");
        String insert = sc.next();
        
        int sameIndex = search(insert);
        
        if(sameIndex == -1)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
            return;
        }
        else
        {
            System.out.print("���� �� �̸� �Է� : ");
            students[sameIndex].setName(sc.next());
            System.out.print("���� �� ���� �Է� : ");
            students[sameIndex].setAge(sc.nextInt());
            System.out.print("���� �� �ּ� �Է� : ");
            sc.nextLine();
            students[sameIndex].setAddr(sc.nextLine());
            
            System.out.println("���� ���� �Ϸ�");
        }

    }
    
    public void deleteStudent()
    {
        System.out.println();
        
        System.out.println("<<<<< �л� ���� ���� >>>>>");
        System.out.print("������ �л� �̸��� �Է��ϼ��� : ");
        String insert = sc.next();
        
        int sameIndex = search(insert);
        
        if(sameIndex == -1)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
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
            
            System.out.println("���� ���� �Ϸ�");
            
            index--;
            students[index] = null;
        }
    }
    
    
    // search() -> �Ű�����, ����Ÿ�� ����
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
