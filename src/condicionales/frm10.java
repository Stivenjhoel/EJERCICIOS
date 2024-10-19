package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField[] txtNotas = new JTextField[5];
    private JLabel lblNotasEliminadas, lblPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        for (int i = 0; i < 5; i++) {
            JLabel lblNota = new JLabel("Nota " + (i + 1) + ":");
            lblNota.setBounds(30, 30 + (i * 30), 100, 30);
            getContentPane().add(lblNota);

            txtNotas[i] = new JTextField();
            txtNotas[i].setBounds(150, 30 + (i * 30), 50, 30);
            getContentPane().add(txtNotas[i]);
        }

        JButton btnCalcular = new JButton("Calcular Promedio");
        btnCalcular.setBounds(30, 180, 250, 30);
        getContentPane().add(btnCalcular);

        lblNotasEliminadas = new JLabel("");
        lblNotasEliminadas.setBounds(30, 220, 300, 30);
        getContentPane().add(lblNotasEliminadas);

        lblPromedio = new JLabel("");
        lblPromedio.setBounds(30, 250, 300, 30);
        getContentPane().add(lblPromedio);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double[] notas = new double[5];
        double suma = 0;
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            notas[i] = Double.parseDouble(txtNotas[i].getText());
            suma += notas[i];
            if (notas[i] > mayor) mayor = notas[i];
            if (notas[i] < menor) menor = notas[i];
        }

        lblNotasEliminadas.setText("Notas eliminadas: Mayor = " + mayor + ", Menor = " + menor);

        suma -= (mayor + menor); // Eliminar mayor y menor de la suma
        double promedio = suma / 3; // Promedio de las tres notas restantes

        lblPromedio.setText(String.format("Promedio aprobatorio: %.2f", promedio));
    }
}
