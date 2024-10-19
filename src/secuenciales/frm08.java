package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio, txtAltura;
    JLabel lblResultadoAreaBase, lblResultadoAreaLateral, lblResultadoAreaTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblRadio = new JLabel("Radio (r):");
        lblRadio.setBounds(30, 30, 100, 30);
        getContentPane().add(lblRadio);

        txtRadio = new JTextField();
        txtRadio.setBounds(150, 30, 100, 30);
        getContentPane().add(txtRadio);

        JLabel lblAltura = new JLabel("Altura (h):");
        lblAltura.setBounds(30, 70, 100, 30);
        getContentPane().add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 70, 100, 30);
        getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 110, 220, 30);
        getContentPane().add(btnCalcular);

        lblResultadoAreaBase = new JLabel("Área Base: ");
        lblResultadoAreaBase.setBounds(30, 150, 300, 30);
        getContentPane().add(lblResultadoAreaBase);

        lblResultadoAreaLateral = new JLabel("Área Lateral: ");
        lblResultadoAreaLateral.setBounds(30, 180, 300, 30);
        getContentPane().add(lblResultadoAreaLateral);

        lblResultadoAreaTotal = new JLabel("Área Total: ");
        lblResultadoAreaTotal.setBounds(30, 210, 300, 30);
        getContentPane().add(lblResultadoAreaTotal);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double radio = Double.parseDouble(txtRadio.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        double areaBase = Math.PI * Math.pow(radio, 2);
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * areaBase + areaLateral;

        lblResultadoAreaBase.setText("Área Base: " + areaBase);
        lblResultadoAreaLateral.setText("Área Lateral: " + areaLateral);
        lblResultadoAreaTotal.setText("Área Total: " + areaTotal);
    }
}

