public class Temporada {
    private final int cantidadEpisodios;
    private int episodiosVistos;
    private int temporada;

    public Temporada() {
        this.cantidadEpisodios = 0;
        this.episodiosVistos = 0;
    }

    public void setEpisodioVistos() {
        this.episodiosVistos += 1;
    }

    // Getters y Setters
    public int getCantidadEpisodios() {
        return this.cantidadEpisodios;
    }
}