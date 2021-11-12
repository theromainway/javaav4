package Exo1;

public class Cell {

    private String s;
    private Cell prochain;

    public Cell(String s) {
        this.s = s;
        this.prochain = null;
    }

    public String getString() {
        return s;
    }

    public Cell getProchain() {
        return prochain;
    }

    public void setProchain(Cell prochain) {
        this.prochain = prochain;
    }

}
