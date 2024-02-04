import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depósitoRadioButton;
    private JRadioButton salirRadioButton;
    private JPanel panel2;

    public Menu() {
        super("Transacción a realizar");
        setContentPane(panel2);

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(verSaldoRadioButton);
        grupoBotones.add(retiroRadioButton);
        grupoBotones.add(depósitoRadioButton);
        grupoBotones.add(salirRadioButton);



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
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Muchas gracias");
                dispose();
                System.exit(0);
            }
        });
        setLocationRelativeTo(null);
    }
}
