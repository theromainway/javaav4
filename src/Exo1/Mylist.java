package Exo1;

public class Mylist {

    private Cell premier;
    private static int SIZE;

    public Mylist(Cell premier) {
        this.premier = premier;
    }

    public Mylist() {
    }

    public void add(String s) {
        Cell newFirst = new Cell(s);
        Cell oldFirst = null;

        oldFirst = premier;

        if (premier != null)
            newFirst.setProchain(oldFirst);

        premier = newFirst;
        ++SIZE;
    }

    public int size() {
    	
        return SIZE;
    }

    public String toString() {
        Cell c = premier;
        StringBuilder sb = new StringBuilder();
        while (c != null) {
            sb.append(c.getString() + ", ");
            c = c.getProchain();
        }
        return sb.toString();
    }

    public void addLast(String s) {
        Cell nouv = new Cell(s);
        Cell last = null;

        if (premier == null) {
            premier = nouv;
            return;
        }

        last = premier;

        while (last != null) {
            if (last.getProchain() == null)
                break;
            last = last.getProchain();

        }

        last.setProchain(nouv);
        ++SIZE;
    }

    public void add(String s, int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();

        Cell c = premier;

        for (int k = 0; k < size() && c != null; ++k) {
            if (k == i) {
                c.setProchain(new Cell(s));
            }
            c = c.getProchain();
        }
        ++SIZE;
    }

    public String get(int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();
        Cell c = premier;

        for (int k = 0; k < size(); ++k) {
            c = c.getProchain();
            if (i == k)
                return c.getString();
        }

        return "";
    }

    public int sumLetters() {
        int sum = 0;
        Cell c = premier;

        while (c != null) {
            sum += c.getString().length();
            c = c.getProchain();
        }

        return sum;
    }

}
