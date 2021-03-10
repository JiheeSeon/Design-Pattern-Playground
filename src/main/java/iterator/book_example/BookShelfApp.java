package iterator.book_example;

public class BookShelfApp {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Demian"));
        bookShelf.appendBook(new Book("Effective Java"));
        bookShelf.appendBook(new Book("Do it Kotlin"));
        bookShelf.appendBook(new Book("Who've stolen my cheese"));
        Iterator it = bookShelf.iterator();

        Book book;
        while(it.hasNext()){
            book = (Book)it.next();
            System.out.println(book.getName() + " ");
        }
    }
}
