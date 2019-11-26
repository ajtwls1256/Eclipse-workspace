package kh.bookmanager.vo;

public class Book
{
    private String number;
    private int category;
    private String name;
    private String writer;
    
    public Book()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public Book(String number, int category, String name, String writer)
    {
        super();
        this.number = number;
        this.category = category;
        this.name = name;
        this.writer = writer;
    }
    
    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }
    public int getCategory()
    {
        return category;
    }
    public void setCategory(int category)
    {
        this.category = category;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getWriter()
    {
        return writer;
    }
    public void setWriter(String writer)
    {
        this.writer = writer;
    }
    
    @Override
    public String toString()
    {
        String c;
        
        switch(this.category)
        {
            case 1 : c =  "소설";
                break;
            case 2 : c = "만화";
                break;
            case 3 : c =  "역사";
                break;
            case 4 : c = "기타";
                break;
            default : c = "기타";
                break;
        }
        
        return ( this.getNumber() + "\t" + c + "\t" + this.getName() + "\t" + this.getWriter() );
    }
    
}
