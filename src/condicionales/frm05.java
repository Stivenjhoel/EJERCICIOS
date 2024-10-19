package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblMayorNumero;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm05 frame = new frm05();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Ingrese un número de 4 cifras:");
        lblNumero.setBounds(30, 30, 200, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(30, 70, 100, 30);
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Calcular Mayor Número");
        btnCalcular.setBounds(30, 110, 200, 30);
        getContentPane().add(btnCalcular);

        lblMayorNumero = new JLabel("Mayor Número: ");
        lblMayorNumero.setBounds(30, 150, 200, 30);
        getContentPane().add(lblMayorNumero);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        String numeroStr = txtNumero.getText();
        
        if (numeroStr.length() != 4) {
            lblMayorNumero.setText("Ingrese un número de 4 cifras.");
            return;
        }

        int[] cifras = new int[4];
        for (int i = 0; i < 4; i++) {
            cifras[i] = Character.getNumericValue(numeroStr.charAt(i));
        }

        int maxCifra = cifras[0];
        int minCifra = cifras[0];

        for (int cifra : cifras) {
            if (cifra > maxCifra) {
                maxCifra = cifra;
            }
            if (cifra < minCifra) {
                minCifra = cifra;
            }
        }

        int mayorNumero = maxCifra * 10 + minCifra; // Formar el número con la mayor y menor cifra
        lblMayorNumero.setText("Mayor Número: " + mayorNumero);
    }
}
