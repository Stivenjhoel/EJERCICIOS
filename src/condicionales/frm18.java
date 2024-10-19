package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtDonacion;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm18 frame = new frm18();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm18() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Monto de la donación:");
        lblDonacion.setBounds(30, 30, 150, 30);
        getContentPane().add(lblDonacion);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(150, 30, 150, 30);
        getContentPane().add(txtDonacion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 80, 180, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("");
        lblResultado.setBounds(30, 120, 300, 100);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double donacion = Double.parseDouble(txtDonacion.getText());
        double centroSalud, comedorNiños, bolsa;

        if (donacion >= 10000) {
            centroSalud = donacion * 0.30; 
            comedorNiños = donacion * 0.50; 
        } else {
            centroSalud = donacion * 0.25; 
            comedorNiños = donacion * 0.60; 
        }

        bolsa = donacion - centroSalud - comedorNiños; 

       
        lblResultado.setText(String.format("Centro de Salud: S/. %.2f\nComedor Infantil: S/. %.2f\nInvertido en Bolsa: S/. %.2f",
                centroSalud, comedorNiños, bolsa));
    }
}
