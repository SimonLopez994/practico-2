public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;


    //metodos

    // Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getCreador() {
        return this.creador;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}