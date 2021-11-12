package Exo2;

public class Mylist<T> {

    private Cell<T> Premier;
    private static int SIZE;

    public Mylist(Cell<T> Premier) {
        this.Premier = Premier;
    }

    public Mylist() {
    }

    public void add(T value) {
        Cell<T> newPremier = new Cell<T>(value);
        Cell<T> oldPremier = null;

        oldPremier = Premier;

        if (Premier != null)
            newPremier.setProchain(oldPremier);

        Premier = newPremier;
        ++SIZE;
    }

    public int size() {
        return SIZE;
    }

    public String toString() {
        Cell<T> c = Premier;
        StringBuilder sb = new StringBuilder();
        while (c != null) {
            sb.append(c.getValue() + ", ");
            c = c.getProchain();
        }
        // s = s.substring(0, s.length() - 2);
        return sb.toString();
    }

    public void addLast(T value) {
        Cell<T> nouv = new Cell<T>(value);
        Cell<T> last = null;

        if (Premier == null) {
            Premier = nouv;
            return;
        }

        last = Premier;

        while (last != null) {
            if (last.getProchain() == null)
                break;
            last = last.getProchain();

        }

        last.setProchain(nouv);
        ++SIZE;
    }

    public void add(T value, int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();

        Cell<T> c = Premier;

        for (int k = 0; k < size() && c != null; ++k) {
            if (k == i) {
                c.setProchain(new Cell<T>(value));
            }
            c = c.getProchain();
        }
        ++SIZE;
    }

    public Object get(int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();
        Cell<T> c = Premier;

        for (int k = 0; k < size(); ++k) {
            c = c.getProchain();
            if (i == k)
                return c.getValue();
        }

        return "";
    }

    public int sumLetters() {
        int sum = 0;
        Cell<T> c = Premier;

        while (c != null) {
            sum += c.getValue().toString().length();
            c = c.getProchain();
        }

        return sum;
    }

    public boolean contains(T value) {
        Cell<T> c = Premier;

        while (c != null) {
            if (c.getValue().equals(value))
                return true;
            c = c.getProchain();
        }

        return false;
    }

}