import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto(2, "Arroz", 4.5f),
                new Produto(1, "Feijão", 8.6f),
                new Produto(3, "Macarrão", 3.8f)
        };
        System.out.println(Arrays.toString(produtos));
    }
}