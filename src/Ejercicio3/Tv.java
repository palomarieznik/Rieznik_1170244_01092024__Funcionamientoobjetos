package Ejercicio3;
import Ejercicio1.TipoTV; // importo esta clase para no volver a hacerla
import Ejercicio2.PantallaCompartida;

public class Tv {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private TipoTV tipoTV;

    private int tamanioIn;
    private String resolucion;
    private boolean smart;

    private PantallaCompartida pantallaCompartida;

    // NUEVO - se asigna estado por defecto apagado
    private EstadoTV estadoTV = EstadoTV.OFF;

    // constructor (el estado no está agregado ya que por defecto es off)
    public Tv(String marca, String modelo, int anioFabricacion, TipoTV tipoTV, int tamanioIn, String resolucion, boolean smart, PantallaCompartida pantallaCompartida) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        tipoTV = tipoTV;
        this.tamanioIn = tamanioIn;
        this.resolucion = resolucion;
        this.smart = smart;
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

    public void apagarTV(){
        if (estadoTV == EstadoTV.ON) {
            estadoTV = EstadoTV.OFF;
        }
        System.out.println("Apagaste la TV");
    }

    public void encenderTV(){
        if (estadoTV == EstadoTV.OFF) {
            estadoTV = EstadoTV.ON;
        }
        System.out.println("Prendiste la TV ");
    }

    // getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public TipoTV getTipoTV() {
        return tipoTV;
    }

    public void setTipoTV(TipoTV tipoTV) {
        this.tipoTV = tipoTV;
    }

    public int getTamanioIn() {
        return tamanioIn;
    }

    public void setTamanioIn(int tamanioIn) {
        this.tamanioIn = tamanioIn;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public PantallaCompartida getPantallaCompartida() {
        return pantallaCompartida;
    }

    public void setPantallaCompartida(PantallaCompartida pantallaCompartida) {
        this.pantallaCompartida = pantallaCompartida;
    }

    public EstadoTV getEstadoTV() {
        return estadoTV;
    }

    public void setEstadoTV(EstadoTV estadoTV) {
        this.estadoTV = estadoTV;
    }

    // toString

    @Override
    public String toString() {
        return "estadoTV=" + estadoTV;
    }
}
