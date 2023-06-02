public class Pelicula {
    //atributos
    String titulo;
    String genero;
    int duracion;
    int anioLanzamiento;
    String director;

    //constructor
    public Pelicula(String titulo, String genero, int duracion, int anioLanzamiento, String director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.anioLanzamiento = anioLanzamiento;
        this.director = director;
    }

    //getters and setters
    public String getTitulo() {

        return titulo;
    }
    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {

        this.genero = genero;
    }

    public int getDuracion() {

        return duracion;
    }
    public void setDuracion(int duracion) {

        this.duracion = duracion;
    }

    public int getAnioLanzamiento() {

        return anioLanzamiento;
    }
    public void setAnioLanzamiento(int anioLanzamiento) {

        this.anioLanzamiento = anioLanzamiento;
    }

    public String getDirector() {

        return director;
    }
    public void setDirector(String director) {

        this.director = director;
    }

    //imprimir datos
    public void imprimirDatos(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Género: " + this.genero);
        System.out.println("Duración: " + this.duracion);
        System.out.println("Año de lanzamiento: " + this.anioLanzamiento);
        System.out.println("Director: " + this.director);
    }
}
