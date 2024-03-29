package chap07.sec02.inheritance;
// 자식 클래스
public class DmbCellPhone extends CellPhone {
    // 필드
    int channel;

    // 생성자
    // 부모로부터 상속받은 필드 : model, color
    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // 메소드
    void turnOnDmb(){
        System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널 : " + channel + "번으로 바꿉니다.");
    }

    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
