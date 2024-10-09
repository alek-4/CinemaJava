package Datos;

public class Peliculas {

    private String titulo;
    private Integer duracion;
    private Integer edad;
    private String director;
    private Integer valor;
    public Peliculas() {
    }

    public Peliculas(String titulo, Integer duracion, Integer edad, String director, Integer valor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad = edad;
        this.director = director;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return
                "titulo: " + titulo + "\n" +
                "duracion: " + duracion + "\n" +
                "edad: " + edad + "\n" +
                "director: " + director
                ;
    }
}
