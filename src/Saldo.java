import javax.swing.*;
// Importa la clase JFrame del paquete javax.swing

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Importa las clases necesarias para manejar eventos de acción en la interfaz gráfica.


public class Saldo extends JFrame{
    // Declaración de la clase Saldo que hereda de JFrame.


    // Declaración de los componentes de la interfaz.
    private JPanel panel3;
    private JButton menúButton;
    private JLabel lb1;


    public Saldo() {
        // Constructor de la clase Saldo.

        super("Saldo");
        //Llama al constructor de la clase padre JFrame con un título.

        setContentPane(panel3);
        // Establece el panel principal de la ventana.

        setUndecorated(true);
        // Establece la ventana sin decoraciones (borde, maximizar, minimizar, cerrar).


        lb1.setText(String.valueOf(Main.saldo));
        // Establece el texto del JLabel lb1 con el saldo actual, accediendo a la variable "saldo" de la clase Main.



        // Agrega un ActionListener al botón "menú" para volver al menú primcipal.
        menúButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Menu opera = new Menu();
                opera.setSize(350, 450);
                opera.setLocationRelativeTo(null);
                opera.setVisible(true);
                dispose();
            }
        });
        setLocationRelativeTo(null);
        //Centra la ventana.
    }
}
