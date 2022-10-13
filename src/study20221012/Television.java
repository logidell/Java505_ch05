package study20221012;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Tv 전원 on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv 전원 off");
    }

    @Override
    public void setVolume(int volume) {
        if (volume < RemoteControl.MAX_VALUE) {
            this.volume = RemoteControl.MAX_VALUE;
        } else if (volume>RemoteControl.MIN_VALUE) {
            this.volume = RemoteControl.MIN_VALUE;
        }else {
            this.volume = volume;
        }
        System.out.println("현 Tv Volume : " + this.volume);
    }
}



