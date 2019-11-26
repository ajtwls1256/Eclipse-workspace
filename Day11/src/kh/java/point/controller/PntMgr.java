package kh.java.point.controller;

import java.util.Scanner;

import kh.java.point.model.vo.Gold;
import kh.java.point.model.vo.Grade;
import kh.java.point.model.vo.Silver;
import kh.java.point.model.vo.Vip;
import kh.java.point.model.vo.Vvip;

public class PntMgr implements PntMgrInterface
{
    Scanner sc = new Scanner(System.in);
    
    private Grade [] member = new Grade[30];
    int index = 0;
    
    
    public PntMgr() {}
   
    @Override
    public void start()           //��ü����
    {
        while(true)
        {
            System.out.println();
            
            
            System.out.println("===== ����Ʈ ���� ���α׷�2 =====");
            System.out.println("1. ȸ�� �߰�");
            System.out.println("2. ȸ�� ���� ����<��ü>");
            System.out.println("3. ȸ�� ���� ����<1��>");
            System.out.println("4. ȸ�� ���� ����");
            System.out.println("5. ȸ�� ���� ����");
            System.out.println("0. ���α׷� ����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: insertData();
                    break;
                case 2: printData();
                    break;
                case 3: printDataOne();
                    break;
                case 4: modifyData();
                    break;
                case 5: deleteData();
                    break;
                case 0: System.out.println("�ý����� �����մϴ�.");
                    return;
                default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
                    break;
            }
        }
    }
    
    @Override
    public void insertData()       //ȸ������
    {
        System.out.println();
        
        
        if(index > 30)
        {
            System.out.println("������ ȸ���� �ʹ� �����ϴ�!");
            return;
        }
        
        
        System.out.println("===== ȸ�� ���� =====");
        System.out.print("�����Ͻ� ȸ���� �̸��� �Է��ϼ��� : ");
        String name = sc.next();
        System.out.print("�����Ͻ� ȸ���� ����� �Է��ϼ���(Silver/Gold/Vip/Vvip) : ");
        String grade = sc.next();
        System.out.print("�����Ͻ� ȸ���� ������ �Է��ϼ��� : ");
        int score = sc.nextInt();
        
        switch(grade)
        {
            case "Silver" : member[index] = new Silver(name, grade, score);
                break;
            case "Gold" : member[index] = new Gold(name, grade, score);
                break;
            case "Vip" : member[index] = new Vip(name, grade, score);
                break;
            case "Vvip" : member[index] = new Vvip(name, grade, score);
            break;    
                
            default : System.out.println("����� �߸� �Է��ϼ̽��ϴ�."); 
                return;
        }
        
        index++;
        
        System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!");
        
    }
    
    
    
    
    
    
    
    
    
    @Override
    public void printData()       //��ü���
    {
        System.out.println();
        
        
        System.out.println("===== ȸ�� ��ü ��� =====");
        System.out.println("�̸�\t���\t����\t��������Ʈ\t");
        
        for(int i =0; i<index; i++)
        {
            System.out.println(member[i].getName() + "\t" + member[i].getGrade() + "\t" + member[i].getScore() + "\t" + member[i].getInterest());
        }
        
    }
    
    @Override
    public void printDataOne()    //1�����
    {
        System.out.println();
        
        System.out.println("===== ȸ�� �˻� =====");
        System.out.print("�˻��Ͻ� ȸ���� �̸��� �Է����ּ��� : ");
        
        int search = searchData();
        
        if(search == -1)
        {
            System.out.println("�������� �ʴ� ȸ���Դϴ�.");
            return;
        }
        
        System.out.println("�̸�\t���\t����\t��������Ʈ\t");
        System.out.println(member[search].getName() + "\t" + member[search].getGrade() + "\t" + member[search].getScore() + "\t" + member[search].getInterest());
         
    }
    
    @Override
    public void modifyData()      //����
    {
        System.out.println();
        
        System.out.println("===== ȸ�� ���� ���� =====");
        System.out.print("�����Ͻ� ȸ���� �̸��� �Է����ּ��� : ");
        
        int search = searchData();
        
        if(search == -1)
        {
            System.out.println("�������� �ʴ� ȸ���Դϴ�.");
            return;
        }
        
        System.out.print("�����Ͻ� ȸ���� ����� �Է��ϼ���(Silver/Gold/Vip) : ");
        String grade = sc.next();
        System.out.print("�����Ͻ� ȸ���� ������ �Է��ϼ��� : ");
        int score = sc.nextInt();
        
        
        member[search].setGrade(grade); 
        member[search].setScore(score);
        
        
    }
    
    
    
    @Override
    public void deleteData()      //����
    {
        System.out.println();
        
        System.out.println("===== ȸ�� ���� ���� =====");
        System.out.print("�����Ͻ� ȸ���� �̸��� �Է����ּ��� : ");
        
        int search = searchData();
        
        
        if(search == -1)
        {
            System.out.println("�������� �ʴ� ȸ���Դϴ�.");
            return;
        }
        
        
        
        
        for(int i=search; i<index -1; i++)
        {
            member[i] = member[i + 1];
        }
        
        index--;
        member[index] = null;
        
        
        
        System.out.println("ȸ�� ���� ������ �Ϸ�Ǿ����ϴ�!");

    }
    
    
    @Override
    public int searchData()       //��ȸ  
    {    
        String name = sc.next();
        
        for(int i =0; i< index; i++)
        {
            if(name.equals(member[i].getName()))
                return i;
        }

        return -1;
    }
    
}
