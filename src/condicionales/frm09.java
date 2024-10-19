package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtProducto, txtCantidad;
    JLabel lblImporte, lblDescuento, lblTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm09 frame = new frm09();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblProducto = new JLabel("Código del Producto (1-4):");
        lblProducto.setBounds(30, 30, 200, 30);
        getContentPane().add(lblProducto);

        txtProducto = new JTextField();
        txtProducto.setBounds(230, 30, 50, 30);
        getContentPane().add(txtProducto);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(30, 80, 100, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(230, 80, 50, 30);
        getContentPane().add(txtCantidad);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 130, 250, 30);
        getContentPane().add(btnCalcular);

        lblImporte = new JLabel("Importe: S/. 0.00");
        lblImporte.setBounds(30, 170, 250, 30);
        getContentPane().add(lblImporte);

        lblDescuento = new JLabel("Descuento: S/. 0.00");
        lblDescuento.setBounds(30, 210, 250, 30);
        getContentPane().add(lblDescuento);

        lblTotal = new JLabel("Total a Pagar: S/. 0.00");
        lblTotal.setBounds(30, 250, 250, 30);
        getContentPane().add(lblTotal);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int codigoProducto = Integer.parseInt(txtProducto.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());

        double precioUnitario = 0.0;
        double descuentoPorcentaje = 0.0;

        switch (codigoProducto) {
            case 1:
                precioUnitario = 30.0;
                descuentoPorcentaje = 10.0; // 10% de descuento
                break;
            case 2:
                precioUnitario = 50.0;
                descuentoPorcentaje = 15.0; // 15% de descuento
                break;
            case 3:
                precioUnitario = 20.0;
                descuentoPorcentaje = 5.0; // 5% de descuento
                break;
            case 4:
                precioUnitario = 40.0;
                descuentoPorcentaje = 20.0; // 20% de descuento
                break;
            default:
                lblImporte.setText("Producto no válido");
                lblDescuento.setText("");
                lblTotal.setText("");
                return;
        }

        double importeCompra = precioUnitario * cantidad;
        double descuento = (importeCompra * descuentoPorcentaje) / 100;
        double totalPagar = importeCompra - descuento;

        lblImporte.setText(String.format("Importe: S/. %.2f", importeCompra));
        lblDescuento.setText(String.format("Descuento: S/. %.2f", descuento));
        lblTotal.setText(String.format("Total a Pagar: S/. %.2f", totalPagar));
    }
}
