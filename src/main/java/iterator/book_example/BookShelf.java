package iterator.book_example;

public class BookShelf implements Aggregate{
    private Book[] books;
    private int last;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        books[last++] = book;
    }

    public int getLength(){
        return last;
    }

    @Override
    public BookShelfIterator iterator() {
        return new BookShelfIterator(this);
    }
}
