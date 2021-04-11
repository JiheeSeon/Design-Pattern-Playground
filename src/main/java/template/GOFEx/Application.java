package template.GOFEx;

import java.util.ArrayList;

public interface Application {
    public ArrayList<Document> docs = new ArrayList<>();

    default void addDocument(Document document){
        docs.add(document);
    }

    // template method
    default void openDocument(String fileName){
        // 열 수 있는 문서인지 확인
        if (!canOpenDocument(fileName)) return;
        // 하위 클래스에서 정의할 메소드 사용

        // 어플리케이션에 필요한 Document 인스턴스 생성 (하위 클래스에 맡김)
        Document doc = createDocument();

        if (doc != null) {
            addDocument(doc); // 문서 집합에 추가
            aboutToOpenDocument(doc);
            doc.open();
            doc.read(); // SpreadSheetDocument -> read
        }
    }

    // abstract method(concrete class should override)
    public Document createDocument();
    public boolean canOpenDocument(String fileName);
    public void aboutToOpenDocument(Document document);
}