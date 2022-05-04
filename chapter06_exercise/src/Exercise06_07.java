class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }
    void volumeUp() {
        volume = Math.min(volume + 1, MAX_VOLUME);
    }
    void volumeDown() {
        volume = Math.max(volume - 1, MIN_VOLUME);
    }
    void channelUp() {
        channel = channel + 1 > MAX_CHANNEL ? MIN_CHANNEL : channel + 1;
    }
    void channelDown() {
        channel = channel - 1 < MIN_CHANNEL ? MAX_CHANNEL : channel - 1;
    }
}

public class Exercise06_07 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
        t.channelUp();
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
        t.channelDown();
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

    }
}
