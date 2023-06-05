public class EjemploClase9Funciones {
    public static void main (String[] args){
        String palabra;
        int num1;
        int num2;
        System.out.println("Ingrese un numero");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese otro numero");
        num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese una palabra");
        palabra = System.console().readLine();
        SumaDosNumeros(num1, num2, palabra);
    }
    public static int SumaDosNumeros(int a, int b, String c){
        int resultadoFuncion;
        resultadoFuncion = a + b;
        System.out.println("La palabra ingresada fue: " + c);
        return resultadoFuncion;
    }

}
