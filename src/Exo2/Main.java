package Exo2;

public class Main {

    public static void main(String[] args) {
        Mylist<Object> m = new Mylist<Object>();

        Object tatu = new Object();
        Object toto = new Object();
        Object titi = new Object();
        Object tutu = new Object();

        m.addLast(tatu);
        m.add(toto);
        m.add(titi);
        m.addLast(tutu);
        m.addLast(124);
        System.out.println(m.toString());

        System.out.println(m.size());
        System.out.println("List contains titi : " + m.contains(titi));
        System.out.println("Sumletters : " + m.sumLetters());
    }

}