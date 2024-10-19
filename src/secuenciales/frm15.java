package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtJuan, txtRosa, txtDaniel;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm15 frame = new frm15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblJuan = new JLabel("Aporte de Juan (USD):");
        lblJuan.setBounds(30, 30, 150, 30);
        getContentPane().add(lblJuan);

        txtJuan = new JTextField();
        txtJuan.setBounds(200, 30, 100, 30);
        getContentPane().add(txtJuan);

        JLabel lblRosa = new JLabel("Aporte de Rosa (USD):");
        lblRosa.setBounds(30, 70, 150, 30);
        getContentPane().add(lblRosa);

        txtRosa = new JTextField();
        txtRosa.setBounds(200, 70, 100, 30);
        getContentPane().add(txtRosa);

        JLabel lblDaniel = new JLabel("Aporte de Daniel (S/.):");
        lblDaniel.setBounds(30, 110, 150, 30);
        getContentPane().add(lblDaniel);

        txtDaniel = new JTextField();
        txtDaniel.setBounds(200, 110, 100, 30);
        getContentPane().add(txtDaniel);

        JButton btnCalcular = new JButton("Calcular Capital");
        btnCalcular.setBounds(30, 160, 220, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 210, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double aporteJuan = Double.parseDouble(txtJuan.getText());
        double aporteRosa = Double.parseDouble(txtRosa.getText());
        double aporteDaniel = Double.parseDouble(txtDaniel.getText()) / 3.0; // Convertir soles a dólares

        double capitalTotal = aporteJuan + aporteRosa + aporteDaniel;

        double porcentajeJuan = (aporteJuan / capitalTotal) * 100;
        double porcentajeRosa = (aporteRosa / capitalTotal) * 100;
        double porcentajeDaniel = (aporteDaniel / capitalTotal) * 100;

        lblResultado.setText(String.format("Capital Total (USD): %.2f\nJuan: %.2f%%, Rosa: %.2f%%, Daniel: %.2f%%", 
                                              capitalTotal, 
                                              porcentajeJuan, 
                                              porcentajeRosa, 
                                              porcentajeDaniel));
    }
}
