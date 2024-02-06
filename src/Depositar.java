import javax.swing.*;
// Importa la clase JFrame del paquete javax.swing

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Importa las clases necesarias para manejar eventos de acción en la interfaz gráfica.


// Declaración de la clase Depositar que hereda de JFrame.
public class Depositar extends JFrame{

    // Declaración de los componentes de la interfaz.
    private JPanel panel5;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton limpiarButton;
    private JButton ENTERButton;
    private JButton menúButton;
    private JLabel lb1;






    public Depositar() {
        //Constructor de la clase Depositar.

        super("Deposito");
        //Llama al constructor de la clase padre JFrame con un título.

        setContentPane(panel5);
        //Establece el panel principal de la ventana.

        setUndecorated(true);
        // Establece la ventana sin decoraciones (borde, maximizar, minimizar, cerrar).


        // Agrega un ActionListener al botón "1" para añadir el dígito "1" al campo de texto.
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "1";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);


                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "2" para añadir el dígito "2" al campo de texto.
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "2";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }

        });

        // Agrega un ActionListener al botón "3" para añadir el dígito "3" al campo de texto.
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "3";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "4" para añadir el dígito "4" al campo de texto.
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "4";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "5" para añadir el dígito "5" al campo de texto.
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "5";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "6" para añadir el dígito "6" al campo de texto.
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "6";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "7" para añadir el dígito "7" al campo de texto.
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "7";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "8" para añadir el dígito "8" al campo de texto.
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "8";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        // Agrega un ActionListener al botón "9" para añadir el dígito "9" al campo de texto.
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "9";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        // Agrega un ActionListener al botón "0" para añadir el dígito "0" al campo de texto.
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "0";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                    //Manejo posibles errores y limpia los campos en caso de error.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        // Agrega un ActionListener al botón "limpiar" para borrar el campo de texto.
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");

            }
        });

        // Agrega un ActionListener al botón "ENTER" para agrega el valor del campo texto al saldo y imprime un mensaje.
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String numero1 = textField1.getText();

                    double numero2 = Double.parseDouble(numero1);

                    Main.saldo += numero2;
                    lb1.setText("Se ha depositado $" + numero2 + " con éxito. Nuevo saldo: $" + Main.saldo);


                    //Si no, muestra un mensaje de error y limpia el campo texto.
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }


            }
        });

        // Agrega un ActionListener al botón "menú" para volver al menú primcipal.
        menúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu opera = new Menu();
                opera.setSize(350, 450);
                opera.setLocationRelativeTo(null);
                opera.setVisible(true);
                dispose();
                //Cierra la ventana actual.
            }
        });
        setLocationRelativeTo(null);
        //Centra la ventana.



    }




}
