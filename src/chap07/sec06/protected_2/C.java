package chap07.sec06.protected_2;

import chap07.sec06.protected_1.A;
// protected 접근 제한자 테스트
// 해당 C 클래스는 A클래스와 다른 패키지에 있다. 따라서 A클래스의 protected 필드, 생성자, 메소드에 접근할 수 없음
public class C {
    public void method(){
        /*A a.field = "value"; = new A();
        a.field = "value";
        a.method();*/
    }
}
