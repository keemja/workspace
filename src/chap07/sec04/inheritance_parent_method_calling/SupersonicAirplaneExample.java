package chap07.sec04.inheritance_parent_method_calling;
// super 변수
public class SupersonicAirplaneExample {
    public static void main(String[] args){
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
