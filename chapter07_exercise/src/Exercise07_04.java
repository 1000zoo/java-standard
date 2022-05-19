class MyTv02 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevCH;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    MyTv02() {
        channel = MIN_CHANNEL;
        volume = MIN_VOLUME;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setChannel(int channel) {
        prevCH = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        int tmp = prevCH;
        prevCH = channel;
        channel = tmp;
    }
}

public class Exercise07_04 {
    public static void main(String[] args) {
        MyTv02 t = new MyTv02();
        t.setChannel(10);
        t.setVolume(20);
        System.out.println(t.getChannel() + ", " + t.getVolume());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
    }
}
