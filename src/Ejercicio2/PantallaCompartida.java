package Ejercicio2;

public class PantallaCompartida {
    private String color;
    private int tamanioIn;

    // constructor
    public PantallaCompartida(String color, int tamanioIn) {
        this.color = color;
        this.tamanioIn = tamanioIn;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanioIn() {
        return tamanioIn;
    }

    public void setTamanioIn(int tamanioIn) {
        this.tamanioIn = tamanioIn;
    }

    // ToString
    @Override
    public String toString() {
        return "PantallaCompartida{" +
                "color='" + color + '\'' +
                ", tamanioIn=" + tamanioIn +
                '}';
    }
}
