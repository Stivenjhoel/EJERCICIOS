package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad;
    JLabel lblBilletes;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidadDinero = new JLabel("Cantidad en Soles:");
        lblCantidadDinero.setBounds(30, 30, 150, 30);
        getContentPane().add(lblCantidadDinero);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(200, 30, 100, 30);
        getContentPane().add(txtCantidad);

        JButton btnDescomponer = new JButton("Descomponer");
        btnDescomponer.setBounds(30, 70, 220, 30);
        getContentPane().add(btnDescomponer);

        lblBilletes = new JLabel("Descomposición:");
        lblBilletes.setBounds(30, 110, 300, 150);
        getContentPane().add(lblBilletes);

        btnDescomponer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnDescomponer_actionPerformed();
            }
        });
    }

    protected void btnDescomponer_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int[] billetes = {200, 100, 50, 20, 10};
        int[] monedas = {5, 2, 1};
        StringBuilder resultado = new StringBuilder("<html>");

        for (int billete : billetes) {
            int cantidadBilletes = cantidad / billete;
            if (cantidadBilletes > 0) {
                resultado.append(cantidadBilletes).append(" billetes de S/. ").append(billete).append("<br>");
            }
            cantidad %= billete;
        }

        for (int moneda : monedas) {
            int cantidadMonedas = cantidad / moneda;
            if (cantidadMonedas > 0) {
                resultado.append(cantidadMonedas).append(" monedas de S/. ").append(moneda).append("<br>");
            }
            cantidad %= moneda;
        }

        if (resultado.length() == 6) {
            resultado.append("No hay billetes ni monedas para descomponer.");
        }

        resultado.append("</html>");
        lblBilletes.setText(resultado.toString());
    }
}
