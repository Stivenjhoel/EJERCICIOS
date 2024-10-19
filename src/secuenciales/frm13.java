package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCateto1, txtCateto2;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCateto1 = new JLabel("Cateto 1:");
        lblCateto1.setBounds(30, 30, 100, 30);
        getContentPane().add(lblCateto1);

        txtCateto1 = new JTextField();
        txtCateto1.setBounds(150, 30, 100, 30);
        getContentPane().add(txtCateto1);

        JLabel lblCateto2 = new JLabel("Cateto 2:");
        lblCateto2.setBounds(30, 70, 100, 30);
        getContentPane().add(lblCateto2);

        txtCateto2 = new JTextField();
        txtCateto2.setBounds(150, 70, 100, 30);
        getContentPane().add(txtCateto2);

        JButton btnCalcular = new JButton("Calcular Hipotenusa");
        btnCalcular.setBounds(30, 120, 220, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Hipotenusa:");
        lblResultado.setBounds(30, 170, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double cateto1 = Double.parseDouble(txtCateto1.getText());
        double cateto2 = Double.parseDouble(txtCateto2.getText());

        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        lblResultado.setText("Hipotenusa: " + hipotenusa);
    }
}
