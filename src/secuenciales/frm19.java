package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido;
    JLabel lblSueldoBruto, lblComision, lblDescuento, lblSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto Total Vendido:");
        lblMontoVendido.setBounds(30, 30, 150, 30);
        getContentPane().add(lblMontoVendido);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(200, 30, 100, 30);
        getContentPane().add(txtMontoVendido);

        JButton btnCalcular = new JButton("Calcular Sueldo");
        btnCalcular.setBounds(30, 70, 220, 30);
        getContentPane().add(btnCalcular);

        lblComision = new JLabel("Comisión: S/. 0.00");
        lblComision.setBounds(30, 110, 300, 30);
        getContentPane().add(lblComision);

        lblSueldoBruto = new JLabel("Sueldo Bruto: S/. 0.00");
        lblSueldoBruto.setBounds(30, 140, 300, 30);
        getContentPane().add(lblSueldoBruto);

        lblDescuento = new JLabel("Descuento: S/. 0.00");
        lblDescuento.setBounds(30, 170, 300, 30);
        getContentPane().add(lblDescuento);

        lblSueldoNeto = new JLabel("Sueldo Neto: S/. 0.00");
        lblSueldoNeto.setBounds(30, 200, 300, 30);
        getContentPane().add(lblSueldoNeto);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());

        double sueldoBasico = 500.0;
        double comision = montoVendido * 0.09;
        double sueldoBruto = sueldoBasico + comision;
        double descuento = sueldoBruto * 0.11;
        double sueldoNeto = sueldoBruto - descuento;

        lblComision.setText(String.format("Comisión: S/. %.2f", comision));
        lblSueldoBruto.setText(String.format("Sueldo Bruto: S/. %.2f", sueldoBruto));
        lblDescuento.setText(String.format("Descuento: S/. %.2f", descuento));
        lblSueldoNeto.setText(String.format("Sueldo Neto: S/. %.2f", sueldoNeto));
    }
}
