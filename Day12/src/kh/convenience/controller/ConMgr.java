package kh.convenience.controller;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import kh.convenience.model.vo.Cigarette;
import kh.convenience.model.vo.Common;
import kh.convenience.model.vo.Drink;
import kh.convenience.model.vo.Etc;
import kh.convenience.model.vo.InstantFood;
import kh.convenience.model.vo.Medicine;
import kh.convenience.model.vo.Snack;

public class ConMgr
{
    Scanner sc = new Scanner(System.in);
    
    Drink [] d = new Drink[10];
    int dIndex = 0;
    InstantFood [] iFood = new InstantFood[10];
    int iIndex = 0;
    Snack [] s = new Snack[10];
    int sIndex = 0;
    Medicine [] m = new Medicine[10];
    int mIndex = 0;
    Cigarette [] c = new Cigarette[10];
    int cIndex = 0;
    Etc [] e = new Etc[10];
    int eIndex = 0;
    
    
    
    
    public ConMgr()
    {

        d[dIndex++] = new Drink("�ݶ�", 1500, "good", 20, 500, 0, "2019-12-31");
        d[dIndex++] = new Drink("���䷹��", 1300, "good", 30, 550, 100, "2019-12-31");
        d[dIndex++] = new Drink("ī��", 3000, "bad", 20, 350, 140, "2019-12-31");
        
        iFood[iIndex++] = new InstantFood("�Ŷ��", 1000, "normal", 50, 350, "2022-11-13");
        iFood[iIndex++] = new InstantFood("���ڵ��ö�", 3100, "normal", 15, 500, "2019-08-07");
        iFood[iIndex++] = new InstantFood("ġŲ����", 1200, "normal", 6, 420, "2019-08-07");
        
        s[sIndex++] = new Snack("�ſ�����", 1200, "good", 20, 150, "2021-06-25", false);
        s[sIndex++] = new Snack("��īĨ", 1500, "good", 20, 190, "2021-06-25", false);
        s[sIndex++] = new Snack("����", 1000, "good", 20, 150, "2021-06-25", true);
        
        m[mIndex++] = new Medicine("����", 2500, "normal", 15, "2020-03-30");
        m[mIndex++] = new Medicine("�Ľ�", 1800, "normal", 15, "2019-12-24");
        
        c[cIndex++] = new Cigarette("������", 4500, "normal", 50, 20, 30);
        c[cIndex++] = new Cigarette("����", 4500, "normal", 50, 10, 15);
        c[cIndex++] = new Cigarette("����", 4500, "normal", 50, 22, 35);
        
        e[eIndex++] = new Etc("�ζ�", 5000, "normal", 100);
        e[eIndex++] = new Etc("ġ��ĩ��", 2000, "bad", 9);
 
    }
    
    
    public void open()
    {
        while(true)
        {
            System.out.println();
            
            System.out.println("<<<<< GS25 >>>>>");
            System.out.println("1. �˹�");
            System.out.println("2. �մ�");
            System.out.println("0. ���α׷� ����");
            System.out.print("���� > ");
            int sel = sc.nextInt(); 
            
            switch(sel)
            {
                case 1: alba();
                    break;
                case 2: client();
                    break;
                case 0: return;
                    
            }
        }

    }
    
    public void alba()
    {
        while(true)
        {
            
            System.out.println();
            
            System.out.println("<<<<< �˹� �޴� >>>>>");
            System.out.println("1. �� ��ǰ ���");
            System.out.println("2. ��� ��Ȳ ����");
            System.out.println("3. ��� ����");
            System.out.println("4. ��ǰ ����");
            System.out.println("0. ����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: insertProduct();
                    break;
                case 2: showProduct();
                    break;
                case 3: updateProduct();
                    break;
                case 4: deleteProduct();
                    break;
                case 0: return;
            }
        }
    }
    
    
    public void insertProduct()
    {
        System.out.println();
        
        System.out.println("<<<<< �� ��ǰ ��� >>>>>");
        System.out.println("1. ���� ���");
        System.out.println("2. �Ｎ��ǰ ���");
        System.out.println("3. ���� ���");
        System.out.println("4. �Ǿ�ǰ ���");
        System.out.println("5. ��� ���");
        System.out.println("6. ��Ÿ �׸� ���");
        System.out.print("���� > ");
        int sel = sc.nextInt();
        
        System.out.print("��ǰ�� �Է� : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("���� �Է� : ");
        int price = sc.nextInt();
        System.out.print("ǰ�� �Է� : ");
        sc.nextLine();
        String quality = sc.next();
        System.out.print("��� �Է� : ");
        int amount = sc.nextInt();
        
        
        switch(sel)
        {
            case 1: 
                System.out.print("�뷮 �Է�(ml) : ");
                int volume = sc.nextInt();
                System.out.print("Į�θ� �Է�(cal) : ");
                int calorie = sc.nextInt();
                System.out.print("������� �Է�(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate  = sc.next();
                
                d[dIndex++] = new Drink(name, price, quality, amount, volume, calorie, expiredDate);
                break;
            case 2: 
                System.out.print("Į�θ� �Է�(cal) : ");
                int calorie2 = sc.nextInt();
                System.out.print("������� �Է�(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate2  = sc.next();
                
                iFood[iIndex++] = new InstantFood(name, price, quality, amount, calorie2, expiredDate2);
                break;
            case 3: 
                System.out.print("Į�θ� �Է�(cal) : ");
                int calorie3 = sc.nextInt();
                System.out.print("������� �Է�(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate3  = sc.next();
                System.out.print("�ڽ� ���� �Է�(o/x) : ");
                char sel2 = sc.next().charAt(0);
                boolean boxing = false;
                if(sel2 == 'o')
                {
                    boxing = true;
                }
                    
                
                s[sIndex++] = new Snack(name, price, quality, amount, calorie3, expiredDate3, boxing);
                break;
            case 4: 
                System.out.print("������� �Է�(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate4  = sc.next();
                
                m[mIndex++] = new Medicine(name, price, quality, amount, expiredDate4);
                break;
            case 5: 
                System.out.print("Ÿ�� �Է� : ");
                int tar  = sc.nextInt();
                System.out.print("����ƾ �Է� : ");
                int nicotine  = sc.nextInt();
                
                c[cIndex++] = new Cigarette(name, price, quality, amount, tar, nicotine);
                break;
            case 6:
                
                e[eIndex++] = new Etc(name, price, quality, amount);
                break;
        }
        
        System.out.println("�� ��ǰ ����� �Ϸ�Ǿ����ϴ�!");
        
    }
    
    public void showProduct()
    {
        showDrink();
        showInstant();
        showSnack();
        showMedicine();
        showCigarette();
        showEtc();
    }
    
    public void updateProduct() 
    {
        // ������ ����
        // �������(����, �Ｎ��ǰ, ����...) -> ���� ���ý� ���Ḯ��Ʈ ���
        // ���õ� ������ ���� ����
        
        System.out.println();
        
        System.out.println("<<<<< ��� ���� >>>>>");
        System.out.println("1. ���� ����");
        System.out.println("2. �Ｎ��ǰ ����");
        System.out.println("3. ���� ����");
        System.out.println("4. �Ǿ�ǰ ����");
        System.out.println("5. ��� ����");
        System.out.println("6. ��Ÿ �׸� ����");
        System.out.print("���� > ");
        int sel = sc.nextInt();
        int [] result = new int[2];
        
        switch(sel)
        {
            case 1:
                showDrink();

                result = updateSelect();
                
                updateByNum(d,result);
                
                break;
            case 2:
                showInstant();

                result = updateSelect();
                
                updateByNum(iFood,result);
                break;
            case 3:
                showSnack();

                result = updateSelect();
                
                updateByNum(s,result);
                break;
            case 4:
                showMedicine();

                result = updateSelect();
                
                updateByNum(m,result);
                break;
            case 5:
                showCigarette();

                result = updateSelect();
                
                updateByNum(c,result);
                break;
            case 6:
                showEtc();
                
                result = updateSelect();
                
                updateByNum(e,result);
                break;
        }
        
        
        
    }
    
    public void deleteProduct()
    {
        // �������(����, �Ｎ��ǰ, ����...) -> ���� ���ý� ���Ḯ��Ʈ ���
        // ���õȰ� �����ϰ� �迭����
        
        System.out.println();
        
        System.out.println("<<<<< ��ǰ ���� >>>>>");
        System.out.println("1. ���� ����");
        System.out.println("2. �Ｎ��ǰ ����");
        System.out.println("3. ���� ����");
        System.out.println("4. �Ǿ�ǰ ����");
        System.out.println("5. ��� ����");
        System.out.println("6. ��Ÿ �׸� ����");
        System.out.print("���� > ");
        int sel = sc.nextInt();
        int searchIndex = -1;
        String searchName = "";
        
        switch(sel)
        {
            case 1:
                showDrink();
                System.out.print("������ ������� �Է����ּ��� : ");
                searchName = sc.next();
                searchIndex = search(searchName, 1);
                
                if(searchIndex == -1)
                {
                    System.out.println("�������� �ʴ� ��ǰ�� �Դϴ�.");
                    return;
                }
                
                for(int i =searchIndex; i<dIndex-1; i++)
                {
                    d[i] = d[i+1];
                }
                d[--dIndex] = null;
                
                
                break;
            case 2:
                showInstant();
                System.out.print("������ �Ｎ��ǰ�� �Է����ּ��� : ");
                searchName = sc.next();
                searchIndex = search(searchName, 2);
                
                if(searchIndex == -1)
                {
                    System.out.println("�������� �ʴ� ��ǰ�� �Դϴ�.");
                    return;
                }
                
                for(int i =searchIndex; i<iIndex-1; i++)
                {
                    iFood[i] = iFood[i+1];
                }
                iFood[--iIndex] = null;
                break;
            case 3:
                showSnack();
                System.out.print("������ ���ڸ� �Է����ּ��� : ");
                searchName = sc.next();
                searchIndex = search(searchName, 3);
                
                if(searchIndex == -1)
                {
                    System.out.println("�������� �ʴ� ��ǰ�� �Դϴ�.");
                    return;
                }
                
                for(int i =searchIndex; i<sIndex-1; i++)
                {
                    s[i] = s[i+1];
                }
                s[--sIndex] = null;
                break;
            case 4:
                showMedicine();
                System.out.print("������ �Ǿ�ǰ�� �Է����ּ��� : ");
                searchName = sc.next();
                searchIndex = search(searchName, 4);
                
                if(searchIndex == -1)
                {
                    System.out.println("�������� �ʴ� ��ǰ�� �Դϴ�.");
                    return;
                }
                
                for(int i =searchIndex; i<mIndex-1; i++)
                {
                    m[i] = m[i+1];
                }
                m[--mIndex] = null;
                break;
            case 5:
                showCigarette();
                System.out.print("������ ��踦 �Է����ּ��� : ");
                searchName = sc.next();
                searchIndex = search(searchName, 5);
                
                if(searchIndex == -1)
                {
                    System.out.println("�������� �ʴ� ��ǰ�� �Դϴ�.");
                    return;
                }
                
                for(int i =searchIndex; i<cIndex-1; i++)
                {
                    c[i] = c[i+1];
                }
                c[--cIndex] = null;
                break;
            case 6:
                showEtc();
                System.out.print("������ ��Ÿ �׸��� �Է����ּ��� : ");
                searchName = sc.next();
                searchIndex = search(searchName, 6);
                
                if(searchIndex == -1)
                {
                    System.out.println("�������� �ʴ� ��ǰ�� �Դϴ�.");
                    return;
                }
                
                for(int i =searchIndex; i<eIndex-1; i++)
                {
                    e[i] = e[i+1];
                }
                e[--eIndex] = null;
                break;
        }
        
        System.out.println("��ǰ ������ �Ϸ�Ǿ����ϴ�!");
        
    }
    
    public void showDrink()
    {
        System.out.println();
        
        System.out.println("<<<<< ���� >>>>>");
        System.out.println("��ȣ\t��ǰ��\t\t����\tǰ��\t���\t�뷮\tĮ�θ�\t�������");
        
        for(int i =0;i<dIndex; i++)
        {
            System.out.println((i+1) + "\t" + d[i].toString());
        }
    }
    
    public void showInstant()
    {
        System.out.println();
        
        System.out.println("<<<<< �Ｎ��ǰ >>>>>");
        System.out.println("��ȣ\t��ǰ��\t\t����\tǰ��\t���\tĮ�θ�\t�������");
        
        for(int i =0;i<iIndex; i++)
        {
            System.out.println((i+1) + "\t" + iFood[i].toString());
        }
    }
    
    public void showSnack()
    {
        System.out.println();
        
        System.out.println("<<<<< ���� >>>>>");
        System.out.println("��ȣ\t��ǰ��\t\t����\tǰ��\t���\tĮ�θ�\t�������\t�ڽ�");
        
        for(int i =0;i<sIndex; i++)
        {
            System.out.println((i+1) + "\t" + s[i].toString());
        }
    }
    
    public void showMedicine()
    {
        System.out.println();
        
        System.out.println("<<<<< �Ǿ�ǰ >>>>>");
        System.out.println("��ȣ\t��ǰ��\t\t����\tǰ��\t���\t�������");
        
        for(int i =0;i<mIndex; i++)
        {
            System.out.println((i+1) + "\t" + m[i].toString());
        }
    }
    
    public void showCigarette()
    {
        System.out.println();
        
        System.out.println("<<<<< ��� >>>>>");
        System.out.println("��ȣ\t��ǰ��\t\t����\tǰ��\t���\tŸ��\t����ƾ");
        
        for(int i =0;i<cIndex; i++)
        {
            System.out.println((i+1) + "\t" + c[i].toString());
        }
    }
    
    public void showEtc()
    {
        System.out.println();
        
        System.out.println("<<<<< ��Ÿ �׸� >>>>>");
        System.out.println("��ȣ\t��ǰ��\t\t����\tǰ��\t���");
        
        for(int i =0;i<eIndex; i++)
        {
            System.out.println((i+1) + "\t" + e[i].toString());
        }
    }
    
    
    
    public int [] updateSelect()
    {
        int [] result = new int[2];
        
        System.out.print("������ ��ǰ ��ȣ�� �Է����ּ��� : ");
        result[0] = sc.nextInt();
        
        System.out.print("������ ��� �Է����ּ��� : ");
        result[1] = sc.nextInt();
        
        return result;
    }
    
    
    public void updateByNum(Common [] product, int [] result)
    {
       int index = result[0] - 1;
       int amount = result[1];
        
       product[index].setAmount(amount);
       
       System.out.println("��� ������ �Ϸ�Ǿ����ϴ�!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int search(String name, int kinds)
    {
        switch(kinds)
        {
            case 1:
                for(int i =0; i < dIndex; i++)
                {
                    if(name.equals(d[i].getName()))
                    {
                        return i;
                    }
                }
                
                break;
            case 2:
                for(int i =0; i < iIndex; i++)
                {
                    if(name.equals(iFood[i].getName()))
                    {
                        return i;
                    }
                }
                
                break;
            case 3:
                for(int i =0; i < sIndex; i++)
                {
                    if(name.equals(s[i].getName()))
                    {
                        return i;
                    }
                }
                
                break;
            case 4:
                for(int i =0; i < mIndex; i++)
                {
                    if(name.equals(m[i].getName()))
                    {
                        return i;
                    }
                }
                
                break;
            case 5:
                for(int i =0; i < cIndex; i++)
                {
                    if(name.equals(c[i].getName()))
                    {
                        return i;
                    }
                }
                
                break;
            case 6:
                for(int i =0; i < eIndex; i++)
                {
                    if(name.equals(e[i].getName()))
                    {
                        return i;
                    }
                }
                
                break;
        }
        
        return -1;
    }
    
    
    
    
    public void client()
    {
        while(true)
        {
            System.out.println();
            
            System.out.println("<<<<< �� �޴� >>>>>");
            System.out.println("1. �����ϱ�(��ٱ���)");
            System.out.println("2. ���οϷ�");
            System.out.println("0. ����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            
            switch(sel)
            {
                case 1: basketing();
                    break;
                case 2: shopingComplete();
                    break;
                case 0: return;
            }
        }
    }
    
    Common [] cart = new Common[30];
    int cartIndex = 0;
    
    
    public void basketing()
    {
        System.out.println("<<<<< �����ϱ� >>>>>");
        System.out.println("1. ���� ����");
        System.out.println("2. �Ｎ��ǰ ����");
        System.out.println("3. ���� ����");
        System.out.println("4. �Ǿ�ǰ ����");
        System.out.println("5. ��� ����");
        System.out.println("6. ��Ÿ �׸� ����");
        System.out.print("���� > ");
        int sel = sc.nextInt();
        int [] result = new int[2];
        
        switch(sel)
        {
            case 1:
                showDrink();

                result = select();
                
                basketing(d,result);
                
                break;
            case 2:
                showInstant();

                result = select();
                
                basketing(iFood,result);
                break;
            case 3:
                showSnack();

                result = select();
                
                basketing(s,result);
                break;
            case 4:
                showMedicine();

                result = select();
                
                basketing(m,result);
                break;
            case 5:
                showCigarette();

                result = select();
                
                basketing(c,result);
                break;
            case 6:
                showEtc();
                
                result = select();
                
                basketing(e,result);
                break;
        }
    }
    
    int sum = 0;
    
    public void shopingComplete()
    {
        System.out.println();
        
 
        System.out.println("<<<<< ���� ��� >>>>>");
        System.out.println("��ǰ��\t����\t����");
        
        for(int i = 0; i<cartIndex; i++)
        {
            System.out.println(cart[i].getName() + "\t" + cart[i].getPrice() + "\t" + cart[i].getAmount());
        }
        
        System.out.print("�� ���űݾ��� " + sum + "�� �Դϴ�.");
    
        sum = 0;
    }
    
    public int [] select()
    {
        int [] result = new int[2];
        
        System.out.print("������ ��ǰ ��ȣ�� �Է����ּ��� : ");
        result[0] = sc.nextInt();
        
        System.out.print("������ ������ �Է����ּ��� : ");
        result[1] = sc.nextInt();
        
        return result;
    }
    
    public void basketing(Common [] product, int [] result)
    {
       int index = result[0] - 1;
       int amount = result[1];
       
       if(product[index].getAmount() < amount)
       {
           System.out.println("�����Ͻ� �������� ��� �����մϴ�!");
           return;
       }
       
       cart[cartIndex++] = new Common(product[index].getName(), product[index].getPrice(), product[index].getQuality(), amount);
      
       sum += product[index].getPrice() * amount;
       
       product[index].setAmount(product[index].getAmount() - amount);
      
       
       
       System.out.println("���Ű� �Ϸ�Ǿ����ϴ�!");
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
}
