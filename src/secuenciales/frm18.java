package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtPrecioUnitario;
    JLabel lblImporteCompra, lblDescuento, lblImporteAPagar;

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
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad de Artículos:");
        lblCantidad.setBounds(30, 30, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(200, 30, 100, 30);
        getContentPane().add(txtCantidad);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(30, 70, 150, 30);
        getContentPane().add(lblPrecioUnitario);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(200, 70, 100, 30);
        getContentPane().add(txtPrecioUnitario);

        JButton btnCalcular = new JButton("Calcular Importe");
        btnCalcular.setBounds(30, 110, 220, 30);
        getContentPane().add(btnCalcular);

        lblImporteCompra = new JLabel("Importe de Compra: S/. 0.00");
        lblImporteCompra.setBounds(30, 150, 300, 30);
        getContentPane().add(lblImporteCompra);

        lblDescuento = new JLabel("Descuento: S/. 0.00");
        lblDescuento.setBounds(30, 180, 300, 30);
        getContentPane().add(lblDescuento);

        lblImporteAPagar = new JLabel("Importe a Pagar: S/. 0.00");
        lblImporteAPagar.setBounds(30, 210, 300, 30);
        getContentPane().add(lblImporteAPagar);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());

        double importeCompra = cantidad * precioUnitario;
        double primerDescuento = importeCompra * 0.15;
        double subtotal = importeCompra - primerDescuento;
        double segundoDescuento = subtotal * 0.15;
        double importeAPagar = subtotal - segundoDescuento;

        lblImporteCompra.setText(String.format("Importe de Compra: S/. %.2f", importeCompra));
        lblDescuento.setText(String.format("Descuento: S/. %.2f", primerDescuento + segundoDescuento));
        lblImporteAPagar.setText(String.format("Importe a Pagar: S/. %.2f", importeAPagar));
    }
}
