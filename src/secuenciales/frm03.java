package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtGigabytes, txtMegabytes, txtKilobytes, txtBytes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTramoKm = new JLabel("Tramo en Kilómetros:");
        lblTramoKm.setBounds(30, 30, 150, 30);
        getContentPane().add(lblTramoKm);

        txtTramoKm = new JTextField();
        txtTramoKm.setBounds(180, 30, 100, 30);
        getContentPane().add(txtTramoKm);

        JLabel lblTramoPies = new JLabel("Tramo en Pies:");
        lblTramoPies.setBounds(30, 70, 150, 30);
        getContentPane().add(lblTramoPies);

        txtTramoPies = new JTextField();
        txtTramoPies.setBounds(180, 70, 100, 30);
        getContentPane().add(txtTramoPies);

        JLabel lblTramoMillas = new JLabel("Tramo en Millas:");
        lblTramoMillas.setBounds(30, 110, 150, 30);
        getContentPane().add(lblTramoMillas);

        txtTramoMillas = new JTextField();
        txtTramoMillas.setBounds(180, 110, 100, 30);
        getContentPane().add(txtTramoMillas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 150, 250, 30);
        getContentPane().add(btnCalcular);

        lblResultadoMetros = new JLabel("Total en Metros: ");
        lblResultadoMetros.setBounds(30, 190, 300, 30);
        getContentPane().add(lblResultadoMetros);

        lblResultadoYardas = new JLabel("Total en Yardas: ");
        lblResultadoYardas.setBounds(30, 220, 300, 30);
        getContentPane().add(lblResultadoYardas);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double tramoKm = Double.parseDouble(txtTramoKm.getText());
        double tramoPies = Double.parseDouble(txtTramoPies.getText());
        double tramoMillas = Double.parseDouble(txtTramoMillas.getText());

        final double PIES_A_METROS = 1 / 3.2808;
        final double MILLAS_A_METROS = 1609;
        final double METROS_A_YARDAS = 1.09361;

        double totalMetros = (tramoKm * 1000) + (tramoPies * PIES_A_METROS) + (tramoMillas * MILLAS_A_METROS);

        double totalYardas = totalMetros * METROS_A_YARDAS;

        lblResultadoMetros.setText("Total en Metros: " + totalMetros);
        lblResultadoYardas.setText("Total en Yardas: " + totalYardas);
    }
}

