package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion;
    JLabel lblCentroSalud, lblComedorInfantil, lblEscuelaInfantil, lblAsiloAncianos;

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
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Monto de Donación:");
        lblDonacion.setBounds(30, 30, 150, 30);
        getContentPane().add(lblDonacion);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(200, 30, 100, 30);
        getContentPane().add(txtDonacion);

        JButton btnCalcular = new JButton("Calcular Asignaciones");
        btnCalcular.setBounds(30, 70, 220, 30);
        getContentPane().add(btnCalcular);

        lblCentroSalud = new JLabel("Centro de Salud: S/. 0.00");
        lblCentroSalud.setBounds(30, 110, 300, 30);
        getContentPane().add(lblCentroSalud);

        lblComedorInfantil = new JLabel("Comedor Infantil: S/. 0.00");
        lblComedorInfantil.setBounds(30, 140, 300, 30);
        getContentPane().add(lblComedorInfantil);

        lblEscuelaInfantil = new JLabel("Escuela Infantil: S/. 0.00");
        lblEscuelaInfantil.setBounds(30, 170, 300, 30);
        getContentPane().add(lblEscuelaInfantil);

        lblAsiloAncianos = new JLabel("Asilo de Ancianos: S/. 0.00");
        lblAsiloAncianos.setBounds(30, 200, 300, 30);
        getContentPane().add(lblAsiloAncianos);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double donacion = Double.parseDouble(txtDonacion.getText());

        double centroSalud = donacion * 0.25;
        double comedorInfantil = donacion * 0.35;
        double escuelaInfantil = donacion * 0.25;
        double asiloAncianos = donacion - (centroSalud + comedorInfantil + escuelaInfantil); 

        lblCentroSalud.setText(String.format("Centro de Salud: S/. %.2f", centroSalud));
        lblComedorInfantil.setText(String.format("Comedor Infantil: S/. %.2f", comedorInfantil));
        lblEscuelaInfantil.setText(String.format("Escuela Infantil: S/. %.2f", escuelaInfantil));
        lblAsiloAncianos.setText(String.format("Asilo de Ancianos: S/. %.2f", asiloAncianos));
    }
}
