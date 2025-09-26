import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;
    // metodos

    public Serie(String titulo, String descripcion, String creador) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    // metodos
    public int totalEpisosdiosVistos(String titulo) {
        int vistos = 0;
        for (Temporada e : temporadas) {
            e.calcularEpidosdiosVistosTemporada(e.getNumeroTemporada());
        }
        return vistos;
    }

    public double promedioCalificacionesSerie(String titulo) {
        double total = 0;
        int numero = 0;
        int cantidadTemporadas = 0;
        for (Temporada e : temporadas) {
            total += e.calcularPromedioCalificacionesTemporada(numero);
            numero++;
            cantidadTemporadas++;
        }

        return total / cantidadTemporadas;
    }

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