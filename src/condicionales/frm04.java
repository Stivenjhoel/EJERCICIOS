package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPractica1, txtPractica2, txtPractica3;
    JLabel lblPromedioFinal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPractica1 = new JLabel("Nota Práctica 1:");
        lblPractica1.setBounds(30, 30, 120, 30);
        getContentPane().add(lblPractica1);

        txtPractica1 = new JTextField();
        txtPractica1.setBounds(150, 30, 50, 30);
        getContentPane().add(txtPractica1);

        JLabel lblPractica2 = new JLabel("Nota Práctica 2:");
        lblPractica2.setBounds(30, 70, 120, 30);
        getContentPane().add(lblPractica2);

        txtPractica2 = new JTextField();
        txtPractica2.setBounds(150, 70, 50, 30);
        getContentPane().add(txtPractica2);

        JLabel lblPractica3 = new JLabel("Nota Práctica 3:");
        lblPractica3.setBounds(30, 110, 120, 30);
        getContentPane().add(lblPractica3);

        txtPractica3 = new JTextField();
        txtPractica3.setBounds(150, 110, 50, 30);
        getContentPane().add(txtPractica3);

        JButton btnCalcular = new JButton("Calcular Promedio");
        btnCalcular.setBounds(30, 150, 170, 30);
        getContentPane().add(btnCalcular);

        lblPromedioFinal = new JLabel("Promedio Final: ");
        lblPromedioFinal.setBounds(30, 190, 200, 30);
        getContentPane().add(lblPromedioFinal);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double practica1 = Double.parseDouble(txtPractica1.getText());
        double practica2 = Double.parseDouble(txtPractica2.getText());
        double practica3 = Double.parseDouble(txtPractica3.getText());

        if (practica3 >= 10) {
            practica3 += 2; // Incrementar en 2 puntos la tercera práctica si es >= 10
        }

        double promedioFinal = (practica1 + practica2 + practica3) / 3;
        lblPromedioFinal.setText("Promedio Final: " + String.format("%.2f", promedioFinal));
    }
}
