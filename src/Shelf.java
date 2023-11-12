import java.util.ArrayList;

public class Shelf {
    private final ArrayList<Book> books = new ArrayList<>();

    public Boolean addBook(Book newBook) {
        this.books.add(newBook);
        return true;
    }

    public Boolean addBooks(ArrayList<Book> newBooks) {
        this.books.addAll(newBooks);
        return true;
    }

    public String countBooks() {
        int rentedBooks = 0;
        for (Book book : books) {
            if (!book.getAvailability()) {
                rentedBooks += 1;
            }
        }
        return "Existem " + books.size() + " livros e " + rentedBooks + " estão alugados.";
    }

    public ArrayList<Book> listBooks() {
        return this.books;
    }
}
