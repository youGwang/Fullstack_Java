package Question2;

public class Tv {
    String color;
    int number;
    int channel;

    public void channelUp() {
        channel++;
    }
    
    public void channelDown() {
        channel--;
    }
    
    public void setChannel(int number) {
        channel = number;
    }
    
    public void print() {
        System.out.println("Tv의 현재 채널은 : " + channel + "이고, Tv의 색깔은 " + color + " 입니다.");
    }
}