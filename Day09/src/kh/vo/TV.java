package kh.vo;

public class TV
{
    private boolean power;
    private int volume;
    private int channel;
    
    //channel�� getter, setter, channelUp, channleDown �޼ҵ�
    public int getChannel()
    {
        return channel;
    }
    
    public void setChannel(int channel)
    {
        this.channel = channel;
    }
    
    public void channelUp()
    {
        System.out.println("ä���� �ø��ϴ�.");
        channel++;
    }
    
    public void channelDown()
    {
        System.out.println("ä���� �����ϴ�.");
        channel--;
    }
    
    
    
    //getter -> get+������ -> ���� ������ ���� �˷���
    public int getVolume()
    {
        return volume;
    }
    
    //setter -> set+������ -> ������ ���� �� ������ ��������
    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    
    
    public void power()
    {
        power = !power;
    }
    
    public void volumeUp()
    {
        System.out.println("������ �ø��ϴ�.");
        volume++;
    }
    
    public void volumeDown()
    {
        System.out.println("������ ���Դϴ�.");
        volume--;
    }
    
    
}
