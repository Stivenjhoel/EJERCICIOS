package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtDocenas;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm17 frame = new frm17();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDocenas = new JLabel("Cantidad de docenas:");
        lblDocenas.setBounds(30, 30, 150, 30);
        getContentPane().add(lblDocenas);

        txtDocenas = new JTextField();
        txtDocenas.setBounds(150, 30, 150, 30);
        getContentPane().add(txtDocenas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 80, 180, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("");
        lblResultado.setBounds(30, 120, 300, 60);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int docenas = Integer.parseInt(txtDocenas.getText());
        double precioPorDocena = 20.0; 
        double montoCompra = docenas * precioPorDocena;
        double descuento = 0.0;

        
        if (docenas >= 6) {
            descuento = montoCompra * 0.15; // 15% de descuento
        } else {
            descuento = montoCompra * 0.10; // 10% de descuento
        }

        double totalAPagar = montoCompra - descuento; 
        int lapiceros = 0;

       
        if (docenas >= 30) {
            lapiceros = (docenas / 3) * 2; 
        }

        
        lblResultado.setText(String.format("Monto de la compra: S/. %.2f\nDescuento: S/. %.2f\nTotal a pagar: S/. %.2f\nLapiceros de obsequio: %d",
                montoCompra, descuento, totalAPagar, lapiceros));
    }
}
