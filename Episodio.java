public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private double calificacion;

    private String getTitulo() {
        return this.titulo;
    }

    private String getDescripcion() {
        return this.descripcion;
    }

    private boolean getVisto() {
        return this.visto;
    }

    private double getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 5) {
            System.out.println("Esa Calificacion no es valida");
        } else {
            this.calificacion = calificacion;
        }
    }

    
}
