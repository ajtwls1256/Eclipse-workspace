package kh.bookmanager.controller;

import java.util.ArrayList;

import kh.bookmanager.vo.Book;

public class BookManager_A
{
    ArrayList<Book> b = new ArrayList<>();
    
    public void addBook(Book book)
    {
        b.add(book);
    }
    
    public boolean checkOverlap(String number)
    {
        for(Book book : b)
        {
            if(number.equals(book.getNumber()))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public ArrayList<Book> printCategory(int category)
    {
        ArrayList<Book> categoryBook = new ArrayList<>();
        
        for(Book book : b)
        {
            if(book.getCategory() == category)
            {
                categoryBook.add(book);
            }
        }
        
        return categoryBook;
    }
    
    public boolean deleteBook(String number)
    {
        for(Book book : b)
        {
            if(number.equals(book.getNumber()))
            {
                b.remove(book);
                return true;
            }
        }
        
        return false;
  
    }
    
    
    public ArrayList<Book> searchByName(String name) 
    {
        ArrayList<Book> nameBook = new ArrayList<>();
        
        for(Book book : b)
        {
            if(name.equals(book.getName()))
            {
                nameBook.add(book);
            }
        }
        
        return nameBook;
    }
    
    public Book searchByNum(String number) 
    {
        for(Book book : b)
        {
            if(number.equals(book.getNumber()))
            {
                return book;
            }
        }
        
        return null;
    }
    
    
    
    public ArrayList<Book> printAllBook()
    {
        ArrayList<Book> allBook = new ArrayList<>();
        
        for(int i = 1; i<= 4; i++)
        {
            allBook.addAll(this.printCategory(i));
        }
        
        return allBook;
    }
    
    
    
    
    
    
    
    
    
}
