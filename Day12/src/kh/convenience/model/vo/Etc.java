package kh.convenience.model.vo;

public class Etc extends Common
{
    public Etc()
    {
        
    }
    
    public Etc(String name, int price, String quality, int amount)
    {
        super(name, price, quality, amount);
    }
    
    @Override
    public String toString()
    {
        
        String name = getName() + "\t";
        
        
        if(getName().length() < 4)
        {
            name += "\t";
        }
        
        return (name + getPrice() + "\t" + getQuality() + "\t" + getAmount() + "EA");
    }
}
