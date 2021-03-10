package iterator.book_example;

public class BookShelfIterator implements Iterator{
    BookShelf bookShelf;
    int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return bookShelf.getLength() > index;
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
