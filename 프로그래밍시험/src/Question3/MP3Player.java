package Question3;

public class MP3Player {
    private String name;
    private String color;
    private boolean power;
    public int number;

    public MP3Player(String name, String color, boolean power) {
        this.name = name;
        this.color = color;
        this.power = power;
        this.number = 0;
    }

    public void powerOnOff(boolean onOff) {
        this.power = onOff;
    }

    public void play() {

    }

    public void stop() {

    }

    public int remove() {
        return 0;
    }
}
