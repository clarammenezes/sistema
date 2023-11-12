public class Book {
    private String name;
    private String author;
    private Boolean availabile = true;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book updateBook(String newName, String newAuthor) {
        setName(newName);
        setAuthor(newAuthor);
        return this;
    }

    // Name
    public String getName() {
        return name;
    }

    public String setName(String newName) {
        this.name = newName;
        return name;
    }

    // Author
    public String getAuthor() {
        return author;
    }

    public String setAuthor(String newAuthor) {
        this.author = newAuthor;
        return author;
    }

    // Availability
    public Boolean getAvailability() {
        return availabile;
    }

    public Boolean setAvailability(Boolean newAvailability) {
        this.availabile = newAvailability;
        return availabile;
    }

    // é o favorito?
    public String verifyIfFav(User user) {
        var userFavBook = user.getFavoriteBook();
        if (userFavBook == this.name) {
            return "sou o favorito";
        }
        return "infelizmente não sou o favorito";
    }
}
