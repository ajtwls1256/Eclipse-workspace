package kh.hw;

import java.util.Scanner;


public class MovieTicketMachine
{
    Scanner sc = new Scanner(System.in);
    
    MovieTicket mt = new MovieTicket(); 
    boolean check = false;
    
    public void main() 
    {
        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            
            System.out.println("==== �޴� ���� ====");
            System.out.println("1. ����");
            System.out.println("2. ����Ȯ��");
            System.out.println("3. �������");
            System.out.println("4. ����");
            System.out.println("================");
            System.out.print("�Է� : ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: ticketing();
                    break;
                case 2: checkTicket();
                    break;
                case 3: cancelTicket();
                    break;
                case 4: return;
            }
 
        }
    }
    
    
    public void ticketing()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        while(true)
        {
            
            System.out.println("���Ÿ� �����մϴ�.");
            System.out.println();
            
            System.out.println("===== �� ���� ��ȭ ��� ====");
            System.out.println("���̿�ŷ");
            System.out.println("�˶��");
            System.out.println("������");
            System.out.print("�����Ͻ� ��ȭ ������ �Է����ּ��� : ");
            mt.setMovieName(sc.next());
            
            System.out.println("===== " + mt.getMovieName() + " ���Ű����� ���� ====");
            System.out.println("���");
            System.out.println("�Ǵ��Ա�");
            System.out.println("�Ⱦ�");
            System.out.print(mt.getMovieName() + " �����Ͻ� ������ �Է����ּ��� : ");
            mt.setTheaterName(sc.next());
            
            sc.nextLine();
            
            System.out.println("===== " + mt.getMovieName() + " " + mt.getTheaterName() + "�� ���Ű����� ��ȭ �ð� ====");
            System.out.println("���� 6 : 30");
            System.out.println("���� 7 : 50");
            System.out.println("���� 9 : 15");
            System.out.print(mt.getTheaterName() + "�� �����Ͻ� ��ȭ �ð��� �Է����ּ��� : ");
            mt.setStartTime(sc.nextLine());
            

            System.out.println("===== ���Ű����� �¼� ====");
            System.out.println("A�� 5��");
            System.out.println("D�� 12��");
            System.out.println("F�� 8��");
            System.out.print("�����Ͻ� �¼��� �Է����ּ��� : ");
            mt.setSit(sc.nextLine());

            
            System.out.println("�Է��Ͻ� ������ " + mt.getMovieName() + " " + mt.getTheaterName() + "�� " + mt.getStartTime() + " "
                    + mt.getSit() + "�� �����ʴϱ�?");
            System.out.print("�Է��Ͻ� ������ �´ٸ� 1 / �ٽ� �����Ͻ÷��� 2�� �Է��ϼ��� : ");
            int sel = sc.nextInt();
            
            if(sel == 2)
            {
                continue;
            }
            
            System.out.println("���� �Ϸ�");
            check = true;
            break;
        }
        
        
    }
    
    
    public void checkTicket()
    {
        if(!check)
        {
            System.out.println("�����Ͻ� Ƽ���� �����ϴ�. ���Ÿ� �������ּ���!");
            return;
        }
        
        System.out.println("�����Ͻ� Ƽ���� " + mt.getMovieName() + " " + mt.getTheaterName() + "�� " 
        + mt.getStartTime() + " " + mt.getSit() + "�Դϴ�.");
    }
    
    
    public void cancelTicket()
    {
        if(!check)
        {
            System.out.println("�����Ͻ� Ƽ���� �����ϴ�.");
            return;
        }
        
        System.out.println("�����Ͻ� Ƽ���� " + mt.getMovieName() + " " + mt.getTheaterName() + "�� " 
                + mt.getStartTime() + " " + mt.getSit() + "�Դϴ�.");
        
        System.out.print("���Ÿ� ����Ͻðڽ��ϱ�?(y/n): ");
        char sel = sc.next().charAt(0);
        
        if(sel == 'y')
        {
            mt = new MovieTicket(); 
            check = false;
            System.out.println("���Ű� ��ҵǾ����ϴ�.");
        }
        else
        {
            System.out.println("������Ұ� ��ҵǾ����ϴ�.");
        }
    }
}
