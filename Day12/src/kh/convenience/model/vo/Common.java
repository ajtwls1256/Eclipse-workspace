package kh.convenience.model.vo;

public class Common
{
    private String name;        // ��ǰ��
    private int price;          // ����
    private String quality;     // ǰ��
    private int amount;         // ���
   
    
    public Common()
    {
        
    }
    
    public Common(String name, int price, String quality, int amount)
    {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.amount = amount;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public String getQuality()
    {
        return quality;
    }
    public void setQuality(String quality)
    {
        this.quality = quality;
    }
    public int getAmount()
    {
        return amount;
    }
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    


    
}
