package study20221012;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TurnOn Audio");
    }

    @Override
    public void turnOff() {
        System.out.println("TurnOff Audio");

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
        System.out.println("현 study20221012.Audio Volume: " + volume);
    }
}
