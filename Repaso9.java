import funciones.*;
public class Repaso9 {
    public static void main(String[] args){
        int[] numero = new int[10];
        int max = 0;
        int min = 101;
        int opcion;
            for (int i = 0; i < numero.length; i++){
                numero[i] = (int)(Math.random()*501);
                if(numero[i]> max){
                    max = numero[i];
                }else if (numero[i] < min){
                    min = numero[i];
            }
            System.out.println(numero[i]+ " ");
        
        } 
        System.out.println("Que desea destacar? (1:minimo 2:maximo)");
        opcion = Integer.parseInt(System.console().readLine());
        System.out.println();
        switch (opcion){
            case 1:
                Imprimir.imprime(numero, min);
                break;
            case 2:
                Imprimir.imprime(numero, max);
                break;
            default:
                System.out.println("Opcion Incorrecta");
                
        }
        System.out.println();
    }
    
}
