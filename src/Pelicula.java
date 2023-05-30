public class Pelicula {
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

    public void imprimirDatos(){
        //hola a todos
        System.out.println(this.titulo);
        System.out.println(this.genero);
        System.out.println(this.duracion);
        System.out.println(this.anioLanzamiento);
        System.out.println(this.director);
    }
}
