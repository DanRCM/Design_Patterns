package behavioral_patterns.iterator;

public class LibraryDemo {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("The Great Gatsby"));
        bookCollection.addBook(new Book("Moby Dick"));
        bookCollection.addBook(new Book("To Kill a Mockingbird"));

        Iterator<Book> iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book: " + book.getTitle());
        }
    }
}