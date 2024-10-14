package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtAltura, txtRadio, txtArea, txtVolumen;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblAltura= new JLabel("Altura:");
        lblAltura.setBounds(50, 50, 80, 30);
        getContentPane().add(lblAltura);
		
        JLabel lblRadio= new JLabel("Radio:");
        lblRadio.setBounds(50, 90, 80, 30);
        getContentPane().add(lblRadio);

        JLabel lblArea= new JLabel("Area:");
        lblArea.setBounds(50, 130, 80, 30);
        getContentPane().add(lblArea);

        JLabel lblVolumen= new JLabel("Volumen:");
        lblVolumen.setBounds(50, 170, 80, 30);
        getContentPane().add(lblVolumen);

        txtAltura = new JTextField();
        txtAltura.setBounds(130, 50, 120, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtRadio = new JTextField();
        txtRadio.setBounds(130, 90, 120, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtArea = new JTextField();
        txtArea.setBounds(130, 130, 120, 30);
        txtArea.setFocusable(false);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtArea);

        txtVolumen = new JTextField();
        txtVolumen.setBounds(130, 170, 120, 30);
        txtVolumen.setFocusable(false);
        txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVolumen.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVolumen);

        JButton btncalcular = new JButton("calcular");
        btncalcular.setBounds(100, 280, 100, 30);
        btncalcular.setMnemonic('a');
        getContentPane().add(btncalcular);

        btncalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               btnCalcular_actionPerformed();
            }
        });

	}

    protected void btnCalcular_actionPerformed() {
        int Altura = Integer.parseInt( txtAltura.getText() );
        int Radio = Integer.parseInt( txtRadio.getText() );

        double Area = 2 * Math.PI * Radio * (Radio + Altura);
        double Volumen = Math.PI * Math.pow(Radio, 2) * Altura;
        
        DecimalFormat df = new DecimalFormat("###.00");
        txtRadio.setText(df.format(Area) );
        txtVolumen.setText(df.format(Volumen) );
    }

}