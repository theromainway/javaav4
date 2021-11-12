package Exo2;

public class Cell<T> {

    private T value;
    private Cell<T> Prochain;

    public Cell(T value) {
        this.value = value;
        this.Prochain = null;
    }

    public T getValue() {
        return value;
    }

    public Cell<T> getProchain() {
        return Prochain;
    }

    public void setProchain(Cell<T> Prochain) {
        this.Prochain = Prochain;
    }

}
