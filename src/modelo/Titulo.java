package modelo;

public class Titulo {
    private String nombre;
    private String sinopsis;
    private int fechaDeLanzamiento;
    private int tiempoDeDuracionEnMinutos;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public void muestraFichaTecnica(){
        System.out.println("****FICHA TÉCNICA****");
        System.out.println("Título: " + nombre + ".");
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento + ".");
      //  System.out.println("Director: " + director + ".");
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos.");
       // System.out.println("Cantidad de temporadas: " + temporadas + ".");
       // System.out.println("Cantidad de episodios por temporada: " + episodiosPorTemporada + ".");
       // System.out.println("Cada episodio dura " + duracionEnMinutosPorEpisodio + " minutos aprox");
    }
}
