import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retirar extends JFrame{
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
    private JButton ENTERButton;
    private JPanel panel4;
    private JLabel lb1;
    private JButton limpiarButton;
    private JButton menúButton;
    private JButton cerrarButton;
    private JButton maxButton;


    public Retirar() {
        super("Retiro");
        setContentPane(panel4);
        setUndecorated(true);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "1";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "2";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }

        });


        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "3";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "4";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "5";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "6";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "7";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "8";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "9";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });


        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = textField1.getText();
                    String nombre2 = "0";
                    String resultado = nombre1 + nombre2;
                    double numero3 = Double.parseDouble(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");

            }
        });


        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String numero1 = textField1.getText();

                    double numero2 = Double.parseDouble(numero1);

                    if (numero2 <= Main.saldo) {
                        Main.saldo -= numero2;
                        lb1.setText("Se ha retirado $" + numero2 + " con éxito. Saldo restante: $" + Main.saldo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                        textField1.setText("");
                    }

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    textField1.setText("");

                }

            }
        });


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



        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });


        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String max = String.valueOf(Main.saldo);
                textField1.setText(max);

            }
        });

        setLocationRelativeTo(null);

    }






}
