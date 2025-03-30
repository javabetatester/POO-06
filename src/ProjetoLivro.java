public class ProjetoLivro {
    public static void main(String[] args) {
      Pessoa [] p = new Pessoa[3];
      Livro [] l = new Livro[3];

      p[0] = new Pessoa("Maria", 22, "M");
      p[1] = new Pessoa("Jorge", 32, "M");
      p[2] = new Pessoa("Luizana", 18, "F");

      l[0] = new Livro("Java", "Cleyton", 400, p[0]);
      l[1] = new Livro("Python", "Cleyton", 200, p[1]);
      l[2] = new Livro("C++", "Cleyton", 300, p[2]);

      l[0].abrir();
      l[0].folhear(200);
        System.out.println(l[0].detalhes());


    }
}