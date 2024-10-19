package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNumero;
    private JLabel lblResultado;

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
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Ingrese un número (3 cifras):");
        lblNumero.setBounds(30, 30, 200, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(30, 60, 100, 30);
        getContentPane().add(txtNumero);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(30, 100, 100, 30);
        getContentPane().add(btnVerificar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(30, 140, 250, 30);
        getContentPane().add(lblResultado);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnVerificar_actionPerformed();
            }
        });
    }

    protected void btnVerificar_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        
        
        if (numero < 100 || numero > 999) {
            lblResultado.setText("Por favor, ingrese un número de tres cifras.");
            return;
        }

       
        int centena = numero / 100;
        int decena = (numero / 10) % 10;
        int unidad = numero % 10;

        
        if ((centena == decena - 1 && decena == unidad - 1) || (centena == decena + 1 && decena == unidad + 1)) {
            lblResultado.setText("Las cifras son consecutivas.");
        } else {
            lblResultado.setText("Las cifras no son consecutivas.");
        }
    }
}
