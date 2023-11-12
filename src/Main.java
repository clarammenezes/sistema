import java.util.ArrayList;

public class Main {

    private static ArrayList<Book> createManyBooks(int qnt) {
        ArrayList<Book> books = new ArrayList<>();

        while (qnt > 0) {
            books.add(new Book(
                    String.format("%f", Math.random()),
                    String.format("%f", Math.random())));
            qnt--;
        }
        return books;
    }

    private static void printBooks(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + "- " + books.get(i).getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- INICIO DO PROGRAMA ---");

        // Usuário
        User user1 = new User("Vinicius");
        System.out.println("Existe um usuário chamado " + user1.getName());
        System.out.println("Mas mudou seu nome para " + user1.setName("Vini"));

        // Livro
        Book livro1 = new Book("Abcedario", "Vini");
        System.out.println("Existe um livro chamado " + livro1.getName() + " de autor " + livro1.getAuthor());
        livro1.updateBook("Céu Azul", "Vinicius");
        System.out.println("Mas mudou para " + livro1.getName() + " de autor " + livro1.getAuthor());
        System.out.println("De qualquer forma, a disponibilidade do livro sempre começa " + livro1.getAvailability());

        // Associação de livro favorito ao usuário
        user1.setFavoriteBook(livro1);
        System.out.println("E, não por coincidência, o livro favorito de " + user1.getName() + " é " + user1.getFavoriteBook());

        // Funcionário
        Employee employee1 = new Employee();
        System.out.println("Sempre que " + user1.getName()
                + " quer alugar um livro, ele precisa pedir para um funcionário verificar se o livro está disponível. No caso, o livro "
                + livro1.getName() + ", " + employee1.verifyBookAvailability(livro1));

        System.out.println("Nesse caso, ao pedir para alugar o livro, o funcionário diz que o processo foi "
                + employee1.alugar(livro1));

        System.out.println("Se ao mesmo tempo mais alguém quiser alugar o mesmo livro, o funcionário diz que "
                + employee1.alugar(livro1));

        System.out.println("Antes de mais alguém alugar, é preciso devolver o livro, onde o funcionário diz que o processo "
                + employee1.devolver(livro1));

        // Estante
        Shelf shelf1 = new Shelf();
        ArrayList<Book> manyBooks = createManyBooks(3);
        shelf1.addBooks(manyBooks);
        shelf1.addBook(livro1);
        System.out.println("Quando organizamos os livros da estante, sabemos que: " + shelf1.countBooks());
        System.out.println("E que os livros nela são:");
        printBooks(shelf1.listBooks());

        // Biblioteca
        System.out.println("Por fim, mas não menos importante, temos uma biblioteca");
        Library library1 = new Library();
        library1.addShelf(new Shelf());
        Book livro2 = new Book("1234", "5678");
        library1.addBookOnShelf(0, livro2);

        System.out.println("--- FIM DO PROGRAMA ---");
    }
}
