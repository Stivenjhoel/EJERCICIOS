package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2;
    JLabel lblResultado1, lblResultado2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm11 frame = new frm11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1 (3 cifras):");
        lblNumero1.setBounds(30, 30, 150, 30);
        getContentPane().add(lblNumero1);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(180, 30, 100, 30);
        getContentPane().add(txtNumero1);

        JLabel lblNumero2 = new JLabel("Número 2 (3 cifras):");
        lblNumero2.setBounds(30, 70, 150, 30);
        getContentPane().add(lblNumero2);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(180, 70, 100, 30);
        getContentPane().add(txtNumero2);

        JButton btnCalcular = new JButton("Intercambiar Cifras");
        btnCalcular.setBounds(30, 120, 250, 30);
        getContentPane().add(btnCalcular);

        lblResultado1 = new JLabel("Resultado 1:");
        lblResultado1.setBounds(30, 170, 300, 30);
        getContentPane().add(lblResultado1);

        lblResultado2 = new JLabel("Resultado 2:");
        lblResultado2.setBounds(30, 210, 300, 30);
        getContentPane().add(lblResultado2);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());

        
        int primeraCifra1 = numero1 / 100;
        int terceraCifra1 = numero1 % 10;

        int primeraCifra2 = numero2 / 100;
        int terceraCifra2 = numero2 % 10;

        
        int nuevoNumero1 = terceraCifra1 * 100 + (numero2 % 100);
        int nuevoNumero2 = terceraCifra2 * 100 + (numero1 % 100);

      
        lblResultado1.setText("Resultado 1: " + nuevoNumero1);
        lblResultado2.setText("Resultado 2: " + nuevoNumero2);
    }
}
