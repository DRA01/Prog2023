package funciones;

public class Imprimir {
    public static void imprime(int[] array, int valor){
        for(int i = 0; i <  array.length; i++){
            if(array[i] == valor){
                System.out.println("**" + array[i] + "**");
            }else{
                System.out.println(array[i] + " ");
            }
        }
    }
}
