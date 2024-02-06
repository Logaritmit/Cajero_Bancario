import javax.swing.*;
// Importa la clase JFrame del paquete javax.swing

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Importa las clases necesarias para manejar eventos de acción en la interfaz gráfica.

public class Menu extends JFrame{
    // Declaración de la clase Menu que hereda de JFrame.


    // Declaración de los componentes de la interfaz.
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depósitoRadioButton;
    private JRadioButton salirRadioButton;
    private JPanel panel2;

    public Menu() {
        // Constructor de la clase Menu.

        super("Transacción a realizar");
        // Llama al constructor de la clase padre JFrame con un título.

        setContentPane(panel2);
        // Establece el panel principal de la ventana.

        setUndecorated(true);
        // Establece la ventana sin decoraciones (borde, maximizar, minimizar, cerrar).


        ButtonGroup grupoBotones = new ButtonGroup();
        // Crea un grupo de botones para que solo uno pueda ser seleccionado a la vez.


        grupoBotones.add(verSaldoRadioButton);
        grupoBotones.add(retiroRadioButton);
        grupoBotones.add(depósitoRadioButton);
        grupoBotones.add(salirRadioButton);
        // Agrega los botones al grupo.



        // El botón "ver saldo" abre una nueva ventana para mostrar el saldo y cierra la ventana actual.
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo saldo1 = new Saldo();
                saldo1.setSize(350, 450);
                saldo1.setLocationRelativeTo(null);
                saldo1.setVisible(true);
                dispose();

            }
        });

        // El botón "retiro" abre una nueva ventana para realizar un retiro y cierra la ventana actual.
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retirar retirar1 = new Retirar();
                retirar1.setSize(350, 450);
                retirar1.setLocationRelativeTo(null);
                retirar1.setVisible(true);
                dispose();

            }
        });

        // El botón "depósito" abre una nueva ventana para realizar un depósito y cierra la ventana actual.
        depósitoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Depositar depositar1 = new Depositar();
                depositar1.setSize(350, 450);
                depositar1.setLocationRelativeTo(null);
                depositar1.setVisible(true);
                dispose();

            }
        });

        //El botón "salir" muestra un mensaje de despedida y cierra la aplicación.
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Muchas gracias");
                dispose();
                System.exit(0);
            }
        });

        setLocationRelativeTo(null);
        // Centra la ventana.

    }
}
