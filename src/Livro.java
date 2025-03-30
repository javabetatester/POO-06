public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro {" + "titulo='" + titulo + '\'' + ", autor='"
                + autor + '\'' + ", totalPaginas=" + totalPaginas
                + ", pagAtual=" + pagAtual + ", aberto="
                + aberto + ", leitor=" + leitor.getNome() +
                ", idade =" + leitor.getIdade() +
                ", sexo =" + leitor.getSexo() +'}';
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.setAberto(true);
        } else {
            System.out.println("Seu livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
        } else {
            System.out.println("Seu livro já está fechado!");
        }
    }

    public void folhear(int p) {
        if(p > this.totalPaginas){
            this.pagAtual = this.totalPaginas;
        } else {this.pagAtual = p;}
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
