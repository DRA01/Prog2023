public class Clase7Ejercicio1 {
    public static void main(String[] args){
        int i;
        int vectorTemp[] = new int[12];
        int vectorHum[] = new int[12];
        int acumuladorTemp = 0;
        int acumuladorHum = 0;
        double temProm = 8.1;
        int humProm = 72;
        int numMenor = 100; 
        int numMayor = 0;
        int acumuladorTemp1 = acumuladorTemp / 12;
        int temProm1 = (int) (acumuladorTemp1 - temProm);
        int temProm2 = (int) (temProm - acumuladorTemp1);
        for(i = 0; i < 12; i ++){
            System.out.println("Ingrese promedio de temperatura del mes ");
            vectorTemp[i] =Integer.parseInt(System.console().readLine());
            acumuladorTemp = acumuladorTemp + vectorTemp[i];
            System.out.println("Ingrese promedio de humedad del mes ");
            vectorHum[i] =Integer.parseInt(System.console().readLine());
            acumuladorHum = acumuladorHum + vectorHum[i];
        }
        System.out.println("\033[37mEl promedio de temperatura del 2020 es: " + (acumuladorTemp / 12) + " grados centigrados");
        System.out.println("El promedio de humedad del 2020 es: " + (acumuladorHum / 12));

        if(acumuladorTemp1 > temProm){
            System.out.println("\033[30mLa temperatura promedio del 2020 es mayor a la temperatura promedio historica por: " + temProm1 + " grados centigrados");
        }else{
            System.out.println("La temperatura promedio del 2020 es menor a la temperatura promedio historica por: " + temProm2 + " grados centigrados" );
        }   
        for(i = 0; i < 12 ; i ++){
            if(vectorHum[i] < numMenor){
                numMenor = vectorHum[i];
                
            }if(vectorTemp[i] > numMayor){
                numMayor = vectorTemp[i];
            }
        }
        System.out.println("\033[35mel promedio de humedad en el mes mas seco es: " + numMenor);
        System.out.println("el promedio de temperatura en el mes mas caluroso es: " + numMayor);
    }
}
// un grupo de cienticificos esta realizando un estudio del clima en bariloche durante el año 2020.
// se sabe que la temperatura promedio de esta ciudad es de 8.1 grados centigrados y la humedad promedio es del 72%, ambas variables
// analizadas con informacion de años anteriores.
// los cientificos le piden que realice un programa que le permita el ingreso de la temperatura promedio y humedad promedio de cada
// mes y luego devuelva la sig informacion: 1) temperatura promedio del 2020. 2)Humedad promedio del 2020. 3)indicar si la temperatura
// promedio durante el 2020 fue distinta a los registros historicos. es decir indicar si fue mayor o menor al promedio historico
// e indicar por cuantos grados. 4) indicar el promedio de humedad en el mes mas seco 5) indicar el promedio de temperatura
// en el mes mas caluroso