package kh.bookmanager.controller;

import java.util.ArrayList;
import java.util.HashMap;

import kh.bookmanager.vo.Book;

public class BookManager_M
{
    HashMap<String, Book> b = new HashMap<>();
    
    public void addBook(Book book)
    {
        b.put(book.getNumber(), book);
    }
    
    public boolean checkOverlap(String number)
    {
        return b.containsKey(number);
    }
    
    
    public ArrayList<Book> printCategory(int category)
    {
        ArrayList<Book> categoryBook = new ArrayList<>();
        
        ArrayList<String> bKey = new ArrayList<>(b.keySet());
        
        for(String s : bKey)
        {
            if(b.get(s).getCategory() == category)
            {
                categoryBook.add(b.get(s));
            }
        }
        
        return categoryBook;
    }
    
    
    public boolean deleteBook(String number)
    {
        if(checkOverlap(number))
        {
            b.remove(number);
            return true;
        }
        
        return false;
        
    }
    
    public ArrayList<Book> searchByName(String name) 
    {
        ArrayList<Book> nameBook = new ArrayList<>();
        
        ArrayList<String> bKey = new ArrayList<>(b.keySet());
        
        for(String s : bKey)
        {
            if(name.equals(b.get(s).getName()))
            {
                nameBook.add(b.get(s));
            }
        }
        
        return nameBook;
    }
    
    public Book searchByNum(String number) 
    {
        return b.get(number);
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
