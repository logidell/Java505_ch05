package study20220928;

public class SupersonicAirplaneEx {
    public void execute() {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeoff();
        sa.flymode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flymode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
