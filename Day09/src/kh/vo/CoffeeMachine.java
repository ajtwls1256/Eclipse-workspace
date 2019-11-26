package kh.vo;

import java.util.Scanner;

public class CoffeeMachine
{
    Scanner sc = new Scanner(System.in);
    
    private boolean power = false;
    
    
    public void main() throws InterruptedException
    {
        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            
            System.out.println("==== �޴� ���� ====");
            System.out.println("1. �޴���");
            System.out.println("2. �ֹ��ϱ�");
            System.out.println("3. ����");
            System.out.println("4. ����");
            System.out.println("================");
            System.out.print("�Է� : ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: menu();
                    break;
                case 2: order();
                    break;
                case 3: power();
                    break;
                case 4: return;
                
                default : 
            }
            
            
            
            
          
            
        }
    }
    
    



    
    
    
    private void menu()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("==== ���� ��� ====");
        System.out.println("��Ƽ���Ǿ�");
        System.out.println("�ɳ�");
        System.out.println("�ݷҺ��");
        System.out.println("���׸���");
        System.out.println("==== Ŀ�� ���� ====");
        System.out.println("����������");
        System.out.println("�Ƹ޸�ī��");
        System.out.println("ī���");
        System.out.println("ī���ī");
        System.out.println("==== ���� ũ�� ====");
        System.out.println("Tall: 12 / Grande: 17");
        
        
    }
    
    
    private void order() throws InterruptedException
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        if(!power)
        {
            System.out.println("������ �����ֽ��ϴ�.");
            System.out.println("������ ���� ���ּ���");
            return;
        }
        
        while(true)
        {

            Coffee coffee = new Coffee();
            
            System.out.println("==== Ŀ�� �ֹ� ====");
            System.out.print("�� Ŀ�� �µ� ���� <1.ice /2.Hot> : ");
            String degree = "";
            if(sc.nextInt() == 1)
            {
                degree = "Ice";
            }
            else
            {
                degree = "Hot";
            }
            coffee.setDegree(degree);
            
            System.out.println("�� ���μ���");
            System.out.println(" �� ��Ƽ���Ǿ�");
            System.out.println(" �� �ɳ�");
            System.out.println(" �� �ݷҺ��");
            System.out.println(" �� ���׸���");
            System.out.print("���� : ");
            coffee.setBean(sc.next());
            System.out.println(coffee.getBean() + " ���θ� �����ϼ̽��ϴ�.");
            
            System.out.println("�� Ŀ�Ǽ���");
            System.out.println(" �� ����������");
            System.out.println(" �� �Ƹ޸�ī��");
            System.out.println(" �� ī���");
            System.out.println(" �� ī���ī");
            System.out.print("�Է� : ");
            coffee.setCoffee(sc.next());
            System.out.println(coffee.getCoffee() + "�� �����ϼ̽��ϴ�.");
            
            System.out.println("�� ������ ����");
            System.out.println(" �� 12oz or Tall");
            System.out.println(" �� 17oz or Grande");
            System.out.print("�Է� : ");
            coffee.setSize(sc.next());
            System.out.println(coffee.getSize() + "�� �����ϼ̽��ϴ�.");
            
            System.out.print("�� ���� �Է� : ");
            coffee.setQuantity(sc.nextInt());
            
            System.out.println("�� �ֹ� Ȯ��");

            System.out.println("�Է��Ͻ� ������ " + coffee.getDegree() + " " + coffee.getBean() + " " + coffee.getCoffee() + " "
                               + coffee.getSize() + " " + coffee.getQuantity() + "���� �����ʴϱ�?");
            System.out.print("�Է��Ͻ� ������ �´ٸ� 1 / �ٽ� �ֹ� 2 : ");
            int sel = sc.nextInt();
            
            if(sel == 2)
            {
                continue;
            }
            
            System.out.println("�ֹ� �Ϸ�");
            System.out.println("========================");
            Thread.sleep(1000);
            System.out.println("    ������     ");
            Thread.sleep(1000);     
            System.out.println("    �� ��     ");
            Thread.sleep(1000);     
            System.out.println("    �� ��     ");
            Thread.sleep(1000);     
            System.out.println("    �� ��     ");
            Thread.sleep(1000);     
 
            
            System.out.println("����������������������");
            System.out.println("��         ��");
            System.out.println("���������������������� ");
            System.out.println("��         �� ");
            System.out.println("���������������������� ");
            System.out.println("��         ��");
            System.out.println("����������������������");
            System.out.println("���� �ϼ�");
            
            break;
        }
        

    }
    
    
    private void power()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        
        if(power == false)
        {
            System.out.println("������ �������ϴ�.");
        }
        else
        {
            System.out.println("������ �������ϴ�.");
        }
        
        power = !power;
    }
}
