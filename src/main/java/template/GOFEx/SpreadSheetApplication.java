package template.GOFEx;

public class SpreadSheetApplication implements Application{

    @Override
    public Document createDocument() {
        return new SpreadSheetDocument(); // Document의 구현체를 넘겨줌
    }

    @Override
    public boolean canOpenDocument(String fileName) {
        return false;
    }

    @Override
    public void aboutToOpenDocument(Document document) {
    }
}