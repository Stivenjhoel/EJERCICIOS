package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPies, txtPulgadas;
    JLabel lblResultadoMetros;

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
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPies = new JLabel("Pies:");
        lblPies.setBounds(30, 30, 100, 30);
        getContentPane().add(lblPies);

        txtPies = new JTextField();
        txtPies.setBounds(150, 30, 100, 30);
        getContentPane().add(txtPies);

        JLabel lblPulgadas = new JLabel("Pulgadas:");
        lblPulgadas.setBounds(30, 70, 100, 30);
        getContentPane().add(lblPulgadas);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(150, 70, 100, 30);
        getContentPane().add(txtPulgadas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 110, 220, 30);
        getContentPane().add(btnCalcular);

        lblResultadoMetros = new JLabel("Total en Metros: ");
        lblResultadoMetros.setBounds(30, 150, 220, 30);
        getContentPane().add(lblResultadoMetros);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int pies = Integer.parseInt(txtPies.getText());
        int pulgadas = Integer.parseInt(txtPulgadas.getText());

        // Factor de conversión
        final double PULGADAS_A_METROS = 0.0254;
        final double PIES_A_METROS = 0.3048;

        // Cálculo de la estatura en metros
        double estaturaMetros = (pies * PIES_A_METROS) + (pulgadas * PULGADAS_A_METROS);

        lblResultadoMetros.setText("Total en Metros: " + estaturaMetros);
    }
}

