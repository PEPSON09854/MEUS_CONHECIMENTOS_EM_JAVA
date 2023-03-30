package one.digitalinovation;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("conteudo00");
        System.out.println(listaCircular + "\n");

        listaCircular.remove(0);
        System.out.println(listaCircular + "\n");

        listaCircular.add("conteudo01");
        listaCircular.add("conteudo02");
        listaCircular.add("conteudo03");
        System.out.println(listaCircular + "\n");

        // a lista vai dando a volta a cada busca de um novo index
        System.out.println(listaCircular.get(0));
        System.out.println(listaCircular.get(1));
        System.out.println(listaCircular.get(2));
        System.out.println(listaCircular.get(3));
        System.out.println(listaCircular.get(4));
        System.out.println(listaCircular.get(5));
        System.out.println(listaCircular.get(6) + "\n");

        /*
         * podemos ver melhor o conceito de lista circular funcionando com um laço de
         * repetição
         */
        for (int i = 0; i <= 20; i++) {
            System.out.println(listaCircular.get(i));

        }

    }
}
