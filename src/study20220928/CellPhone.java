package study20220928;

public class CellPhone {
    String model, color;
    void powerOn(){
        System.out.println("전원을 킨다. ");
    }
    void powerOff() {
        System.out.println("전원을 끈다. ");
    }

    void bell(){
        System.out.println("ring my bell!");
    }
    void sendVoice(String message){
        System.out.println("you : " + message);
    }
    void recodeVoice(String message){
        System.out.println("side : " +message);
    }
    void hangup (){
        System.out.println("전화를 끊음");
    }
}
