package Ejercicio2;
import Ejercicio1.TipoTV; // importo esta clase para no volver a hacerla

import Ejercicio1.TipoTV;

public class Tv {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private TipoTV tipoTV;

    private int tamanioIn;
    private String resolucion;
    private boolean smart;

    // NUEVO
    private PantallaCompartida pantallaCompartida;

    // constructor
    public Tv(String marca, String modelo, int anioFabricacion, TipoTV tipoTV, int tamanioIn, String resolucion, boolean smart, PantallaCompartida pantallaCompartida) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        tipoTV = tipoTV;
        this.tamanioIn = tamanioIn;
        this.resolucion = resolucion;
        this.smart = smart;
        // NUEVO
        this.pantallaCompartida = pantallaCompartida;
    }

    // metodos
    public void mostrarValores(){
        // convierto el booleano en texto
        String esSmart;
        if (smart) {
            esSmart = "Smart";
        } else {
            esSmart = "NoSmart";
        }

        // convierto el tipo tv en texto
        String textoTipoTV;
        if (tipoTV == TipoTV.P) {
            textoTipoTV = "Plasma";
        } else if (tipoTV == tipoTV.L) {
            textoTipoTV = "LCD";
        } else {
            textoTipoTV = "OLED";
        }

        // imprimo según consigna
        System.out.println(marca + " " + modelo + " " + anioFabricacion + " " + textoTipoTV + " -- " + tamanioIn + " pulgadas -- " + resolucion + " " + esSmart);
        System.out.println(pantallaCompartida.toString()); // el to string me trae el to string que cree en la clase anterior
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public TipoTV getTipoTV() {
        return tipoTV;
    }

    public int getTamanioIn() {
        return tamanioIn;
    }

    public String getResolucion() {
        return resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setTipoTV(TipoTV tipoTV) {
        tipoTV = tipoTV;
    }

    public void setTamanioIn(int tamanioIn) {
        this.tamanioIn = tamanioIn;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    // toString
    @Override
    public String toString() {
        return "Tv{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", TipoTV=" + tipoTV +
                ", tamanioIn=" + tamanioIn +
                ", resolucion='" + resolucion + '\'' +
                ", smart=" + smart +
                '}';
    }
}
