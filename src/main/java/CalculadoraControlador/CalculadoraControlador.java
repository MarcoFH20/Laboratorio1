
package CalculadoraControlador;

import CalculadoraModelo.CalculadoraModelo;
import CalculadoraVista.CalculadoraVista;



public class CalculadoraControlador {
    // Controlador

    private CalculadoraModelo modelo;
    private CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void run() {
        while (true) {
            vista.mostrarMenu();
            double[] input = vista.obtenerInput();
            int opcion = (int) input[0];
            double num1 = input[1];
            double num2 = input[2];
            
            double resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = modelo.sumar(num1, num2);
                    break;
                case 2:
                    resultado = modelo.restar(num1, num2);
                    break;
                case 3:
                    resultado = modelo.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = modelo.dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida");
                    continue;
            }
            vista.mostrarResultado(resultado);
        }
    }
}
    
    
