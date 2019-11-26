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
            case 1 : c =  "�Ҽ�";
                break;
            case 2 : c = "��ȭ";
                break;
            case 3 : c =  "����";
                break;
            case 4 : c = "��Ÿ";
                break;
            default : c = "��Ÿ";
                break;
        }
        
        return ( this.getNumber() + "\t" + c + "\t" + this.getName() + "\t" + this.getWriter() );
    }
    
}
