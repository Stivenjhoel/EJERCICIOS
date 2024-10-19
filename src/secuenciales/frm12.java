package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtA, txtB, txtC;
    JLabel lblResultado;

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

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblA = new JLabel("Coeficiente a:");
        lblA.setBounds(30, 30, 100, 30);
        getContentPane().add(lblA);

        txtA = new JTextField();
        txtA.setBounds(150, 30, 100, 30);
        getContentPane().add(txtA);

        JLabel lblB = new JLabel("Coeficiente b:");
        lblB.setBounds(30, 70, 100, 30);
        getContentPane().add(lblB);

        txtB = new JTextField();
        txtB.setBounds(150, 70, 100, 30);
        getContentPane().add(txtB);

        JLabel lblC = new JLabel("Coeficiente c:");
        lblC.setBounds(30, 110, 100, 30);
        getContentPane().add(lblC);

        txtC = new JTextField();
        txtC.setBounds(150, 110, 100, 30);
        getContentPane().add(txtC);

        JButton btnCalcular = new JButton("Calcular");
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
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());

        double discriminante = b * b - 4 * a * c;
        String resultado;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            resultado = "Raíces: " + raiz1 + " y " + raiz2;
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            resultado = "Raíz doble: " + raiz;
        } else {
            resultado = "No hay raíces reales";
        }

        lblResultado.setText("Resultado: " + resultado);
    }
}
