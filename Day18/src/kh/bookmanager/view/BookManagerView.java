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
            System.out.println("\n******* 도서 관리 프로그램 *******\n");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 카테고리 별 도서 정보 출력");
            System.out.println("3. 도서 정보 삭제");
            System.out.println("4. 도서 정보 검색");
            System.out.println("5. 전체 도서 정보 출력");
            System.out.println("0. 프로그램 종료");
            System.out.print("선택 > ");
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
                    case 0: System.out.println("프로그램을 종료합니다.");
                    return;
                    default: System.out.println("잘못 입력하셨습니다 !");
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
                    case 0: System.out.println("프로그램을 종료합니다.");
                    return;
                    default: System.out.println("잘못 입력하셨습니다 !");
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
                    case 0: System.out.println("프로그램을 종료합니다.");
                    return;
                    default: System.out.println("잘못 입력하셨습니다 !");
                    break;
                }
            }
            
            
            
        }
   }
   
/////////////////////////////////////      ArrayList       //////////////////////////////////////////////////////// 
   
   public void addBook()
   {
       System.out.println("\n******* 새 도서 추가 *******\n");
       
       String number;
       while(true)
       {
           System.out.print("도서 번호 입력 : ");
           number = sc.next();
           if(bm_A.checkOverlap(number))
           {
               System.out.println("도서번호가 중복됩니다.");
               continue;
           }
           
           break;    
       }
       System.out.print("도서 분류 코드 선택 [1.소설 / 2.만화 / 3.역사 / 4.기타] : ");
       int category = sc.nextInt();
       System.out.print("도서 제목 입력 : ");
       sc.nextLine();
       String name = sc.next();
       System.out.print("저자 입력 : ");
       String writer = sc.next();
       
       bm_A.addBook(new Book(number, category, name, writer));
       
       System.out.println("도서 추가가 완료 되었습니다.");
   }
   
   
   
   public void printCategory()
   {
       System.out.println("\n******* 카테고리별 도서 정보 출력 *******\n");
       
       while(true) 
       {
           System.out.print("카테고리 선택 [1.소설 / 2.만화 / 3.역사 / 4.기타 / 0.종료 ] : ");
           int category = sc.nextInt();
           
           if(category == 0)
           {
               return;
           }
           
           ArrayList<Book> b = bm_A.printCategory(category);
           
           
           if(b.isEmpty())
           {
               System.out.println("도서 정보가 없습니다.");
               continue;
           }
           
           System.out.println("\n--------------------------------");
           System.out.println("번호\t분류\t책제목\t저자");
           
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
       System.out.println("\n******* 도서 정보 삭제 *******\n");
       
       System.out.print("도서 번호 입력 : ");
       String number = sc.next();
       
       if(bm_A.deleteBook(number))
       {
           System.out.println("삭제가 완료되었습니다.");
           return;
       }
       
       System.out.println("도서 정보가 없습니다.");
       
   }
   
   public void searchBook()
   {
       System.out.println("\n******* 도서 정보 검색 *******\n");
       
       System.out.println("1. 제목으로 검색 / 2. 도서번호로 검색");
       System.out.print("선택 > ");
       int sel = sc.nextInt();
       
       ArrayList<Book> book = new ArrayList<>();
       
       if(sel == 1)
       {
           System.out.print("검색할 책의 제목을 입력하세요 : ");
           String name = sc.next();
           
           book = bm_A.searchByName(name);
       }
       else if(sel == 2)
       {
           System.out.print("검색할 책의 도서 번호를 입력하세요 : ");
           String number = sc.next();
           
           book.add(bm_A.searchByNum(number));
       }
       else
       {
           System.out.println("잘못 입력하셨습니다.");
           return;
       }
  
       if(book.isEmpty())
       {
           System.out.println("도서 정보가 없습니다.");
           return;
       }
       
       System.out.println("\n--------------------------------");
       System.out.println("번호\t분류\t책제목\t저자");
       for(Book b : book) 
       {
           System.out.println("--------------------------------");
           System.out.println(b.toString());
       }
       
       System.out.println("--------------------------------\n");
       
   }
   
   public void printAllBook()
   {
       System.out.println("\n******* 전체 도서 정보 출력 *******\n");

       ArrayList<Book> b = bm_A.printAllBook();
       
       if(b.isEmpty())
       {
           System.out.println("도서 정보가 없습니다.");
           return;
       }
       
       
       System.out.println("\n--------------------------------");
       System.out.println("번호\t분류\t책제목\t저자");
       
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
       System.out.println("\n******* 새 도서 추가 *******\n");
       
       String number;
       while(true)
       {
           System.out.print("도서 번호 입력 : ");
           number = sc.next();
           if(bm_M.checkOverlap(number))
           {
               System.out.println("도서번호가 중복됩니다.");
               continue;
           }
           
           break;    
       }
       System.out.print("도서 분류 코드 선택 [1.소설 / 2.만화 / 3.역사 / 4.기타] : ");
       int category = sc.nextInt();
       System.out.print("도서 제목 입력 : ");
       sc.nextLine();
       String name = sc.next();
       System.out.print("저자 입력 : ");
       String writer = sc.next();
       
       bm_M.addBook(new Book(number, category, name, writer));
       
       System.out.println("도서 추가가 완료 되었습니다.");
   }
   
   public void printCategory_M()
   {
       System.out.println("\n******* 카테고리별 도서 정보 출력 *******\n");
       
       while(true) 
       {
           System.out.print("카테고리 선택 [1.소설 / 2.만화 / 3.역사 / 4.기타 / 0.종료 ] : ");
           int category = sc.nextInt();
           
           if(category == 0)
           {
               return;
           }
           
           ArrayList<Book> b = bm_M.printCategory(category);
           
           
           if(b.isEmpty())
           {
               System.out.println("도서 정보가 없습니다.");
               continue;
           }
           
           System.out.println("\n--------------------------------");
           System.out.println("번호\t분류\t책제목\t저자");
           
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
       System.out.println("\n******* 도서 정보 삭제 *******\n");
       
       System.out.print("도서 번호 입력 : ");
       String number = sc.next();
       
       if(bm_M.deleteBook(number))
       {
           System.out.println("삭제가 완료되었습니다.");
           return;
       }
       
       System.out.println("도서 정보가 없습니다.");
   }
   
   public void searchBook_M()
   {
       System.out.println("\n******* 도서 정보 검색 *******\n");
       
       System.out.println("1. 제목으로 검색 / 2. 도서번호로 검색");
       System.out.print("선택 > ");
       int sel = sc.nextInt();
       
       ArrayList<Book> book = new ArrayList<>();
       
       if(sel == 1)
       {
           System.out.print("검색할 책의 제목을 입력하세요 : ");
           String name = sc.next();
           
           book = bm_M.searchByName(name);
       }
       else if(sel == 2)
       {
           System.out.print("검색할 책의 도서 번호를 입력하세요 : ");
           String number = sc.next();
           
           book.add(bm_M.searchByNum(number));
       }
       else
       {
           System.out.println("잘못 입력하셨습니다.");
           return;
       }
  
       if(book.isEmpty())
       {
           System.out.println("도서 정보가 없습니다.");
           return;
       }
       
       System.out.println("\n--------------------------------");
       System.out.println("번호\t분류\t책제목\t저자");
       for(Book b : book) 
       {
           System.out.println("--------------------------------");
           System.out.println(b.toString());
       }
       
       System.out.println("--------------------------------\n");
       
   }
   
   public void printAllBook_M()
   {
       System.out.println("\n******* 전체 도서 정보 출력 *******\n");

       ArrayList<Book> b = bm_M.printAllBook();
       
       if(b.isEmpty())
       {
           System.out.println("도서 정보가 없습니다.");
           return;
       }
       
       
       System.out.println("\n--------------------------------");
       System.out.println("번호\t분류\t책제목\t저자");
       
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
       System.out.println("\n******* 새 도서 추가 *******\n");
       
       String number;
       while(true)
       {
           System.out.print("도서 번호 입력 : ");
           number = sc.next();
           if(bm_MA.checkOverlap(number))
           {
               System.out.println("도서번호가 중복됩니다.");
               continue;
           }
           
           break;    
       }
       System.out.print("도서 분류 코드 선택 [1.소설 / 2.만화 / 3.역사 / 4.기타] : ");
       int category = sc.nextInt();
       System.out.print("도서 제목 입력 : ");
       sc.nextLine();
       String name = sc.next();
       System.out.print("저자 입력 : ");
       String writer = sc.next();
       
       bm_MA.addBook(new Book(number, category, name, writer));
       
       System.out.println("도서 추가가 완료 되었습니다.");
   }
   
   public void printCategory_MA()
   {
       System.out.println("\n******* 카테고리별 도서 정보 출력 *******\n");
       
       while(true) 
       {
           System.out.print("카테고리 선택 [1.소설 / 2.만화 / 3.역사 / 4.기타 / 0.종료 ] : ");
           int category = sc.nextInt();
           
           if(category == 0)
           {
               return;
           }
           
           ArrayList<Book> b = bm_MA.printCategory(category);
           
           
           if(b.isEmpty())
           {
               System.out.println("도서 정보가 없습니다.");
               continue;
           }
           
           System.out.println("\n--------------------------------");
           System.out.println("번호\t분류\t책제목\t저자");
           
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
       System.out.println("\n******* 도서 정보 삭제 *******\n");
       
       System.out.print("도서 번호 입력 : ");
       String number = sc.next();
       
       if(bm_MA.deleteBook(number))
       {
           System.out.println("삭제가 완료되었습니다.");
           return;
       }
       
       System.out.println("도서 정보가 없습니다.");
   }
   
   public void searchBook_MA()
   {
       System.out.println("\n******* 도서 정보 검색 *******\n");
       
       System.out.println("1. 제목으로 검색 / 2. 도서번호로 검색");
       System.out.print("선택 > ");
       int sel = sc.nextInt();
       
       ArrayList<Book> book = new ArrayList<>();
       
       if(sel == 1)
       {
           System.out.print("검색할 책의 제목을 입력하세요 : ");
           String name = sc.next();
           
           book = bm_MA.searchByName(name);
       }
       else if(sel == 2)
       {
           System.out.print("검색할 책의 도서 번호를 입력하세요 : ");
           String number = sc.next();
           
           book.add(bm_MA.searchByNum(number));
       }
       else
       {
           System.out.println("잘못 입력하셨습니다.");
           return;
       }
  
       if(book.isEmpty())
       {
           System.out.println("도서 정보가 없습니다.");
           return;
       }
       
       System.out.println("\n--------------------------------");
       System.out.println("번호\t분류\t책제목\t저자");
       for(Book b : book) 
       {
           System.out.println("--------------------------------");
           System.out.println(b.toString());
       }
       
       System.out.println("--------------------------------\n");
       
   }
   
   public void printAllBook_MA()
   {
       System.out.println("\n******* 전체 도서 정보 출력 *******\n");

       ArrayList<Book> b = bm_MA.printAllBook();
       
       if(b.isEmpty())
       {
           System.out.println("도서 정보가 없습니다.");
           return;
       }
       
       
       System.out.println("\n--------------------------------");
       System.out.println("번호\t분류\t책제목\t저자");
       
       for(Book book : b) 
       {
           System.out.println("--------------------------------");
           System.out.println(book.toString());
       }
       
       System.out.println("--------------------------------\n");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
