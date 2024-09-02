package Ejercicio1;

public class Main {
    public static void main(String arg[]){ // NO OLVIDARSE DE ESTA LÍNEA

    Tv tv1 = new Tv("Samsung", "pro", 24, TipoTV.P, 42, "4k", true);
    Tv tv2 = new Tv("Lenovo", "max", 18, TipoTV.O, 50, "1080p", false);

    System.out.println("TV 1");
    tv1.mostrarValores();

    System.out.println("");

    System.out.println("TV 2");
    tv2.mostrarValores();
    }
}
