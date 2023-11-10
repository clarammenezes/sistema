public class biblioteca {
    //declarando atributos
    int qtd_livros= 154;
    int emprestimos_realizados= 17;
    int devolucoes_realizadas= 16;

    //método construtor

    public biblioteca(){}

    public biblioteca(int qtd_livros, int emprestimos_realizados, int devolucoes_realizadas){
        this.qtd_livros = qtd_livros;
        this.emprestimos_realizados = emprestimos_realizados;
        this.devolucoes_realizadas = devolucoes_realizadas;
    }

    //métodos getters e setters

   

    public int getQtd_livros() {
        return qtd_livros;
    }

    public void setQtd_livros(int qtd_livros) {
        this.qtd_livros = qtd_livros;
    }

    public int getEmprestimos_realizados() {
        return emprestimos_realizados;
    }

    public void setEmprestimos_realizados(int emprestimos_realizados) {
        this.emprestimos_realizados = emprestimos_realizados;
    }

    public int getDevolucoes_realizadas() {
        return devolucoes_realizadas;
    }

    public void setDevolucoes_realizadas(int devolucoes_realizadas) {
        this.devolucoes_realizadas = devolucoes_realizadas;
    }
    
    @Override
    public String toString(){
        return "\nbilbioteca{" +
            "\nQuantidade de livros: '" + qtd_livros + '\'' +
            "\nEmprestimos realizados: " + emprestimos_realizados +
            "\nDevoluções realizadas: " + devolucoes_realizadas +
            '}';
}

}
