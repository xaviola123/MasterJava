package clases;

public  class Libro {
    String isbn;
    String titulo;
    String autor;
    int numPaginas;

    /*constructor de libro*/
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void compararNumPaginas(Libro otroLibro) {
        if (this.numPaginas > otroLibro.getNumPaginas()) {
            System.out.println("El libro " + this.titulo + " tiene más páginas que " + otroLibro.getTitulo());
        } else if (this.numPaginas < otroLibro.getNumPaginas()) {
            System.out.println("El libro " + otroLibro.getTitulo() + " tiene más páginas que " + this.titulo);
        } else {
            System.out.println("Los libros " + this.titulo + " y " + otroLibro.getTitulo() + " tienen las mismas páginas");
        }
    }

    /*
   metodo toString() pra mostrar las intancias de la clase libro
   * */
    @Override
    public String toString() {
        return "clases.Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}