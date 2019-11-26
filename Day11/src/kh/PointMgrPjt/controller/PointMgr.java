package kh.PointMgrPjt.controller;

import java.util.Scanner;

import kh.PointMgrPjt.vo.Gold;
import kh.PointMgrPjt.vo.Grade;
import kh.PointMgrPjt.vo.GradeIndex;
import kh.PointMgrPjt.vo.Silver;
import kh.PointMgrPjt.vo.Vip;
import kh.PointMgrPjt.vo.Vvip;



public class PointMgr
{
    //1. ȸ�� �߰�
    // -> ����� ����� ��޿� �´� ��ü�� ����
    // ��� �Է�(Silver, Gold, Vip) : 
    // ���, �̸�, ����Ʈ �Է¹���
    // ���ʽ��� �ڵ����� �Ʒ��� ���� ����
    // silver = point * 0.02
    // gold = point * 0.03
    // vip = popint * 0.05

    //2. ȸ�� ��ü ���� ���
        // silver -> gold -> vip �迭 ������� ���
    
    //3. ȸ������ ���(1��)
    //4. ����
        // �˻��� ��ü ���� -> ���ο� ��ü �����ؼ� �迭 ����������
    //5. ����
    
    //Ž�� �޼ҵ� -> silver, gold, vip�� �� �˻� �ؾ���.
        
    
    Scanner sc = new Scanner(System.in);
   
    
    Grade [] g = new Grade[20];
    int index = 0;
    
    
    public void main()
    {
        while(true)
        {
            System.out.println();
            
            
            System.out.println("<<<<< ����Ʈ ���� ���α׷� >>>>>");
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
                case 1: insertMember();
                    break;
                case 2: printAll();
                    break;
                case 3: printOne();
                    break;
                case 4: updateMember();
                    break;
                case 5: deleteMember();
                    break;
                case 0: System.out.println("�ý����� �����մϴ�.");
                    return;
                default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
                    break;
            }
            
            
        }
       
        
    }
    
    public void insertMember()
    {
        System.out.println("");
        
        System.out.println("<<<<< ȸ�� �߰� >>>>>");
        
        insert(null);
        
        System.out.println("ȸ�� �߰� �Ϸ�");
        

    }
    
  
    public void printAll()
    {
        System.out.println();
        
        System.out.println("<<<<< ��ü ��� ���� >>>>>");
        System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
        
        for(int i =0; i< index; i++)
        {
            System.out.println(g[i].toString());
        }
  
    }
    
    
    public void printOne()
    {
        System.out.println();
        
        System.out.println("<<<<< ȸ�� ���� ��� >>>>>");
        System.out.print("��ȸ�� ȸ�� �̸��� �Է��ϼ��� : ");
        String insertName = sc.next();
        
        int searchMember = search(insertName);
        
        if(searchMember == -1)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
            return;
        }
        else
        {
            System.out.println(g[searchMember].toString());
        }
        
        
    }
    
    public void updateMember()
    {
        System.out.println();
        
        System.out.println("<<<<< ȸ�� ���� ���� >>>>>");
        System.out.print("������ ȸ�� �̸��� �Է��ϼ��� : ");
        String insert = sc.next();
        
        int searchMember = search(insert);
        
        if(searchMember == -1)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
            return;
        }
        else
        {
            System.out.print("������ ȸ�� ��� �Է�(Silver/Gold/Vip/Vvip) :");
            String grade = sc.next();
            System.out.print("������ ȸ�� ����Ʈ �Է� : ");
            int point = sc.nextInt();
            
            switch(grade)
            {
                case "Silver" :
                    g[searchMember] = new Silver(grade, insert, point);
                    break;
                case "Gold" :
                    g[searchMember] = new Gold(grade, insert, point);
                    break;
                case "Vip" :
                    g[searchMember] = new Vip(grade, insert, point);
                    break;
                case "Vvip" :
                    g[searchMember] = new Vvip(grade, insert, point);
                    break;
            }
            
            
            System.out.println("���� ���� �Ϸ�");
        }
        
    }
    
    public void deleteMember()
    {
        System.out.println();
        
        System.out.println("<<<<< ȸ�� ���� ���� >>>>>");
        System.out.print("������ ȸ�� �̸��� �Է��ϼ��� : ");
        String insertName = sc.next();
        
        int searchMember = search(insertName);
        
        if(searchMember == -1)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
            return;
        }
        else
        {
            delete(searchMember);
            
            System.out.println("���� ���� �Ϸ�");
        }
        
        
    }
    
    
    
    
    
    
    //�Ű����� name == null �̸� ����, �ƴϸ� ����
    public void insert(String name)
    {
        System.out.print("��� �Է� (Silver/Gold/Vip/Vvip) : ");
        String grade = sc.next();

        
        if(name == null)
        {
            System.out.print("�̸� �Է� : ");
            name = sc.next();
        }
        
        System.out.print("����Ʈ �Է� : ");
        int point = sc.nextInt();
        
        
        switch(grade)
        {
            case "Silver" :
                g[index] = new Silver(grade, name ,point);
                index++;
                break;
            case "Gold" :
                g[index] = new Gold(grade, name ,point);
                index++;
                break;
            case "Vip" :
                g[index] = new Vip(grade, name ,point);
                index++;
                break;
            case "Vvip" :
                g[index] = new Vvip(grade, name ,point);
                index++;
                break;
        }
        
    }
    
    
    // ����
    public void delete(int searchMember)
    {
        
        if(searchMember == 9)
        {
            g[searchMember] = null;
            
            index--;
        }
        else
        {
            for(int i = searchMember; i < index - 1; i++)
            {
                g[i] = g[i + 1];
            }
            
            index--;
            g[index] = null;
        }
        
        

    }
    
    
    // Ž��
    public int search(String insertName)
    {

        for(int i = 0; i < index; i++)
        {
            if(insertName.equals(g[i].getName()))
            {
                return i;
            }
        }
  
        return -1;
    }
    
    
}
