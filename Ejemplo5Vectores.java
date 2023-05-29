import java.util.Scanner;
public class Ejemplo5Vectores {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int vector[] = new int[10];
        for(int i = 0; i < 10; i ++){
            System.out.println("Ingrese numero " + i + " :");
            vector[i] = s.nextInt();

        }
        System.out.print("Valores del vector: ");
        for(int i = 0; i < 10; i ++){
             System.out.println("Indice " + i + ": " + vector[i]);
        }
    }
}
