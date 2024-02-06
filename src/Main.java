import javax.swing.*;
// Importa la clase JFrame del paquete javax.swing

public class Main {
    //Clase principal.
    public static void main(String[] args) {
        // Método principal.
        SwingUtilities.invokeLater(new Runnable() {
            // Manejar la creación de la interfaz de Ingreso.
            @Override
            public void run() {
                // Define lo que se ejecutará en el hilo de eventos de Swing.
                Ingreso frame = new Ingreso();
                // Crea una nueva instancia del objeto Ingreso.
                frame.setSize(350, 450);
                // Establece el tamaño de la ventana.
                frame.setLocationRelativeTo(null);
                // Establece la posición de la ventana en el centro de la pantalla.
                frame.setVisible(true);
                // Hace que la ventana sea visible para el usuario.

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // Establece el comportamiento de cierre de la ventana al hacer clic en el botón de cerrar (X),
                // que en este caso terminará el programa.

            }
        });

    }
    // Fin del método main.

    public static double saldo = 200;
    // Declara una variable estática llamada saldo y le asigna el valor inicial de 200.
}
