package kh.run;

import java.util.Scanner;

import PointMgrPjt.controller.PointMgr;
import kh.studentMgrPjt.StudentMgr;
import kh.vo.Student;

public class Run
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        
//        Student s1 = new Student("�̿�ȣ", 20, 10);
//        
//        System.out.print("�̸� �Է� : ");
//        String name = sc.next();
//        System.out.print("���� �Է� : ");
//        int age = sc.nextInt();
//        System.out.print("�й� �Է� : ");
//        int stuNo = sc.nextInt();
//        
//        s1.setName(name);
//        s1.setAge(age);
//        s1.setStuNo(stuNo);
//        
        
        
        /*Student s = new Student();
        
   
        
        s.setName("�̿�ȣ");
        s.setStuNo(10);
        s.setAge(26);
       

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getStuNo());*/
        
        
        
        /*String [] arrString = new String[5];
        arrString[0] = "���η�";
        
        System.out.println(arrString[0]);
        
        Student [] st = new Student[5];
//        st[0].setAge(5);                                // ����
//        System.out.println(st[0].getAge());             // ����
        
        st[0] = new Student();
        st[0].setAge(6);
        System.out.println(st[0].getAge());*/
        
        
        /*StudentMgr sm = new StudentMgr();
        sm.main();*/
        
        PointMgr pm = new PointMgr();
        pm.main();
        
        
    }
    
}
