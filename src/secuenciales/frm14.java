package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField[] txtNumeros = new JTextField[5];
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        for (int i = 0; i < 5; i++) {
            JLabel lblNumero = new JLabel("Número " + (i + 1) + ":");
            lblNumero.setBounds(30, 30 + (i * 40), 100, 30);
            getContentPane().add(lblNumero);

            txtNumeros[i] = new JTextField();
            txtNumeros[i].setBounds(150, 30 + (i * 40), 100, 30);
            getContentPane().add(txtNumeros[i]);
        }

        JButton btnCalcular = new JButton("Calcular Promedio");
        btnCalcular.setBounds(30, 230, 220, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Promedio de los 3 mayores:");
        lblResultado.setBounds(30, 270, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double[] numeros = new double[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = Double.parseDouble(txtNumeros[i].getText());
        }

        Arrays.sort(numeros); 

        double sumaMayores = numeros[2] + numeros[3] + numeros[4]; 
        double promedio = sumaMayores / 3; 
        lblResultado.setText("Promedio de los 3 mayores: " + promedio);
    }
}
