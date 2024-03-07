
import CalculadoraControlador.CalculadoraControlador;
import CalculadoraModelo.CalculadoraModelo;
import CalculadoraVista.CalculadoraVista;







// Clase principal
public class Main {
    public static void main(String[] args) {
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);
        controlador.run();
    }
}
