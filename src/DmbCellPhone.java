public class DmbCellPhone extends CellPhone{
    int channel;

    DmbCellPhone(String model, String color, int channel){
//        super()가 있으나 컴파일러가 자동으로 생성자를 생성하고 생략해둔 것 뿐. 없어도 잘 작동한다.
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    void turnOnDmb(){
        System.out.println("start " + channel + ", channel");
    }
    void changeChannelDmb(int channel){this.channel = channel;
        System.out.println("Channel " + channel + ", Changed");}
    void turnOffDmb(){
        System.out.println("stop send");
    }
}
