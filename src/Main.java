// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //instancias Eduardo Almachi
        Pelicula Terminator = new Pelicula("Terminator", "accion", 2, 2016,
                "James Cameron");
        Pelicula Titanic = new Pelicula("Titanic", "drama", 3, 1999,
                "James Cameron");
        Pelicula ShuterIsland = new Pelicula("Shutter Island", "suspenso", 3, 2010,
                "Martin Scoserse");
        Pelicula Interestellar = new Pelicula("Interestelar", "accion", 2, 2014,
                "Christoper Nolan");
        //Instancias Gilmar Morales
        Pelicula  La_La_Land =new Pelicula("La La Land", "Musical, Romance, Drama",2 , 2016,
                "Damien Chazelle");
        Pelicula  El_Padrino =new Pelicula("El Padrino", "Drama, Crimen",2 , 1972,
                "Francis Ford Coppola");
        Pelicula El_Caballero_de_la_Noche =new Pelicula("El Caballero de la Noche", "Acción, Crimen, Drama",2 , 2008,
                "Christopher Nolan");
        Pelicula El_Señor_de_los_Anillos =new Pelicula("El Señor de los Anillos: El retorno del Rey", "Aventura, Fantasía, Acción",3 , 2003,
                "Peter Jackson");
        //Instancias Paul Hidalgo
        Pelicula Luca = new Pelicula("Luca","Dibujo animado", 2, 2021, "Enrico Casarosa");
        Pelicula Cars = new Pelicula("Cars", "Infantil", 2, 2006, "John Lasseter");
        Pelicula Soul = new Pelicula("Soul", "Comedia", 2, 2020, "Pete Docter");
        Pelicula Avengers_Endgame = new Pelicula("Avengers Endgame", "Acción", 3, 2019, "Anthony Russo, Joe Russo");

        System.out.println("\n\t\t *** Eduardo Almachi *** \n");
        System.out.println("===== PELICULA 1 =====");
        Terminator.imprimirDatos();
        System.out.println("===== PELICULA 2 =====");
        Titanic.imprimirDatos();
        System.out.println("===== PELICULA 3 =====");
        ShuterIsland.imprimirDatos();
        System.out.println("===== PELICULA 4 =====");
        Interestellar.imprimirDatos();

        System.out.println("\n\t\t *** Gilmar Morales *** \n");
        System.out.println("===== PELICULA 1 =====");
        La_La_Land.imprimirDatos();
        System.out.println("===== PELICULA 2 =====");
        El_Padrino.imprimirDatos();
        System.out.println("===== PELICULA 3 =====");
        El_Caballero_de_la_Noche.imprimirDatos();
        System.out.println("===== PELICULA 4 =====");
        El_Señor_de_los_Anillos.imprimirDatos();

        System.out.println("\n\t\t *** Paul Hidalgo *** \n");
        System.out.println("===== PELICULA 1 =====");
        Luca.imprimirDatos();
        System.out.println("===== PELICULA 2 =====");
        Cars.imprimirDatos();
        System.out.println("===== PELICULA 3 =====");
        Soul.imprimirDatos();
        System.out.println("===== PELICULA 4 =====");
        Avengers_Endgame.imprimirDatos();
    }
}