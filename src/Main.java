import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto(2, "Arroz", 4.5f),
                new Produto(1, "Feijão", 8.6f),
                new Produto(3, "Carne", 40f)
        };
        //Ordem natural
        System.out.println("Ordenado pela descrição");
        Arrays.sort(produtos);
        System.out.println(Arrays.toString(produtos));

        System.out.println("Ordenado pelo código");
        Arrays.sort(produtos, (o1, o2) -> o1.getCodigo()-o2.getCodigo());
        System.out.println(Arrays.toString(produtos));
    }
}