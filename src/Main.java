import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();

        //Collections.sort(palavras, comparador);
        palavras.sort(comparador);
        System.out.println(palavras);

/*        for (String p : palavras){
            System.out.println(p);
        }*/

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String> {
    @Override
    public void accept(String s){
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2){
        if(s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}