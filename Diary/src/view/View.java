package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControllerDiary;

public class View
{
    
    
    Scanner sc = new Scanner(System.in);
    ControllerDiary cd = new ControllerDiary();
    
    public void main() {
        System.out.println("==== ���̾ ���α׷� ====");
        
        System.out.println("1. ����");
        System.out.println("2. 1�� ����");
        System.out.println("3. ����");
        System.out.println("4. ����");
        System.out.println("5. ��ü ���(����)");
        
        System.out.print("��ȣ ���� > ");

        
        int sel = sc.nextInt();
        
        switch(sel) {
            case 1:
                writeDiary();
                break;
            case 2:
                printOne();
                break;
            case 3:
                updateDiary();
                break;
            case 4:
                deleteDiary();
                break;
            case 5:
                printAll();
                break;  
        }
    }
    
    public writeDiary() {
        System.out.println(" ���̾ ���� ");
        System.out.print("�� �˻�(�� ����) :");
        int month = sc.nextInt();
        System.out.print("�� �˻�(�� ����) :");
        int day = sc.nextInt();
        
    }
    
    
    public void updateDiary() {
        System.out.println(" ���̾ ������Ʈ ");
        System.out.print("�� �Է�(�� ����)");
        int month = sc.nextInt();
        System.out.print("�� �Է�(�� ����)");
        int day = sc.nextInt();
        
        
        cd.updateDiary(month, day);
        
        
    }
    
    public void deleteDiary() {
        System.out.println(" ���̾ ���� ");
        System.out.print("�� �Է�(�� ����)");
        int month = sc.nextInt();
        System.out.print("�� �Է�(�� ����)");
        int date = sc.nextInt();
        ArrayList<String> al = cd.searchDiary(month,date);
        // ���
        System.out.print("���� �� ��ȣ ���� > ");
        
        cd.deleteOne(month, day, sc.nextInt()-1);        
    }
}
