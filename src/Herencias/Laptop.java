package Herencias;

public class Laptop extends Ordenador {

    private String gama;
    private String marca;
    private int precio;
    //private int descuento;
    //private int preciofinal;

    public Laptop(String cpu, int room, String board, String gama, String marca, int precio) {
        super(cpu, room, board);

        this.gama = gama;
        this.marca = marca;
        this.precio = precio;
        //this.descuento = descuento;
        //this.preciofinal = precio - descuento;
    }
    
        public void mostrarDatos() {
        System.out.println("Cpu: " + getCpu()
                + "\nRoom: " + getRoom()
                + "\nMother Board: " + getBoard()
                + "\nGama: " + gama
                + "\nMarca " + marca
                + "\nPrecio " + precio);
        
    }

}



