package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtDia;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    

    /**
     * 
     */
    public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero :");
        lblNumero.setBounds(50, 50, 60, 30);
        getContentPane().add(lblNumero);

        JLabel lblSuma = new JLabel("Dia :");
        lblSuma.setBounds(50, 90, 60, 30);
        getContentPane().add(lblSuma);

        txtNumero = new JTextField();
        txtNumero.setBounds(120, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtDia = new JTextField();
        txtDia.setBounds(120, 90, 60, 30);
        txtDia.setFocusable(false);
        txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDia.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDia);
        
        JButton btncalcular = new JButton("Calcular");
        btncalcular.setBounds(100, 130, 100, 30);
        btncalcular.setMnemonic('a');
        getContentPane().add(btncalcular);
        
        btncalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btncalcular_ActionPerformed();
				
			}
		});
    }

	protected void btncalcular_ActionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText() );
		
		if (numero == 1 )txtDia.setText("Lunes");
		else if (numero == 2) txtDia.setText("Martes");
		else if (numero == 3) txtDia.setText("Miercoles");
		else if (numero == 4) txtDia.setText("Jueves");
		else if (numero == 5) txtDia.setText("Viernes");
		else if (numero == 6) txtDia.setText("Sabado");
		else if (numero == 7) txtDia.setText("Domingo");
		else txtDia.setText("Error");
		
		
	}
		
     
        
}
