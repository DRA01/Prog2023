public class Repaso8{
    public static void main(String[] args){
        /*int[] numero = new int[10];
        for (int i = 0; i < numero.length; i++){
            numero[i] = (int)(Math.random()*100);
            System.out.println(numero[i]+ " ");
        } 
    int max = 0;
    int min = 101;

    for (int i = 0; i < numero.length; i++){
        if(numero[i]> max){
            max = numero[i];
        }else if (numero[i] < min){
            min = numero[i];
        }
    }
    System.out.println();
    System.out.println("El numero mayor es: " + max);
    System.out.println("El numero menor es: " + min);
    */

    int[] numero = new int[10];
    int max = 0;
    int min = 101;
        for (int i = 0; i < numero.length; i++){
            numero[i] = (int)(Math.random()*100);
            if(numero[i]> max){
                max = numero[i];
            }else if (numero[i] < min){
                min = numero[i];
            }
            System.out.println(numero[i]+ " ");
        
        } 
    System.out.println();
    System.out.println("El numero mayor es: " + max);
    System.out.println("El numero menor es: " + min);



    }
}