package kh.bookmanager.controller;

import java.util.ArrayList;
import java.util.HashMap;

import kh.bookmanager.vo.Book;

public class BookManager_MA
{
    HashMap<Integer, ArrayList<Book>> b = new HashMap<>();
    ArrayList<Book> novelAl = new ArrayList<>();
    ArrayList<Book> cartoonAl = new ArrayList<>();
    ArrayList<Book> historyAl = new ArrayList<>();
    ArrayList<Book> etcAl = new ArrayList<>();
    
    
    public void addBook(Book book)
    {
        
        selectAl(selectCategory(book)).add(book);
        
        b.put(selectCategory(book), selectAl(selectCategory(book)));
    }
    
    public boolean checkOverlap(String number)
    {
        ArrayList<Book> allBook = new ArrayList<>();
        
        for(int i =1; i<=b.size(); i++)
        {
            allBook.addAll(selectAl(i));
        }
        
        for(int i =0; i<allBook.size(); i++)
        {
            if(number.equals(allBook.get(i).getNumber()))
            {
                return true;
            }
        }
       
        return false;
    }
    
    
    
    public ArrayList<Book> printCategory(int category)
    {
        return selectAl(category);
    }
    
    
    
    public boolean deleteBook(String number)
    {
        for(int i=1; i<=b.size(); i++)
        {
            for(int j=0; j<this.selectAl(i).size(); j++)
            {
                if(this.selectAl(i).get(j).getNumber().equals(number))
                {
                    this.selectAl(i).remove(j);
                    return true;
                }
            }
        }
     
        return false;
    }
    
    public ArrayList<Book> searchByName(String name) 
    {
        ArrayList<Book> nameBook = new ArrayList<>();
        
        for(int i=1; i<=b.size(); i++)
        {
            for(int j=0; j<this.selectAl(i).size(); j++)
            {
                if(this.selectAl(i).get(j).getName().equals(name))
                {
                    nameBook.add(this.selectAl(i).get(j));
                }
            }
        }
        
        return nameBook;
    }
    
    public Book searchByNum(String number) 
    {
        for(int i=1; i<=b.size(); i++)
        {
            for(int j=0; j<this.selectAl(i).size(); j++)
            {
                if(this.selectAl(i).get(j).getNumber().equals(number))
                {
                    return this.selectAl(i).get(j);
                }
            }
        }
        
        return null;
    }
    
    
    
    public ArrayList<Book> printAllBook()
    {
        ArrayList<Book> allBook = new ArrayList<>();
        
        for(int i =1; i<=b.size(); i++)
        {
            allBook.addAll(selectAl(i));
        }
        
        return allBook;
    }
    
    
    public int selectCategory(Book book)
    {
        return book.getCategory();
    }
    
    public ArrayList<Book> selectAl(int category)
    {
        switch(category)
        {
            case 1: return this.novelAl;
                
            case 2: return this.cartoonAl;
                
            case 3: return this.historyAl;
                
            case 4: return this.etcAl;
                
        }
        
        return null;
    }
}
