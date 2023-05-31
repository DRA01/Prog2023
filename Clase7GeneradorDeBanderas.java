import java.util.Scanner;
public class Clase7GeneradorDeBanderas {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] color = {"\033[31m████████████" , "\033[33m████████████" , "\033[34m████████████" , "\033[37m████████████" , "\033[94m████████████" , "\033[30m████████████"};
        int franjas;
        System.out.println("Generador de banderas");
        System.out.println("¿Cuantas franjas tiene la bandera? ");
        franjas = s.nextInt();
        System.out.println("--------------------------");
        for(int i = 0; i < franjas ; i ++){
            System.out.println(color[(int)(Math.random()* 6 )]);
        }
        System.out.println("--------------------------");
    }
}
