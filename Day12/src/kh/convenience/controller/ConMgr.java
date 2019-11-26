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

        d[dIndex++] = new Drink("콜라", 1500, "good", 20, 500, 0, "2019-12-31");
        d[dIndex++] = new Drink("게토레이", 1300, "good", 30, 550, 100, "2019-12-31");
        d[dIndex++] = new Drink("카스", 3000, "bad", 20, 350, 140, "2019-12-31");
        
        iFood[iIndex++] = new InstantFood("신라면", 1000, "normal", 50, 350, "2022-11-13");
        iFood[iIndex++] = new InstantFood("혜자도시락", 3100, "normal", 15, 500, "2019-08-07");
        iFood[iIndex++] = new InstantFood("치킨버거", 1200, "normal", 6, 420, "2019-08-07");
        
        s[sIndex++] = new Snack("매운새우깡", 1200, "good", 20, 150, "2021-06-25", false);
        s[sIndex++] = new Snack("포카칩", 1500, "good", 20, 190, "2021-06-25", false);
        s[sIndex++] = new Snack("고래밥", 1000, "good", 20, 150, "2021-06-25", true);
        
        m[mIndex++] = new Medicine("펜잘", 2500, "normal", 15, "2020-03-30");
        m[mIndex++] = new Medicine("파스", 1800, "normal", 15, "2019-12-24");
        
        c[cIndex++] = new Cigarette("말보루", 4500, "normal", 50, 20, 30);
        c[cIndex++] = new Cigarette("에쎄", 4500, "normal", 50, 10, 15);
        c[cIndex++] = new Cigarette("레종", 4500, "normal", 50, 22, 35);
        
        e[eIndex++] = new Etc("로또", 5000, "normal", 100);
        e[eIndex++] = new Etc("치약칫솔", 2000, "bad", 9);
 
    }
    
    
    public void open()
    {
        while(true)
        {
            System.out.println();
            
            System.out.println("<<<<< GS25 >>>>>");
            System.out.println("1. 알바");
            System.out.println("2. 손님");
            System.out.println("0. 프로그램 종료");
            System.out.print("선택 > ");
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
            
            System.out.println("<<<<< 알바 메뉴 >>>>>");
            System.out.println("1. 새 제품 등록");
            System.out.println("2. 재고 현황 보기");
            System.out.println("3. 재고 변경");
            System.out.println("4. 제품 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
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
        
        System.out.println("<<<<< 새 제품 등록 >>>>>");
        System.out.println("1. 음료 등록");
        System.out.println("2. 즉석식품 등록");
        System.out.println("3. 과자 등록");
        System.out.println("4. 의약품 등록");
        System.out.println("5. 담배 등록");
        System.out.println("6. 기타 항목 등록");
        System.out.print("선택 > ");
        int sel = sc.nextInt();
        
        System.out.print("제품명 입력 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("가격 입력 : ");
        int price = sc.nextInt();
        System.out.print("품질 입력 : ");
        sc.nextLine();
        String quality = sc.next();
        System.out.print("재고 입력 : ");
        int amount = sc.nextInt();
        
        
        switch(sel)
        {
            case 1: 
                System.out.print("용량 입력(ml) : ");
                int volume = sc.nextInt();
                System.out.print("칼로리 입력(cal) : ");
                int calorie = sc.nextInt();
                System.out.print("유통기한 입력(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate  = sc.next();
                
                d[dIndex++] = new Drink(name, price, quality, amount, volume, calorie, expiredDate);
                break;
            case 2: 
                System.out.print("칼로리 입력(cal) : ");
                int calorie2 = sc.nextInt();
                System.out.print("유통기한 입력(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate2  = sc.next();
                
                iFood[iIndex++] = new InstantFood(name, price, quality, amount, calorie2, expiredDate2);
                break;
            case 3: 
                System.out.print("칼로리 입력(cal) : ");
                int calorie3 = sc.nextInt();
                System.out.print("유통기한 입력(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate3  = sc.next();
                System.out.print("박싱 여부 입력(o/x) : ");
                char sel2 = sc.next().charAt(0);
                boolean boxing = false;
                if(sel2 == 'o')
                {
                    boxing = true;
                }
                    
                
                s[sIndex++] = new Snack(name, price, quality, amount, calorie3, expiredDate3, boxing);
                break;
            case 4: 
                System.out.print("유통기한 입력(yyyy-mm-dd) : ");
                sc.nextLine();
                String expiredDate4  = sc.next();
                
                m[mIndex++] = new Medicine(name, price, quality, amount, expiredDate4);
                break;
            case 5: 
                System.out.print("타르 입력 : ");
                int tar  = sc.nextInt();
                System.out.print("니코틴 입력 : ");
                int nicotine  = sc.nextInt();
                
                c[cIndex++] = new Cigarette(name, price, quality, amount, tar, nicotine);
                break;
            case 6:
                
                e[eIndex++] = new Etc(name, price, quality, amount);
                break;
        }
        
        System.out.println("새 제품 등록이 완료되었습니다!");
        
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
        // 수량만 변경
        // 종류출력(음료, 즉석식품, 과자...) -> 음료 선택시 음료리스트 출력
        // 선택된 음료의 수량 변경
        
        System.out.println();
        
        System.out.println("<<<<< 재고 변경 >>>>>");
        System.out.println("1. 음료 변경");
        System.out.println("2. 즉석식품 변경");
        System.out.println("3. 과자 변경");
        System.out.println("4. 의약품 변경");
        System.out.println("5. 담배 변경");
        System.out.println("6. 기타 항목 변경");
        System.out.print("선택 > ");
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
        // 종류출력(음료, 즉석식품, 과자...) -> 음료 선택시 음료리스트 출력
        // 선택된거 삭제하고 배열댕기기
        
        System.out.println();
        
        System.out.println("<<<<< 제품 삭제 >>>>>");
        System.out.println("1. 음료 삭제");
        System.out.println("2. 즉석식품 삭제");
        System.out.println("3. 과자 삭제");
        System.out.println("4. 의약품 삭제");
        System.out.println("5. 담배 삭제");
        System.out.println("6. 기타 항목 삭제");
        System.out.print("선택 > ");
        int sel = sc.nextInt();
        int searchIndex = -1;
        String searchName = "";
        
        switch(sel)
        {
            case 1:
                showDrink();
                System.out.print("삭제할 음료수를 입력해주세요 : ");
                searchName = sc.next();
                searchIndex = search(searchName, 1);
                
                if(searchIndex == -1)
                {
                    System.out.println("존재하지 않는 제품명 입니다.");
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
                System.out.print("삭제할 즉석식품을 입력해주세요 : ");
                searchName = sc.next();
                searchIndex = search(searchName, 2);
                
                if(searchIndex == -1)
                {
                    System.out.println("존재하지 않는 제품명 입니다.");
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
                System.out.print("삭제할 과자를 입력해주세요 : ");
                searchName = sc.next();
                searchIndex = search(searchName, 3);
                
                if(searchIndex == -1)
                {
                    System.out.println("존재하지 않는 제품명 입니다.");
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
                System.out.print("삭제할 의약품을 입력해주세요 : ");
                searchName = sc.next();
                searchIndex = search(searchName, 4);
                
                if(searchIndex == -1)
                {
                    System.out.println("존재하지 않는 제품명 입니다.");
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
                System.out.print("삭제할 담배를 입력해주세요 : ");
                searchName = sc.next();
                searchIndex = search(searchName, 5);
                
                if(searchIndex == -1)
                {
                    System.out.println("존재하지 않는 제품명 입니다.");
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
                System.out.print("삭제할 기타 항목을 입력해주세요 : ");
                searchName = sc.next();
                searchIndex = search(searchName, 6);
                
                if(searchIndex == -1)
                {
                    System.out.println("존재하지 않는 제품명 입니다.");
                    return;
                }
                
                for(int i =searchIndex; i<eIndex-1; i++)
                {
                    e[i] = e[i+1];
                }
                e[--eIndex] = null;
                break;
        }
        
        System.out.println("제품 삭제가 완료되었습니다!");
        
    }
    
    public void showDrink()
    {
        System.out.println();
        
        System.out.println("<<<<< 음료 >>>>>");
        System.out.println("번호\t제품명\t\t가격\t품질\t재고\t용량\t칼로리\t유통기한");
        
        for(int i =0;i<dIndex; i++)
        {
            System.out.println((i+1) + "\t" + d[i].toString());
        }
    }
    
    public void showInstant()
    {
        System.out.println();
        
        System.out.println("<<<<< 즉석식품 >>>>>");
        System.out.println("번호\t제품명\t\t가격\t품질\t재고\t칼로리\t유통기한");
        
        for(int i =0;i<iIndex; i++)
        {
            System.out.println((i+1) + "\t" + iFood[i].toString());
        }
    }
    
    public void showSnack()
    {
        System.out.println();
        
        System.out.println("<<<<< 과자 >>>>>");
        System.out.println("번호\t제품명\t\t가격\t품질\t재고\t칼로리\t유통기한\t박싱");
        
        for(int i =0;i<sIndex; i++)
        {
            System.out.println((i+1) + "\t" + s[i].toString());
        }
    }
    
    public void showMedicine()
    {
        System.out.println();
        
        System.out.println("<<<<< 의약품 >>>>>");
        System.out.println("번호\t제품명\t\t가격\t품질\t재고\t유통기한");
        
        for(int i =0;i<mIndex; i++)
        {
            System.out.println((i+1) + "\t" + m[i].toString());
        }
    }
    
    public void showCigarette()
    {
        System.out.println();
        
        System.out.println("<<<<< 담배 >>>>>");
        System.out.println("번호\t제품명\t\t가격\t품질\t재고\t타르\t니코틴");
        
        for(int i =0;i<cIndex; i++)
        {
            System.out.println((i+1) + "\t" + c[i].toString());
        }
    }
    
    public void showEtc()
    {
        System.out.println();
        
        System.out.println("<<<<< 기타 항목 >>>>>");
        System.out.println("번호\t제품명\t\t가격\t품질\t재고");
        
        for(int i =0;i<eIndex; i++)
        {
            System.out.println((i+1) + "\t" + e[i].toString());
        }
    }
    
    
    
    public int [] updateSelect()
    {
        int [] result = new int[2];
        
        System.out.print("변경할 제품 번호를 입력해주세요 : ");
        result[0] = sc.nextInt();
        
        System.out.print("변경할 재고를 입력해주세요 : ");
        result[1] = sc.nextInt();
        
        return result;
    }
    
    
    public void updateByNum(Common [] product, int [] result)
    {
       int index = result[0] - 1;
       int amount = result[1];
        
       product[index].setAmount(amount);
       
       System.out.println("재고 변경이 완료되었습니다!");
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
            
            System.out.println("<<<<< 고객 메뉴 >>>>>");
            System.out.println("1. 쇼핑하기(장바구니)");
            System.out.println("2. 쇼핑완료");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
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
        System.out.println("<<<<< 쇼핑하기 >>>>>");
        System.out.println("1. 음료 구매");
        System.out.println("2. 즉석식품 구매");
        System.out.println("3. 과자 구매");
        System.out.println("4. 의약품 구매");
        System.out.println("5. 담배 구매");
        System.out.println("6. 기타 항목 구매");
        System.out.print("선택 > ");
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
        
 
        System.out.println("<<<<< 구매 목록 >>>>>");
        System.out.println("상품명\t가격\t수량");
        
        for(int i = 0; i<cartIndex; i++)
        {
            System.out.println(cart[i].getName() + "\t" + cart[i].getPrice() + "\t" + cart[i].getAmount());
        }
        
        System.out.print("총 구매금액은 " + sum + "원 입니다.");
    
        sum = 0;
    }
    
    public int [] select()
    {
        int [] result = new int[2];
        
        System.out.print("구매할 제품 번호를 입력해주세요 : ");
        result[0] = sc.nextInt();
        
        System.out.print("구매할 수량을 입력해주세요 : ");
        result[1] = sc.nextInt();
        
        return result;
    }
    
    public void basketing(Common [] product, int [] result)
    {
       int index = result[0] - 1;
       int amount = result[1];
       
       if(product[index].getAmount() < amount)
       {
           System.out.println("구매하실 수량보다 재고가 부족합니다!");
           return;
       }
       
       cart[cartIndex++] = new Common(product[index].getName(), product[index].getPrice(), product[index].getQuality(), amount);
      
       sum += product[index].getPrice() * amount;
       
       product[index].setAmount(product[index].getAmount() - amount);
      
       
       
       System.out.println("구매가 완료되었습니다!");
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
}
