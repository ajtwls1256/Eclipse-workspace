package kh.pointmanager.view;

import java.util.Scanner;

import kh.pointmanager.controller.pointMgr;
import kh.pointmanager.vo.Gold;
import kh.pointmanager.vo.Grade;
import kh.pointmanager.vo.Silver;
import kh.pointmanager.vo.Vip;



public class View
{
    Scanner sc = new Scanner(System.in);
    pointMgr pm = new pointMgr();
    
    
    public void main()
    {
        while(true)
        {
            System.out.println("\n===== ����Ʈ ���� �ý��� =====");
            System.out.println("1. ȸ�� ���");
            System.out.println("2. ȸ�� ��ȸ(��ü)");
            System.out.println("3. ȸ�� ��ȸ(1��)");
            System.out.println("4. ȸ�� ����");
            System.out.println("5. ȸ�� ����");
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
                case 4: update();
                    break;
                case 5: delete();
                    break;
                case 0: System.out.println("���α׷��� �����մϴ�.");
                    return;
                default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
            }
            
        }
        
    }
    
    
    public void insert()
    {
        System.out.println("\n===== ȸ�� ��� =====");
        System.out.print("����Ͻ� ȸ���� ����� �Է��ϼ���(Silver,Gold,Vip) : ");
        String grade = sc.next();
        System.out.print("����Ͻ� ȸ���� �̸��� �Է��ϼ��� : ");
        String name = sc.next();
        System.out.print("����Ͻ� ȸ���� ����Ʈ�� �Է��ϼ��� : ");
        int point = sc.nextInt();
        
        
        switch(grade)
        {
            case "Silver" :
                pm.insert(new Silver(grade, name, point));
                break;
            case "Gold" :
                pm.insert(new Gold(grade, name, point));
                break;
            case "Vip" :
                pm.insert(new Vip(grade, name, point));
                break;
                
            default : System.out.println("����� �߸� �Է��ϼ̽��ϴ�."); return;
        }
        
        System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!");
        
    }
    
    
    public void printAll()
    {
        System.out.println("\n===== ȸ�� ��ȸ(��ü) =====");
        
        
        Grade [] member = pm.getMember();
        int index = pm.getMemberIndex();
        
        
        System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
        for(int i =0; i <index; i++)
        {
            System.out.println(member[i].getGrade() + "\t" + member[i].getName() + "\t" + member[i].getPoint() + "\t" + member[i].getBonus());
        }
        
        
    }
    
    
    public void printOne()
    {
        System.out.println("\n===== ȸ�� ��ȸ(1��) =====");
        
        System.out.print("��ȸ�Ͻ� �л��� �̸��� �Է��ϼ��� : ");
        String name = sc.next();
        
        int result = pm.search(name);
        
        if(result == -1)
        {
            System.out.println("��ġ�ϴ� ȸ���� �����ϴ�.");
            return;
        }
        
        Grade [] member = pm.getMember();
        
        System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
        System.out.println(member[result].getGrade() + "\t" + member[result].getName() + "\t" + member[result].getPoint() + "\t" + member[result].getBonus());
        
    }
    
    public void update()
    {
        System.out.println("\n===== ȸ�� ���� =====");
        
        System.out.print("�����Ͻ� ȸ���� �̸��� �Է��ϼ��� : ");
        String name = sc.next();
        
        int result = pm.search(name);
        
        if(result == -1)
        {
            System.out.println("��ġ�ϴ� ȸ���� �����ϴ�.");
            return;
        }
        
        System.out.print("�����Ͻ� ȸ���� ����� �Է��ϼ���(Silver,Gold,Vip) : ");
        String grade = sc.next();
        System.out.print("�����Ͻ� ȸ���� �̸��� �Է��ϼ��� : ");
        String reName = sc.next();
        System.out.print("�����Ͻ� ȸ���� ����Ʈ�� �Է��ϼ��� : ");
        int point = sc.nextInt();
        
        switch(grade)
        {
            case "Silver" :
                pm.update(new Silver(grade, reName, point), result);
                break;
            case "Gold" :
                pm.update(new Gold(grade, reName, point), result);
                break;
            case "Vip" :
                pm.update(new Vip(grade, reName, point), result);
                break;
                
            default : System.out.println("����� �߸� �Է��ϼ̽��ϴ�."); return;
        }
        
        System.out.println("���� �Ϸ�!");

    }
    
    
    
    
    public void delete()
    {
        System.out.println("\n===== ȸ�� ���� =====");
        
        System.out.print("�����Ͻ� ȸ���� �̸��� �Է��ϼ��� : ");
        String name = sc.next();
        
        int result = pm.search(name);
        
        if(result == -1)
        {
            System.out.println("��ġ�ϴ� ȸ���� �����ϴ�.");
            return;
        }
        
        pm.delete(result);
        
        System.out.println("���� �Ϸ�!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
