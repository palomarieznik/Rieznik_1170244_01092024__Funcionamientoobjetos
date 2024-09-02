package Ejercicio2;

import Ejercicio1.TipoTV;

public class Main {
    public static void main(String[] args) {
        // primero creo la pantalla que van a utilizar las dos tv
        PantallaCompartida pantallaCompartida = new PantallaCompartida("verde", 50);

        // creo las tvs, al final agrego la nueva pantalla
        Tv tv1 = new Tv("Samsung", "pro", 24, TipoTV.P, 42, "4k", true, pantallaCompartida);
        Tv tv2 = new Tv("Lenovo", "max", 18, TipoTV.O, 50, "1080p", false, pantallaCompartida);

        // print inicial
        System.out.println("\nValores Iniciales");
        System.out.println("\nTV 1");
        tv1.mostrarValores();
        System.out.println("\nTV 2");
        tv2.mostrarValores();

        // cambio de valores
        pantallaCompartida.setColor("rosa");
        pantallaCompartida.setTamanioIn(40);

        // print modificado
        System.out.println("\nValores Modificados");
        System.out.println("\nTV 1");
        tv1.mostrarValores();
        System.out.println("\nTV 2");
        tv2.mostrarValores();
    }
}