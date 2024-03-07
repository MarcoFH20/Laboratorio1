
package CalculadoraVista;

import java.util.Scanner;


public class CalculadoraVista {
    // Vista

    public void mostrarMenu() {
        System.out.println("Calculadora Simple");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

    public double[] obtenerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        return new double[]{opcion, num1, num2};
    }

    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}

