import java.util.Scanner;



public class Ejemplo3 {
 
    public static void main (String[] args){
        boolean flag = true;
        int numeroIngresado;
        int acumulador = 0;

        do(
            System.out.print("Ingrese numero");
            numeroIngresado = Integer.parseInt(System.console().readLine());
            acumulador = acumulador + numeroIngresado;
            
            System.out.println("Desea continuar ingresando numeros? ");
            System.out.println("-1 para salir");
            if(Integer.console().readLine() == -1){

                
                System.out.println("Flag cambiado");
                flag = false;
        }
        while(flag);
        System.out.println(acumulador);
    }

}
