package kh.convenience.model.vo;

public class Medicine extends Common
{
    private String expiredDate; // 유통기한

    public Medicine()
    {
        
    }
    
    public Medicine(String name, int price, String quality, int amount
            , String expiredDate)
    {
        super(name, price, quality, amount);
        this.expiredDate = expiredDate;
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
                + getExpiredDate());
    }
    
    
}
