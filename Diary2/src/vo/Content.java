package vo;
import java.util.ArrayList;

public class Content
{
    int day;
    ArrayList<String> list;
    
    public Content()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public Content(int day, ArrayList<String> list)
    {
        super();
        this.day = day;
        this.list = list;
    }
    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        this.day = day;
    }
    public ArrayList<String> getList()
    {
        return list;
    }
    public void setList(ArrayList<String> list)
    {
        this.list = list;
    }
}
