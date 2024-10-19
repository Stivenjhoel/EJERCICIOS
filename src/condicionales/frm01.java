package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad;
    JLabel lblImporte, lblDescuento, lblTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm01 frame = new frm01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad de Unidades:");
        lblCantidad.setBounds(30, 30, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(200, 30, 100, 30);
        getContentPane().add(txtCantidad);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 70, 220, 30);
        getContentPane().add(btnCalcular);

        lblImporte = new JLabel("Importe: S/. 0.00");
        lblImporte.setBounds(30, 110, 300, 30);
        getContentPane().add(lblImporte);

        lblDescuento = new JLabel("Descuento: S/. 0.00");
        lblDescuento.setBounds(30, 140, 300, 30);
        getContentPane().add(lblDescuento);

        lblTotal = new JLabel("Total a Pagar: S/. 0.00");
        lblTotal.setBounds(30, 170, 300, 30);
        getContentPane().add(lblTotal);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioUnitario;
        
        if (cantidad >= 1 && cantidad <= 25) {
            precioUnitario = 27.0;
        } else if (cantidad >= 26 && cantidad <= 50) {
            precioUnitario = 25.0;
        } else {
            precioUnitario = 23.0;
        }

        double importe = cantidad * precioUnitario;
        double descuento;
        
        if (cantidad > 50) {
            descuento = importe * 0.15;
        } else {
            descuento = importe * 0.05;
        }
        
        double total = importe - descuento;

        lblImporte.setText(String.format("Importe: S/. %.2f", importe));
        lblDescuento.setText(String.format("Descuento: S/. %.2f", descuento));
        lblTotal.setText(String.format("Total a Pagar: S/. %.2f", total));
    }
}
