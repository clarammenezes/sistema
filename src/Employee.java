public class Employee {
    public String verifyBookAvailability(Book book) {
        if (book.getAvailability()) {
            return "está disponível";
        }
        return "está alugado";
    }

    public String alugar(Book book) {
        var result = this.defineBookAvailability(book, false);
        if (!result) {
            return "não é possível executar";
        }
        return "executado com sucesso";
    }

    public String devolver(Book book) {
        var result = this.defineBookAvailability(book, true);
        if (!result) {
            return "não é possível executar";
        }
        return "executado com sucesso";
    }

    private Boolean defineBookAvailability(Book book, Boolean newAvailability) {
        if (book.getAvailability() == newAvailability) {
            return false;
        }
        return book.setAvailability(newAvailability);
    }
}
