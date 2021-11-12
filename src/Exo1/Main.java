package Exo1;

public class Main {

    public static void main(String[] args) {
        Mylist m = new Mylist();

        m.addLast("tatu");
        m.add("toto");
        m.add("titi");
        m.addLast("tutu");
        System.out.println(m.toString());

        System.out.println(m.size());
        System.out.println("Sumletters : " + m.sumLetters());
    }

}