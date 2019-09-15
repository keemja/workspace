package chap07.sec04.inheritance_method_override;
// 메소드 오버라이딩(method overriding)
// - 부모의 메소드와 동일한 시그너처(리턴 타입, 메소드 이름, 매개변수 리스트)를 가져야 한다.
// - 접근 제한을 더 강하게 오버라이딩할 수 없다.
// - 새로운 예외(Exception)를 throws 할 수 없다.

// 자식 클래스
public class Computer extends Calculator{
    // 재정의된 메소드
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
