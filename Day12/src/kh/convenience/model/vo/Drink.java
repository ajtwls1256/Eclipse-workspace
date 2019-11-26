package kh.convenience.model.vo;

public class Drink extends Common
{
    private int volume;         // 용량
    private int calorie;        // 칼로리
    private String expiredDate; // 유통기한
    
    public Drink()
    {
        
    }
    
    public Drink(String name, int price, String quality, int amount
            , int volume, int calorie, String expiredDate)
    {
        
        super(name, price, quality, amount);
        this.volume = volume;
        this.calorie = calorie;
        this.expiredDate = expiredDate;
        
        
    }
    
    public int getVolume()
    {
        return volume;
    }
    public void setVolume(int volume)
    {
        this.volume = volume;
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
                + getVolume() + "\t" + getCalorie() + "\t" + getExpiredDate());
    }
    
    
}
