package Herencias;

public class Ordenador {

    private String cpu;
    private int room;
    private String board;

    public Ordenador(String cpu, int room, String board) {
        this.cpu = cpu;
        this.room = room;
        this.board = board;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRoom() {
        return room;
    }

    public String getBoard() {
        return board;
    }
    
    

}
