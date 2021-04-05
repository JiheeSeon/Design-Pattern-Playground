package adapter.example;

public class adapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        PrintAbs pb = new PrintBannerWithDelegate("Test");
        pb.printWeak();
        pb.printStrong();
    }
}
