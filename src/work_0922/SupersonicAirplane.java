package work_0922;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL =1;
    public static final int SUPERSONIC =2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속비행모드");
        }
        else {
            super.fly();
        }
    }
}
