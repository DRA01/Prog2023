public class EjemploClase10Repaso5 {
    public static void main(String[] args){
/*pedirle al usuario 3 valores correspondientes a los lados 
 de un triangulo, el programa debe mostrar un mensaje indicando que tipo de triangulo
 es: equilatero (3 lados iguales) isosceles (2 lados iguales)
 escaleno (todos sus lados desiguales)
*/
        double lado1;
        double lado2;
        double lado3;

        System.out.println("Ingrese los tres valores de los lados del triangulo");
        lado1 = Double.parseDouble(System.console().readLine());
        lado2 = Double.parseDouble(System.console().readLine());
        lado3 = Double.parseDouble(System.console().readLine());
        if((lado1 == lado2) & (lado2 == lado3) & (lado1 == lado3)){
            System.out.println("Sus 3 lados son iguales, esto es un triangulo equilatero");
        }else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
            System.out.println("Tiene 2 lados iguales, esto es un triangulo Isosceles");

        }else{
            System.out.println("Sus lados son todos desiguales, esto es un triangulo escaleno");
        }
    }
}
