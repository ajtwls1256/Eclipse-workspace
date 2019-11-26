package PointMgrPjt.controller;

import java.util.Scanner;

import PointMgrPjt.vo.Gold;
import PointMgrPjt.vo.GradeIndex;
import PointMgrPjt.vo.Silver;
import PointMgrPjt.vo.Vip;
import PointMgrPjt.vo.Vvip;

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
    
    // search �� ��ް� �ε����� ����ִ� GradeIndex Ŭ����
    GradeIndex gradeIndex;
    
    
    Silver [] silver = new Silver[10];
    int sIndex = 0;
    Gold [] gold = new Gold[10];
    int gIndex = 0;
    Vip [] vip = new Vip[10];
    int vIndex = 0;
    Vvip [] vvip = new Vvip[10];
    int vvIndex = 0;
    
    
    
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
        
        for(int i =0; i< sIndex; i++)
        {
            System.out.println(silver[i].toString());
        }
        for(int i =0; i< gIndex; i++)
        {
            System.out.println(gold[i].toString());
        }
        for(int i =0; i< vIndex; i++)
        {
            System.out.println(vip[i].toString());
        }
        for(int i =0; i< vvIndex; i++)
        {
            System.out.println(vvip[i].toString());
        }
    }
    
    
    public void printOne()
    {
        System.out.println();
        
        System.out.println("<<<<< ȸ�� ���� ��� >>>>>");
        System.out.print("��ȸ�� ȸ�� �̸��� �Է��ϼ��� : ");
        String insertName = sc.next();
        
        GradeIndex searchMember = search(insertName);
        
        if(searchMember == null)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
            return;
        }
        else
        {
            String searchGrade = searchMember.getGrade();
            int searchIndex = searchMember.getIndex();
            

            if(searchGrade.equals("Silver"))
            {
                System.out.println(silver[searchIndex].toString());
            }
            else if(searchGrade.equals("Gold"))
            {
                System.out.println(gold[searchIndex].toString());
            }
            else if(searchGrade.equals("Vip"))
            {
                System.out.println(vip[searchIndex].toString());
            }
            else if(searchGrade.equals("Vvip"))
            {
                System.out.println(vvip[searchIndex].toString());
            }
        }
        
        
    }
    
    public void updateMember()
    {
        System.out.println();
        
        System.out.println("<<<<< ȸ�� ���� ���� >>>>>");
        System.out.print("������ ȸ�� �̸��� �Է��ϼ��� : ");
        String insert = sc.next();
        
        GradeIndex searchMember = search(insert);
        
        if(searchMember == null)
        {
            System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
            return;
        }
        else
        {
            delete(searchMember);

            insert(insert);
            
            System.out.println("���� ���� �Ϸ�");
        }
        
    }
    
    public void deleteMember()
    {
        System.out.println();
        
        System.out.println("<<<<< ȸ�� ���� ���� >>>>>");
        System.out.print("������ ȸ�� �̸��� �Է��ϼ��� : ");
        String insertName = sc.next();
        
        GradeIndex searchMember = search(insertName);
        
        if(searchMember == null)
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
        switch(grade)
        {
            case "Silver" :
                if(sIndex > 10)
                {
                    System.out.println("Silver����� ȸ���� �ʹ� �����ϴ�.");
                    return;
                }
                break;
            case "Gold" :
                if(gIndex > 10)
                {
                    System.out.println("Gold����� ȸ���� �ʹ� �����ϴ�.");
                    return;
                }
                break;
            case "Vip" :
                if(vIndex > 10)
                {
                    System.out.println("Vip����� ȸ���� �ʹ� �����ϴ�.");
                    return;
                }
                break;
            case "Vvip" :
                if(vvIndex > 10)
                {
                    System.out.println("Vvip����� ȸ���� �ʹ� �����ϴ�.");
                    return;
                }
                break;
        }
 
        
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
                silver[sIndex] = new Silver(grade, name ,point);
                sIndex++;
                break;
            case "Gold" :
                gold[gIndex] = new Gold(grade, name ,point);
                gIndex++;
                break;
            case "Vip" :
                vip[vIndex] = new Vip(grade, name ,point);
                vIndex++;
                break;
            case "Vvip" :
                vvip[vvIndex] = new Vvip(grade, name ,point);
                vvIndex++;
                break;
        }
        
    }
    
    
    // ����
    public void delete(GradeIndex searchMember)
    {
        
        String searchGrade = searchMember.getGrade();
        int searchIndex = searchMember.getIndex();
        
        
        if(searchGrade.equals("Silver"))
        {
            
            if(searchIndex == 9)
            {
                silver[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < sIndex - 1; i++)
                {
                    silver[i] = silver[i + 1];
                }
            }

            
            sIndex--;
            silver[sIndex] = null;
            
        }
        else if(searchGrade.equals("Gold"))
        {
            
            if(searchIndex == 9)
            {
                gold[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < gIndex - 1; i++)
                {
                    gold[i] = gold[i + 1];
                }
            }

            
            gIndex--;
            gold[gIndex] = null;
            
        }
        else if(searchGrade.equals("Vip"))
        {

            if(searchIndex == 9)
            {
                vip[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < vIndex - 1; i++)
                {
                    vip[i] = vip[i + 1];
                }
            }

            
            vIndex--;
            vip[vIndex] = null;
        }   
        else if(searchGrade.equals("Vvip"))
        {

            if(searchIndex == 9)
            {
                vvip[searchIndex] = null;
            }
            else
            {
                for(int i = searchIndex; i < vvIndex - 1; i++)
                {
                    vvip[i] = vvip[i + 1];
                }
            }

            
            vvIndex--;
            vvip[vvIndex] = null;
        }
        
    }
    
    
    // Ž��
    public GradeIndex search(String insertName)
    {
        gradeIndex = null;
        
        for(int i = 0; i < sIndex; i++)
        {
            if(insertName.equals(silver[i].getName()))
            {
                gradeIndex = new GradeIndex("Silver", i);
                return gradeIndex;
            }
        }
        
        for(int i = 0; i < gIndex; i++)
        {
            if(insertName.equals(gold[i].getName()))
            {
                gradeIndex = new GradeIndex("Gold", i);
                return gradeIndex;
            }
        }
        
        for(int i = 0; i < vIndex; i++)
        {
            if(insertName.equals(vip[i].getName()))
            {
                gradeIndex = new GradeIndex("Vip", i);
                return gradeIndex;
            }
        }
        
        for(int i = 0; i < vvIndex; i++)
        {
            if(insertName.equals(vvip[i].getName()))
            {
                gradeIndex = new GradeIndex("Vvip", i);
                return gradeIndex;
            }
        }
        
        
        return gradeIndex;
    }
    
    
}
