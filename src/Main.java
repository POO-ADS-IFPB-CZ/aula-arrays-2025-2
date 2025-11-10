public class Main {

    public static void main(String[] args) {
        int array[] = {2,3,4,5};
        incrementar(array);
        for(int i:array) System.out.println(i);
    }

    public static void incrementar(int array[]){
        for(int i=0;i<array.length;i++){
            array[i]++;
        }
    }


}
