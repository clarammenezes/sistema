public class User {
    private String name;
    private String nameOfFavoriteBook;

    public User(String name) {
        this.name = name;
    }

    // name
    public String getName() {
        return name;
    }

    public String setName(String newName) {
        this.name = newName;
        return name;
    }

    // nameOfFavoriteBook
    public String getFavoriteBook() {
        return nameOfFavoriteBook;
    }

    public String setFavoriteBook(Book newFavoriteBook) {
        this.nameOfFavoriteBook = newFavoriteBook.getName();
        return nameOfFavoriteBook;
    }
}
