package one.digitalinovation;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> listaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        listaDuplamenteEncadeada.add("elemento1");
        listaDuplamenteEncadeada.add("elemento2");
        listaDuplamenteEncadeada.add("elemento3");
        listaDuplamenteEncadeada.add("elemento4");
        listaDuplamenteEncadeada.add("elemento5");
        listaDuplamenteEncadeada.add("elemento6");
        listaDuplamenteEncadeada.add("elemento7");

        System.out.println(listaDuplamenteEncadeada + "\n");

        listaDuplamenteEncadeada.remove(3);
        System.out.println(listaDuplamenteEncadeada + "\n");

        listaDuplamenteEncadeada.add(3, "99");
        System.out.println(listaDuplamenteEncadeada + "\n");

    }

}
