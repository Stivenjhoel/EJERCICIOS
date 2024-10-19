package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtA, txtB, txtC;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblA = new JLabel("Número a:");
        lblA.setBounds(30, 30, 100, 30);
        getContentPane().add(lblA);

        txtA = new JTextField();
        txtA.setBounds(130, 30, 50, 30);
        getContentPane().add(txtA);

        JLabel lblB = new JLabel("Número b:");
        lblB.setBounds(30, 80, 100, 30);
        getContentPane().add(lblB);

        txtB = new JTextField();
        txtB.setBounds(130, 80, 50, 30);
        getContentPane().add(txtB);

        JLabel lblC = new JLabel("Número c:");
        lblC.setBounds(30, 130, 100, 30);
        getContentPane().add(lblC);

        txtC = new JTextField();
        txtC.setBounds(130, 130, 50, 30);
        getContentPane().add(txtC);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(80, 180, 180, 30);
        getContentPane().add(btnVerificar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(30, 220, 300, 50);
        getContentPane().add(lblResultado);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnVerificar_actionPerformed();
            }
        });
    }

    protected void btnVerificar_actionPerformed() {
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int c = Integer.parseInt(txtC.getText());
        String resultado;

        if (a < b && b < c) {
            resultado = "Números en orden ascendente.";
        } else if (a > b && b > c) {
            resultado = "Números en orden descendente.";
        } else {
            resultado = "Números en desorden.";
        }

        
        lblResultado.setText(resultado);
    }
}
