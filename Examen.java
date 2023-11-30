import java.util.Scanner;
import funciones.Menu;
public class Examen { public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        boolean flag = true;
        int numero;
        int acumulador = 0;
        String Nl;
        int temporal = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese los numeros que desea cargar");
            array[i] = s.nextInt();
            }
        
            //acumulador = acumulador + numero;
        
        do{
            funciones.Menu.MenuPrincipal();
            Nl = s.nextLine();
            switch (Nl){
                case "1":
                    System.out.println("El promedio de los numeros ingresados es: " + promedio(array));
                    break;
                case "2":
                    System.out.println("La suma de todos los numeros ingresados es: " + suma(array));
                    break;
                case "3":
                    ordenaA(array);
                    break;
                case "4":
                    ordenaD(array);
                    break;
                case "5":
                    flag = false;
                    break;
            }
            System.out.println("Adios");
        }while(flag);
    }

    static double promedio(int[] array){
        int acumulador = 0;
        for(int i = 0; i < array.length; i++){
            acumulador = acumulador + array[i];
        } 
        return acumulador / array.length;
    }

    static int suma(int[] array){
        int acumulador = 0;
        for(int i = 0; i < array.length; i++){
            acumulador = acumulador + array[i];
        }
        return acumulador;
    }
    static void ordenaA(int[] array){
        int temporal;
        for(int i = 0; i < array.length - 1; i++){//Buccle para acceder a los elementos del array
            for(int j = 0; j < array.length - i - 1; j++){//Bucle para comparar los elementos adyacentes
                if(array[j] > array[j + 1]){//cambiar > a < para ordenar de mayor a menor
                    temporal = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temporal;
                }
            }
        }

        System.out.println("Array Ordenado:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    static void ordenaD(int[] array){
        int temporal;
        for(int i = 0; i < array.length - 1; i++){//Buccle para acceder a los elementos del array
            for(int j = 0; j < array.length - i - 1; j++){//Bucle para comparar los elementos adyacentes
                if(array[j] < array[j + 1]){//cambiar > a < para ordenar de mayor a menor
                    temporal = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temporal;
                }
            }
        }

        System.out.println("Array Ordenado:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");        
    }
}
/*for(int i = 0; i < n - 1; i++){//Buccle para acceder a los elementos del array
            for(int j = 0; j < n - i - 1; j++){//Bucle para comparar los elementos adyacentes
                if(array[j] > array[j + 1]){//cambiar > a < para ordenar de mayor a menor
                    temporal = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temporal;
                }
            }
        }

        System.out.println("Array Ordenado:");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");*/
