import javax.swing.*;
// Importa la clase JFrame del paquete javax.swing

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Importa las clases necesarias para manejar eventos de acción en la interfaz gráfica.


import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
// Importa las clases necesarias para manejar eventos relacionados con cambios en el campos de texto en la interfaz.

public class Ingreso extends JFrame{
    // Declaración de la clase Ingreso que hereda de JFrame.


    // Declaración de los componentes de la interfaz.
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton ENTERButton;
    private JButton a9Button;
    private JButton a0Button;
    private JButton limpiarButton;

    public Ingreso() {
        // Constructor de la clase Ingreso.


        super("Bienvenido al Banco del Búho");
        // Llama al constructor de la clase padre JFrame con un título.

        setContentPane(panel1);
        // Establece el panel principal de la ventana.

        setUndecorated(true);
        // Establece la ventana sin decoraciones (borde, maximizar, minimizar, cerrar).




        // Agrega un "escuchador" de eventos al campo de contraseña.
        passwordField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTextField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTextField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTextField();
            }
        });


        // Agrega un ActionListener al botón "1" para añadir el dígito "1" al campo de contraseña.
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "1";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);



                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "2" para añadir el dígito "2" al campo de contraseña.
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "2";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }

        });

        // Agrega un ActionListener al botón "3" para añadir el dígito "3" al campo de contraseña.
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "3";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "4" para añadir el dígito "4" al campo de contraseña.
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "4";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "5" para añadir el dígito "5" al campo de contraseña.
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "5";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "6" para añadir el dígito "6" al campo de contraseña.
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "6";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "7" para añadir el dígito "7" al campo de contraseña.
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "7";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "8" para añadir el dígito "8" al campo de contraseña.
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "8";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "9" para añadir el dígito "9" al campo de contraseña.
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "9";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "0" para añadir el dígito "0" al campo de contraseña.
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "0";
                    String resultado = nombre1 + nombre2;
                    passwordField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");


                }
            }
        });


        // Agrega un ActionListener al botón "ENTER" para verificar la contraseña ingresada.
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contraseñaCorrecta = "kevin123";
                char[] contraseñaIngresada = passwordField1.getPassword();


                // Si es correcta, muestra un nuevo menú.
                if (contraseñaCorrecta.equals(new String(contraseñaIngresada))) {
                    Menu opera = new Menu();
                    opera.setSize(350, 450);
                    opera.setLocationRelativeTo(null);
                    opera.setVisible(true);
                    dispose();

                    //Si no, muestra un mensaje de error y limpia los campos.
                } else {
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta. Intente de nuevo");
                    passwordField1.setText("");
                    textField1.setText("");
                }


            }
        });

        // Agrega un ActionListener al botón "limpiar" para borrar los campos de contraseña y texto.
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField1.setText("");
                textField1.setText("");

            }
        });

        setLocationRelativeTo(null);
        // Centra la ventana.
    }

    // Método para actualizar el campo de texto con el contenido del campo de contraseña.
    private void updateTextField() {
        SwingUtilities.invokeLater(() -> {
            textField1.setText(new String(passwordField1.getPassword()));
        });
    }


}

