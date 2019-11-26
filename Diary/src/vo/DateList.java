package vo;

import java.util.ArrayList;

public class DateList
{
    int day;
    ArrayList<String> mission;
    
    public DateList()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public DateList(int date, ArrayList<String> mission)
    {
        super();
        this.day = date;
        this.mission = mission;
    }
    public int getDate()
    {
        return day;
    }
    public void setDate(int date)
    {
        this.day = date;
    }
    public ArrayList<String> getMission()
    {
        return mission;
    }
    public void setMission(ArrayList<String> mission)
    {
        this.mission = mission;
    }
}
