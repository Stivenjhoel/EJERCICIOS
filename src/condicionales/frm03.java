package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtAngulo;
    JLabel lblClasificacion;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAngulo = new JLabel("Ingrese el ángulo (en grados):");
        lblAngulo.setBounds(30, 30, 200, 30);
        getContentPane().add(lblAngulo);

        txtAngulo = new JTextField();
        txtAngulo.setBounds(30, 70, 100, 30);
        getContentPane().add(txtAngulo);

        JButton btnClasificar = new JButton("Clasificar");
        btnClasificar.setBounds(30, 110, 100, 30);
        getContentPane().add(btnClasificar);

        lblClasificacion = new JLabel("Clasificación: ");
        lblClasificacion.setBounds(30, 150, 200, 30);
        getContentPane().add(lblClasificacion);

        btnClasificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnClasificar_actionPerformed();
            }
        });
    }

    protected void btnClasificar_actionPerformed() {
        double angulo = Double.parseDouble(txtAngulo.getText());
        String clasificacion;

        if (angulo == 0) {
            clasificacion = "Nulo (0°)";
        } else if (angulo > 0 && angulo < 90) {
            clasificacion = "Agudo (0° < x < 90°)";
        } else if (angulo == 90) {
            clasificacion = "Recto (90°)";
        } else if (angulo > 90 && angulo < 180) {
            clasificacion = "Obtuso (90° < x < 180°)";
        } else if (angulo == 180) {
            clasificacion = "Llano (180°)";
        } else if (angulo > 180 && angulo < 360) {
            clasificacion = "Cóncavo (180° < x < 360°)";
        } else if (angulo == 360) {
            clasificacion = "Completo (360°)";
        } else {
            clasificacion = "Ángulo inválido";
        }

        lblClasificacion.setText("Clasificación: " + clasificacion);
    }
}
