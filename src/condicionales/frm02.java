package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad;
    JLabel lblImporte, lblDescuento, lblTotal, lblCaramelos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm02 frame = new frm02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm02() {
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

        lblCaramelos = new JLabel("Caramelos: 0");
        lblCaramelos.setBounds(30, 200, 300, 30);
        getContentPane().add(lblCaramelos);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioUnitario = 20.0;
        double importe = cantidad * precioUnitario;
        double descuento;
        
        
        if (cantidad >= 1 && cantidad <= 5) {
            descuento = importe * 0.05; 
        } else if (cantidad >= 6 && cantidad <= 10) {
            descuento = importe * 0.10; 
        } else if (cantidad > 10) {
            descuento = importe * 0.15; 
        } else {
            descuento = 0;
        }
        
        double total = importe - descuento;
        int caramelos;

        
        if (cantidad >= 1 && cantidad <= 5) {
            caramelos = 1;
        } else if (cantidad >= 6 && cantidad <= 10) {
            caramelos = 2;
        } else {
            caramelos = 3;
        }

        lblImporte.setText(String.format("Importe: S/. %.2f", importe));
        lblDescuento.setText(String.format("Descuento: S/. %.2f", descuento));
        lblTotal.setText(String.format("Total a Pagar: S/. %.2f", total));
        lblCaramelos.setText("Caramelos: " + caramelos);
    }
}
