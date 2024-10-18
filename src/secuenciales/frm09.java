package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtSuma;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
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
    public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero :");
        lblNumero.setBounds(50, 50, 60, 30);
        getContentPane().add(lblNumero);

        JLabel lblSuma = new JLabel("Suma :");
        lblSuma.setBounds(50, 90, 60, 30);
        getContentPane().add(lblSuma);

        txtNumero = new JTextField();
        txtNumero.setBounds(120, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtSuma = new JTextField();
        txtSuma.setBounds(120, 90, 60, 30);
        txtSuma.setFocusable(false);
        txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSuma.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSuma);
        
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
		
		int c1 = numero / 1000; numero %= 1000;
		int c2 = numero / 100; numero %= 100;
		int c3 = numero / 10;
		int c4 = numero % 10;
		
		txtSuma.setText("" + (c1 + c2 + c3 +c4) );
		
	}
		
     
        
}
