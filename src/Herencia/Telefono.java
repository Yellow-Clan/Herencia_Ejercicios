package Herencia;

public class Telefono extends Celular {

    private int ram;
    private int rom;
    private float precio;

    public Telefono(String marca, String modelo, String tamaño, int ram, int rom, float precio) {
        super(marca, modelo, tamaño);
        this.ram = ram;
        this.rom = rom;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nTamaño: " + getTamaño()
                + "\nRam: " + ram
                + "\nRom: " + rom
                + "\nPrecio: " + precio);

    }
}
