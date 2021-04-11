package template.BasicsEx;

public class DisplayApp {
    public static void main(String[] args) {
        displayable d1 = new CharDisplay('H');

        displayable d2 = new StringDisplay("Hello, world");

        displayable d3 = new StringDisplay("안녕하세요.");

        // 추상메소드(template method) 호출
        // -> 구현 클래스에서 정의한 바를 실행
        d1.display();
        d2.display();
        d3.display();
    }
}
