package kh.convenience.model.vo;

public class Snack extends Common
{
    private int calorie;        // Ä®·Î¸®
    private String expiredDate; // À¯Åë±âÇÑ
    private boolean boxing;     // ¹Ú½Ì
    
    public Snack()
    {
        
    }
    
    public Snack(String name, int price, String quality, int amount
            , int calorie, String expiredDate, boolean boxing)
    {
        super(name, price, quality, amount);
        this.calorie = calorie;
        this.expiredDate = expiredDate;
        this.boxing = boxing;
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
    public boolean isBoxing()
    {
        return boxing;
    }
    public void setBoxing(boolean boxing)
    {
        this.boxing = boxing;
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
                + getCalorie() + "\t" + getExpiredDate() + "\t" + (isBoxing()?"O":"X"));
    }
    
}
