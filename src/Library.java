import java.util.ArrayList;

public class Library {
    private final ArrayList<Shelf> shelfs = new ArrayList<>();

    public Boolean addShelf(Shelf newShelf) {
        this.shelfs.add(newShelf);
        return true;
    }

    public Boolean addBookOnShelf(int position, Book newBook) {
        this.shelfs.get(position).addBook(newBook);
        return true;
    }

    public ArrayList<Shelf> listShelfs() {
        return this.shelfs;
    }
}
