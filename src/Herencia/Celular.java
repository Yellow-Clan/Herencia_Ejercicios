package Herencia;

public class Celular {

    private String marca;
    private String modelo;
    private String tamaño;

    public Celular(String marca, String modelo, String tamaño) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamaño() {
        return tamaño;
    }

}
