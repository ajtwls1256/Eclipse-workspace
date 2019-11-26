package kh.convenience.model.vo;

public class InstantFood extends Common
{
    private int calorie;        // 칼로리
    private String expiredDate; // 유통기한
    
    public InstantFood()
    {
        
    }
    
    public InstantFood(String name, int price, String quality, int amount
            , int calorie, String expiredDate)
    {
        super(name, price, quality, amount);
        this.calorie = calorie;
        this.expiredDate = expiredDate;
    }
    
    public int getCalorie()
    {
        return calorie;
    }
    public void setCalorie(int calorie)
    {
        this.calorie = calorie;
    }
    public String getExpiredDate()
    {
        return expiredDate;
    }
    public void setExpiredDate(String expiredDate)
    {
        this.expiredDate = expiredDate;
    }
    
    @Override
    public String toString()
    {

        String name = getName() + "\t";
        
        
        if(getName().length() < 4)
        {
            name += "\t";
        }
        
        return (name + getPrice() + "\t" + getQuality() + "\t" + getAmount() + "EA\t" 
                + getCalorie() + "\t" + getExpiredDate());
    }
    
}
