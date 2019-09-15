package chap07.sec06.protected_2;

import chap07.sec06.protected_1.A;
// protected 접근 제한자 테스트
// D는 A의 자식 클래스이다. 따라서 A클래스의 protected 필드, 생성자, 메소드에 접근할 수 있음
public class D extends A {
    public D(){
        super();
        this.field = "value";
        this.method();
    }
}
