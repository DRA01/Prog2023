public class EjemploClase9Matrices {
    //Esta es la funcion principal
    public static void main(String[] args){
        int[][] matrizNull = new int[3][3];
        //int[][] matrizNoNull = {{1,2,3},{4,5,6},{7,8,9}};
        int num1;
        int num2;
       
        for(int i = 0; i < 3 ; i ++){//inicializacion de la matriz           
            for(int j = 0; j < 3; j ++){
                matrizNull[i][j] = (int)(Math.random()*10);
                System.out.println(matrizNull[i][j]);
            }
        }
        System.out.println("Ingrese un numero");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese otro numero");
        num2 = Integer.parseInt(System.console().readLine());
        
        System.out.println(SumaDosNumeros(num1, num2));

        HolaMundo();
    }




    //Aca comienza la declaracion de funciones 
    public static void HolaMundo(){
        System.out.println("hola mundo");
    }
    public static int SumaDosNumeros(int a, int b){
        
        return a + b;

    }
}
