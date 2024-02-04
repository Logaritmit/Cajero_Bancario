import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame{
    private JPanel panel3;
    private JButton menúButton;
    private JLabel lb1;


    public Saldo() {
        super("Saldo");
        setContentPane(panel3);
        setUndecorated(true);

        lb1.setText(String.valueOf(Main.saldo));


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
    }
}
