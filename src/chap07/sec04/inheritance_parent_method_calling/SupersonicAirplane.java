package chap07.sec04.inheritance_parent_method_calling;
// super 변수
public class SupersonicAirplane extends Airplane{
    // 상수 선언
    // 자주 사용되는 고정값들은 상수를 사용함으로써 가독성을 높여줌
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    // 메소드 오버라이딩
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC){
            System.out.println("초음속비행합니다.");
        } else {
            // Airplane 객체의 fly() 메소드 호출
            super.fly();
        }
    }
}
