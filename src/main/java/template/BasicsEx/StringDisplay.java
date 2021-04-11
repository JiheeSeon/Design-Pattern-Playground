package template.BasicsEx;

public class StringDisplay implements displayable {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length; // 바이트 단위의 폭도 필드에 기억해두고 추후 사용
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() { // 내부에서만 사용할 메소드 > private 으로 막아놓기
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
