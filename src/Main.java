public class Main {

    public static void main(String[] args) {

        int numeros[] = {2,6,1,0,4,7};

        for(int i=0; i<numeros.length;i++){
            numeros[i]++;
        }

        //Não reflete no array
        for(int i : numeros){
            i++;
        }

        for(int i: numeros){
            System.out.println(i);
        }

    }

}
