import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso extends JFrame{
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
        super("Bienvenido al Banco del Búho");
        setContentPane(panel1);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "1";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "2";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }

        });


        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "3";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });


        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "4";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });


        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "5";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });


        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "6";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "7";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });


        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "8";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });


        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "9";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");

                }
            }
        });


        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre1 = passwordField1.getText();
                    String nombre2 = "0";
                    String resultado = nombre1 + nombre2;
                    int numero3 = Integer.parseInt(resultado);
                    passwordField1.setText(resultado);
                    textField1.setText(resultado);

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese correctamente los datos.");
                    passwordField1.setText("");
                    textField1.setText("");


                }
            }
        });


        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contraseñaCorrecta = "123";
                char[] contraseñaIngresada = passwordField1.getPassword();

                if (contraseñaCorrecta.equals(new String(contraseñaIngresada))) {
                    Menu opera = new Menu();
                    opera.setSize(350, 450);
                    opera.setLocationRelativeTo(null);
                    opera.setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta. Intente de nuevo");
                    passwordField1.setText("");
                    textField1.setText("");
                }


            }
        });


        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField1.setText("");
                textField1.setText("");

            }
        });

        setLocationRelativeTo(null);
    }

}

