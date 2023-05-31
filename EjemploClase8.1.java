public class EjemploClase8 {
    
    public static void main(String[] args){
        int[] array = {-2, 45 ,0, 11, -9};
        int n = array.length;
        int tmp;
        System.out.println("Array desordenada");
        for(int i = 0; i < n; i ++){
            System.out.println(array[i] + " " );
        }
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n - i - 1 ; j ++){
                if (array[j] > array[j + 1]){
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
                
            }
        }
        System.out.println("Array ordenado");
        for(int i = 0; i < n; i ++){
            System.out.println(array[i] + " " );
        }
    }
}
