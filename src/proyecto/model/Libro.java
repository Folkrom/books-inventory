package proyecto.model;

public class Libro {
    // Atributos del libro a guardar en la DB
    private String ISBN;
    private int edicion;
    private int fechaPublicacion;
    private String titulo;
    private String nombreAutor;
    private String primerApellidoAutor;
    private String segundoApellidoAutor;
    private int paginas;
    private String categoria;
    private String editorial;

    public Libro() {
    }

    public Libro(String ISBN, int edicion, int fechaPublicacion, String titulo, String nombreAutor,
            String primerApellidoAutor, String segundoApellidoAutor, int paginas, String categoria, String editorial) {
        this.ISBN = ISBN;
        this.edicion = edicion;
        this.fechaPublicacion = fechaPublicacion;
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.primerApellidoAutor = primerApellidoAutor;
        this.segundoApellidoAutor = segundoApellidoAutor;
        this.paginas = paginas;
        this.categoria = categoria;
        this.editorial = editorial;
    }

    // Getters y Setters para cada atributo
    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEdicion() {
        return this.edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return this.nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getPrimerApellidoAutor() {
        return this.primerApellidoAutor;
    }

    public void setPrimerApellidoAutor(String primerApellidoAutor) {
        this.primerApellidoAutor = primerApellidoAutor;
    }

    public String getSegundoApellidoAutor() {
        return this.segundoApellidoAutor;
    }

    public void setSegundoApellidoAutor(String segundoApellidoAutor) {
        this.segundoApellidoAutor = segundoApellidoAutor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // Sobreescritura del metodo toString() para dar formato a la salida
    @Override
    public String toString() {
        return "ISBN: " + this.ISBN + "\n" +
                "Edicion: " + this.edicion + "\n" +
                "Fecha de publicacion: " + this.fechaPublicacion + "\n" +
                "Titulo: " + this.titulo + "\n" +
                "Nombre del autor: " + this.nombreAutor + "\n" +
                "Primer apellido del autor: " + this.primerApellidoAutor + "\n" +
                "Segundo apellido del autor: " + this.segundoApellidoAutor + "\n" +
                "Numero de paginas: " + this.paginas + "\n" +
                "Categoria: " + this.categoria + "\n" +
                "Editorial: " + this.editorial;
    }

}
