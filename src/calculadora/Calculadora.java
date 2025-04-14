package calculadora;

/*Es una calculadora sencilla de 5 operaciones aritmeticas sencillas
  Multiplicacion,suma,resta,division,resto*/

import java.util.Scanner;
public class Calculadora {
   
    public static void main(String[] args) {
        //Inicializar scanner
        Scanner scan = new Scanner(System.in);
        //Imprimir en el terminal
        System.out.println("Ingrese su primer numero:");
        double num1 = scan.nextDouble();
        System.out.println("Ingrese su segundo numero:");
        double num2 = scan.nextDouble();
        //Realizar operaciones 
        System.out.println("La suma es :" +(num1 + num2)); //Suma
        System.out.println("La resta es :" + (num1 - num2)); //Resta
        System.out.println("La multiplicacion es :" + (num1 * num2)); //Multiplicacion
        System.out.println("La division es :" + (num1 / num2)); //Division
        System.out.println("El resto es :" + (num1 % num2)); //Resto
    }
    
}
