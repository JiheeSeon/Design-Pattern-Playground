package adapter.example;

public class PrintBannerWithDelegate extends PrintAbs {
    private Banner banner;
    public PrintBannerWithDelegate(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
