package Ejercicio1;

public class Tv {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private TipoTV tipoTV;

    private int tamanioIn;
    private String resolucion;
    private boolean smart;

    // constructor
    public Tv(String marca, String modelo, int anioFabricacion, Ejercicio1.TipoTV tipoTV, int tamanioIn, String resolucion, boolean smart) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        tipoTV = tipoTV;
        this.tamanioIn = tamanioIn;
        this.resolucion = resolucion;
        this.smart = smart;
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

    public Ejercicio1.TipoTV getTipoTV() {
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

    public void setTipoTV(Ejercicio1.TipoTV tipoTV) {
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
