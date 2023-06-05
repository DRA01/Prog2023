import java.util.Scanner;

public class EjemploClase1  {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in){
        int num1;
        int num2;
        boolean flag;
        num1 = s.nextInt();
        num2 = s.nextInt();
        System.out.println("Ingrese 2 numeros separados por un espacio \n");
        if(num1 > num2){
       
            flag = true;
        }else if(num1 < num2){
            System.out.println(num1 + " no es mayor a " + num2);

        }else{
            System.out.println(num1 + " es igual a " + num2);
        }
        }    
    }
}