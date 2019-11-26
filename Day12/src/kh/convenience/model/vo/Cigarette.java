package kh.convenience.model.vo;

public class Cigarette extends Common
{
    private int tar;
    private int nicotine;
    
    public Cigarette()
    {
        
    }
    
    public Cigarette(String name, int price, String quality, int amount
            , int tar, int nicotine)
    {
        super(name, price, quality, amount);
        this.tar = tar;
        this.nicotine = nicotine;
    }
    
    public int getTar()
    {
        return tar;
    }
    public void setTar(int tar)
    {
        this.tar = tar;
    }
    public int getNicotine()
    {
        return nicotine;
    }
    public void setNicotine(int nicotine)
    {
        this.nicotine = nicotine;
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
                + getTar() + "\t" + getNicotine());
    }
    
}
