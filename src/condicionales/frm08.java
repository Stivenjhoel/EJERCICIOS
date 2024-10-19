package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtExamenesAprobados;
    JLabel lblTotalPropina;

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
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblExamenesAprobados = new JLabel("Exámenes Aprobados:");
        lblExamenesAprobados.setBounds(30, 30, 150, 30);
        getContentPane().add(lblExamenesAprobados);

        txtExamenesAprobados = new JTextField();
        txtExamenesAprobados.setBounds(180, 30, 50, 30);
        getContentPane().add(txtExamenesAprobados);

        JButton btnCalcular = new JButton("Calcular Propina");
        btnCalcular.setBounds(30, 70, 200, 30);
        getContentPane().add(btnCalcular);

        lblTotalPropina = new JLabel("Total de Propina: S/. 0.00");
        lblTotalPropina.setBounds(30, 110, 200, 30);
        getContentPane().add(lblTotalPropina);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int examenesAprobados = Integer.parseInt(txtExamenesAprobados.getText());

        // Propina mensual base
        double propinaBase = 20.0;
        // Propina adicional por examen aprobado
        double propinaAdicional = examenesAprobados * 5.0;

        // Total de la propina
        double totalPropina = propinaBase + propinaAdicional;

        lblTotalPropina.setText(String.format("Total de Propina: S/. %.2f", totalPropina));
    }
}
