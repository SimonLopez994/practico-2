public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private double calificacion;


    //Constructor
    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion = -1;
    }

    //metodos
    public void calificarEpisodio(double calificacion){
        if(calificacion >= 0 && calificacion >= 5){
            this.visto = true;
            this.calificacion = calificacion;
        }
    }


    //Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean getVisto() {
        return this.visto;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    

}
