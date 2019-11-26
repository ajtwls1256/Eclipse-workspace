package kh.bookmanager.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import kh.bookmanager.controller.BookManager_A;
import kh.bookmanager.controller.BookManager_M;
import kh.bookmanager.controller.BookManager_MA;
import kh.bookmanager.vo.Book;

public class BookManagerView
{
   Scanner sc = new Scanner(System.in);
   
   BookManager_A bm_A = new BookManager_A();
   BookManager_M bm_M = new BookManager_M();
   BookManager_MA bm_MA = new BookManager_MA();
   
   public void main()
   {
       System.out.print("1. ArrayList / 2.HashMap / 3. HashMap<ArrayList> : ");
       int select = sc.nextInt();
       
        while (true)
        {
            System.out.println("\n******* ���� ���� ���α׷� *******\n");
            System.out.println("1. �� ���� �߰�");
            System.out.println("2. ī�װ� �� ���� ���� ���");
            System.out.println("3. ���� ���� ����");
            System.out.println("4. ���� ���� �˻�");
            System.out.println("5. ��ü ���� ���� ���");
            System.out.println("0. ���α׷� ����");
            System.out.print("���� > ");
            int sel = sc.nextInt();
            
            if(select == 1)
            {
                switch (sel)
                {
                    case 1: addBook();
                    break;
                    case 2: printCategory();
                    break;
                    case 3: deleteBook();
                    break;
                    case 4: searchBook();
                    break;
                    case 5: printAllBook();
                    break;
                    case 0: System.out.println("���α׷��� �����մϴ�.");
                    return;
                    default: System.out.println("�߸� �Է��ϼ̽��ϴ� !");
                    break;
                }
                
            }
            else if(select == 2)
            {
                switch (sel)
                {
                    case 1: addBook_M();
                    break;
                    case 2: printCategory_M();
                    break;
                    case 3: deleteBook_M();
                    break;
                    case 4: searchBook_M();
                    break;
                    case 5: printAllBook_M();
                    break;
                    case 0: System.out.println("���α׷��� �����մϴ�.");
                    return;
                    default: System.out.println("�߸� �Է��ϼ̽��ϴ� !");
                    break;
                }
            }
            else
            {
                switch (sel)
                {
                    case 1: addBook_MA();
                    break;
                    case 2: printCategory_MA();
                    break;
                    case 3: deleteBook_MA();
                    break;
                    case 4: searchBook_MA();
                    break;
                    case 5: printAllBook_MA();
                    break;
                    case 0: System.out.println("���α׷��� �����մϴ�.");
                    return;
                    default: System.out.println("�߸� �Է��ϼ̽��ϴ� !");
                    break;
                }
            }
            
            
            
        }
   }
   
/////////////////////////////////////      ArrayList       //////////////////////////////////////////////////////// 
   
   public void addBook()
   {
       System.out.println("\n******* �� ���� �߰� *******\n");
       
       String number;
       while(true)
       {
           System.out.print("���� ��ȣ �Է� : ");
           number = sc.next();
           if(bm_A.checkOverlap(number))
           {
               System.out.println("������ȣ�� �ߺ��˴ϴ�.");
               continue;
           }
           
           break;    
       }
       System.out.print("���� �з� �ڵ� ���� [1.�Ҽ� / 2.��ȭ / 3.���� / 4.��Ÿ] : ");
       int category = sc.nextInt();
       System.out.print("���� ���� �Է� : ");
       sc.nextLine();
       String name = sc.next();
       System.out.print("���� �Է� : ");
       String writer = sc.next();
       
       bm_A.addBook(new Book(number, category, name, writer));
       
       System.out.println("���� �߰��� �Ϸ� �Ǿ����ϴ�.");
   }
   
   
   
   public void printCategory()
   {
       System.out.println("\n******* ī�װ��� ���� ���� ��� *******\n");
       
       while(true) 
       {
           System.out.print("ī�װ� ���� [1.�Ҽ� / 2.��ȭ / 3.���� / 4.��Ÿ / 0.���� ] : ");
           int category = sc.nextInt();
           
           if(category == 0)
           {
               return;
           }
           
           ArrayList<Book> b = bm_A.printCategory(category);
           
           
           if(b.isEmpty())
           {
               System.out.println("���� ������ �����ϴ�.");
               continue;
           }
           
           System.out.println("\n--------------------------------");
           System.out.println("��ȣ\t�з�\tå����\t����");
           
           for(Book book : b) 
           {
               System.out.println("--------------------------------");
               System.out.println(book.toString());
           }
           
           System.out.println("--------------------------------\n");
       }
   }
   
   
   
   public void deleteBook()
   {
       System.out.println("\n******* ���� ���� ���� *******\n");
       
       System.out.print("���� ��ȣ �Է� : ");
       String number = sc.next();
       
       if(bm_A.deleteBook(number))
       {
           System.out.println("������ �Ϸ�Ǿ����ϴ�.");
           return;
       }
       
       System.out.println("���� ������ �����ϴ�.");
       
   }
   
   public void searchBook()
   {
       System.out.println("\n******* ���� ���� �˻� *******\n");
       
       System.out.println("1. �������� �˻� / 2. ������ȣ�� �˻�");
       System.out.print("���� > ");
       int sel = sc.nextInt();
       
       ArrayList<Book> book = new ArrayList<>();
       
       if(sel == 1)
       {
           System.out.print("�˻��� å�� ������ �Է��ϼ��� : ");
           String name = sc.next();
           
           book = bm_A.searchByName(name);
       }
       else if(sel == 2)
       {
           System.out.print("�˻��� å�� ���� ��ȣ�� �Է��ϼ��� : ");
           String number = sc.next();
           
           book.add(bm_A.searchByNum(number));
       }
       else
       {
           System.out.println("�߸� �Է��ϼ̽��ϴ�.");
           return;
       }
  
       if(book.isEmpty())
       {
           System.out.println("���� ������ �����ϴ�.");
           return;
       }
       
       System.out.println("\n--------------------------------");
       System.out.println("��ȣ\t�з�\tå����\t����");
       for(Book b : book) 
       {
           System.out.println("--------------------------------");
           System.out.println(b.toString());
       }
       
       System.out.println("--------------------------------\n");
       
   }
   
   public void printAllBook()
   {
       System.out.println("\n******* ��ü ���� ���� ��� *******\n");

       ArrayList<Book> b = bm_A.printAllBook();
       
       if(b.isEmpty())
       {
           System.out.println("���� ������ �����ϴ�.");
           return;
       }
       
       
       System.out.println("\n--------------------------------");
       System.out.println("��ȣ\t�з�\tå����\t����");
       
       for(Book book : b) 
       {
           System.out.println("--------------------------------");
           System.out.println(book.toString());
       }
       
       System.out.println("--------------------------------\n");
   }
   
   
   
   
   
   
   ///////////////////////////////////////      HashMap       ////////////////////////////////////////////////////////      
   
   public void addBook_M()
   {
       System.out.println("\n******* �� ���� �߰� *******\n");
       
       String number;
       while(true)
       {
           System.out.print("���� ��ȣ �Է� : ");
           number = sc.next();
           if(bm_M.checkOverlap(number))
           {
               System.out.println("������ȣ�� �ߺ��˴ϴ�.");
               continue;
           }
           
           break;    
       }
       System.out.print("���� �з� �ڵ� ���� [1.�Ҽ� / 2.��ȭ / 3.���� / 4.��Ÿ] : ");
       int category = sc.nextInt();
       System.out.print("���� ���� �Է� : ");
       sc.nextLine();
       String name = sc.next();
       System.out.print("���� �Է� : ");
       String writer = sc.next();
       
       bm_M.addBook(new Book(number, category, name, writer));
       
       System.out.println("���� �߰��� �Ϸ� �Ǿ����ϴ�.");
   }
   
   public void printCategory_M()
   {
       System.out.println("\n******* ī�װ��� ���� ���� ��� *******\n");
       
       while(true) 
       {
           System.out.print("ī�װ� ���� [1.�Ҽ� / 2.��ȭ / 3.���� / 4.��Ÿ / 0.���� ] : ");
           int category = sc.nextInt();
           
           if(category == 0)
           {
               return;
           }
           
           ArrayList<Book> b = bm_M.printCategory(category);
           
           
           if(b.isEmpty())
           {
               System.out.println("���� ������ �����ϴ�.");
               continue;
           }
           
           System.out.println("\n--------------------------------");
           System.out.println("��ȣ\t�з�\tå����\t����");
           
           for(Book book : b) 
           {
               System.out.println("--------------------------------");
               System.out.println(book.toString());
           }
           
           System.out.println("--------------------------------\n");
       }
   }
   
   
   
   public void deleteBook_M()
   {
       System.out.println("\n******* ���� ���� ���� *******\n");
       
       System.out.print("���� ��ȣ �Է� : ");
       String number = sc.next();
       
       if(bm_M.deleteBook(number))
       {
           System.out.println("������ �Ϸ�Ǿ����ϴ�.");
           return;
       }
       
       System.out.println("���� ������ �����ϴ�.");
   }
   
   public void searchBook_M()
   {
       System.out.println("\n******* ���� ���� �˻� *******\n");
       
       System.out.println("1. �������� �˻� / 2. ������ȣ�� �˻�");
       System.out.print("���� > ");
       int sel = sc.nextInt();
       
       ArrayList<Book> book = new ArrayList<>();
       
       if(sel == 1)
       {
           System.out.print("�˻��� å�� ������ �Է��ϼ��� : ");
           String name = sc.next();
           
           book = bm_M.searchByName(name);
       }
       else if(sel == 2)
       {
           System.out.print("�˻��� å�� ���� ��ȣ�� �Է��ϼ��� : ");
           String number = sc.next();
           
           book.add(bm_M.searchByNum(number));
       }
       else
       {
           System.out.println("�߸� �Է��ϼ̽��ϴ�.");
           return;
       }
  
       if(book.isEmpty())
       {
           System.out.println("���� ������ �����ϴ�.");
           return;
       }
       
       System.out.println("\n--------------------------------");
       System.out.println("��ȣ\t�з�\tå����\t����");
       for(Book b : book) 
       {
           System.out.println("--------------------------------");
           System.out.println(b.toString());
       }
       
       System.out.println("--------------------------------\n");
       
   }
   
   public void printAllBook_M()
   {
       System.out.println("\n******* ��ü ���� ���� ��� *******\n");

       ArrayList<Book> b = bm_M.printAllBook();
       
       if(b.isEmpty())
       {
           System.out.println("���� ������ �����ϴ�.");
           return;
       }
       
       
       System.out.println("\n--------------------------------");
       System.out.println("��ȣ\t�з�\tå����\t����");
       
       for(Book book : b) 
       {
           System.out.println("--------------------------------");
           System.out.println(book.toString());
       }
       
       System.out.println("--------------------------------\n");
   }
   
   
   
///////////////////////////////////      HashMap<ArrayList>       ////////////////////////////////////////////////////////


   public void addBook_MA()
   {
       System.out.println("\n******* �� ���� �߰� *******\n");
       
       String number;
       while(true)
       {
           System.out.print("���� ��ȣ �Է� : ");
           number = sc.next();
           if(bm_MA.checkOverlap(number))
           {
               System.out.println("������ȣ�� �ߺ��˴ϴ�.");
               continue;
           }
           
           break;    
       }
       System.out.print("���� �з� �ڵ� ���� [1.�Ҽ� / 2.��ȭ / 3.���� / 4.��Ÿ] : ");
       int category = sc.nextInt();
       System.out.print("���� ���� �Է� : ");
       sc.nextLine();
       String name = sc.next();
       System.out.print("���� �Է� : ");
       String writer = sc.next();
       
       bm_MA.addBook(new Book(number, category, name, writer));
       
       System.out.println("���� �߰��� �Ϸ� �Ǿ����ϴ�.");
   }
   
   public void printCategory_MA()
   {
       System.out.println("\n******* ī�װ��� ���� ���� ��� *******\n");
       
       while(true) 
       {
           System.out.print("ī�װ� ���� [1.�Ҽ� / 2.��ȭ / 3.���� / 4.��Ÿ / 0.���� ] : ");
           int category = sc.nextInt();
           
           if(category == 0)
           {
               return;
           }
           
           ArrayList<Book> b = bm_MA.printCategory(category);
           
           
           if(b.isEmpty())
           {
               System.out.println("���� ������ �����ϴ�.");
               continue;
           }
           
           System.out.println("\n--------------------------------");
           System.out.println("��ȣ\t�з�\tå����\t����");
           
           for(Book book : b) 
           {
               System.out.println("--------------------------------");
               System.out.println(book.toString());
           }
           
           System.out.println("--------------------------------\n");
       }
   }
   
   
   
   public void deleteBook_MA()
   {
       System.out.println("\n******* ���� ���� ���� *******\n");
       
       System.out.print("���� ��ȣ �Է� : ");
       String number = sc.next();
       
       if(bm_MA.deleteBook(number))
       {
           System.out.println("������ �Ϸ�Ǿ����ϴ�.");
           return;
       }
       
       System.out.println("���� ������ �����ϴ�.");
   }
   
   public void searchBook_MA()
   {
       System.out.println("\n******* ���� ���� �˻� *******\n");
       
       System.out.println("1. �������� �˻� / 2. ������ȣ�� �˻�");
       System.out.print("���� > ");
       int sel = sc.nextInt();
       
       ArrayList<Book> book = new ArrayList<>();
       
       if(sel == 1)
       {
           System.out.print("�˻��� å�� ������ �Է��ϼ��� : ");
           String name = sc.next();
           
           book = bm_MA.searchByName(name);
       }
       else if(sel == 2)
       {
           System.out.print("�˻��� å�� ���� ��ȣ�� �Է��ϼ��� : ");
           String number = sc.next();
           
           book.add(bm_MA.searchByNum(number));
       }
       else
       {
           System.out.println("�߸� �Է��ϼ̽��ϴ�.");
           return;
       }
  
       if(book.isEmpty())
       {
           System.out.println("���� ������ �����ϴ�.");
           return;
       }
       
       System.out.println("\n--------------------------------");
       System.out.println("��ȣ\t�з�\tå����\t����");
       for(Book b : book) 
       {
           System.out.println("--------------------------------");
           System.out.println(b.toString());
       }
       
       System.out.println("--------------------------------\n");
       
   }
   
   public void printAllBook_MA()
   {
       System.out.println("\n******* ��ü ���� ���� ��� *******\n");

       ArrayList<Book> b = bm_MA.printAllBook();
       
       if(b.isEmpty())
       {
           System.out.println("���� ������ �����ϴ�.");
           return;
       }
       
       
       System.out.println("\n--------------------------------");
       System.out.println("��ȣ\t�з�\tå����\t����");
       
       for(Book book : b) 
       {
           System.out.println("--------------------------------");
           System.out.println(book.toString());
       }
       
       System.out.println("--------------------------------\n");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
