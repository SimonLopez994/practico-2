
import java.util.ArrayList;

public class Temporada {
    private int numeroTemporada;
    private ArrayList<Episodio> episodios;

    // constructor
    public Temporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
        this.episodios = new ArrayList<>();
    }

    // metodos
    public int calcularEpidosdiosVistosTemporada(int numeroTemporada) {
        int vistos = 0;
        for (Episodio e : episodios) {
            if (e.getVisto()) {
                vistos++;
            }
        }
        return vistos;
    }

    public double calcularPromedioCalificacionesTemporada(int numeroTemporada) {
        double cantidadEpisodios = 0;
        double total = 0;
        for (Episodio e : episodios) {
            cantidadEpisodios++;
            total += e.getCalificacion();
        }
        return total / cantidadEpisodios;
    }

    // getters y setters
    public int getNumeroTemporada() {
        return this.numeroTemporada;
    }
}