import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        int numeros[] = {4,8,0,1,3,5,9,3};
        numeros = Arrays.copyOf(numeros, 20);
        System.out.println(Arrays.toString(numeros));

    }
}