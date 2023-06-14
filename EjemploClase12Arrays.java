public class EjemploClase12Arrays {
    public static void main (String[] args){
        String[] nombres = new String[5];
        int[][] notas = new int[5][3];
        int nota;
        for(int i = 0; i < 5; i++ ){
            System.out.println("Ingrese el nombre del alumno");
            nombres[i] = System.console().readLine();
            for(int j = 0; j < 3; j++){
                System.out.println("Ingrese la nota " + (j + 1));
                nota = Integer.parseInt(System.console().readLine());
                while(nota < 0 || nota > 10){
                    System.out.println("Nota invalida, debe estar entre 0 y 10");
                    System.out.println("Ingrese la nota " + (j + 1));
                    nota = Integer.parseInt(System.console().readLine());
                }
                notas[i][j] = nota;
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.print("Nombre: "+  nombres[i] + " ");
            for(int j = 0; j < 3; j++){
                System.out.printf("Nota%d: %d ",j + 1 , notas[i][j]);
            }
            System.out.println();
        }

    }
}
