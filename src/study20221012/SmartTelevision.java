package study20221012;

public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("smart tv turn on ");
    }

    @Override
    public void turnOff() {
        System.out.println("smart tv turn off ");

    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VALUE) {
            this.volume = RemoteControl.MAX_VALUE;
        } else if (volume < RemoteControl.MIN_VALUE) {
            this.volume = RemoteControl.MIN_VALUE;
        } else {
            this.volume = volume;
        }
        System.out.println("Smart tv volume : " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 을 검색합니다. ");
    }
}
