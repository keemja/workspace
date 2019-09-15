package chap07.sec02.inheritance;
// 상속 : 부모가 자식에게 물려주는 행위, 부모가 물려준 것을 자연스럽게 이용할 수 있음
// 키워드 : extends 부모클래스 (자바는 다중 상속 혀용 안함)

// 부모 클래스
public class CellPhone {
    // 필드
    String model;
    String color;

    // 생성자

    // 메소드
    void powerOn() { System.out.println("전원을 켭니다."); }
    void powerOff() { System.out.println("전원을 끕니다."); }
    void bell() {System.out.println("벨이 울립니다."); }
    void sendVoice(String message) { System.out.println("자기 : " + message); }
    void receiveVoice(String message) { System.out.println("상대방 : " + message); }
    void hangUp() { System.out.println("전화를 끊습니다."); }
}
