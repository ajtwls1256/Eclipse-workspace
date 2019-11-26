package kh.vo;

public class TV
{
    private boolean power;
    private int volume;
    private int channel;
    
    //channel의 getter, setter, channelUp, channleDown 메소드
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
        System.out.println("채널을 올립니다.");
        channel++;
    }
    
    public void channelDown()
    {
        System.out.println("채널을 내립니다.");
        channel--;
    }
    
    
    
    //getter -> get+변수명 -> 현재 볼륨의 값을 알려줘
    public int getVolume()
    {
        return volume;
    }
    
    //setter -> set+변수명 -> 볼륨의 값을 이 값으로 설정해줘
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
        System.out.println("볼륨을 올립니다.");
        volume++;
    }
    
    public void volumeDown()
    {
        System.out.println("볼륨을 줄입니다.");
        volume--;
    }
    
    
}
