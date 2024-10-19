package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase, txtAltura;
    JLabel lblResultadoArea, lblResultadoPerimetro;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(30, 30, 100, 30);
        getContentPane().add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(150, 30, 100, 30);
        getContentPane().add(txtBase);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(30, 70, 100, 30);
        getContentPane().add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 70, 100, 30);
        getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 110, 220, 30);
        getContentPane().add(btnCalcular);

        lblResultadoArea = new JLabel("Área: ");
        lblResultadoArea.setBounds(30, 150, 220, 30);
        getContentPane().add(lblResultadoArea);

        lblResultadoPerimetro = new JLabel("Perímetro: ");
        lblResultadoPerimetro.setBounds(30, 180, 220, 30);
        getContentPane().add(lblResultadoPerimetro);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double base = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        // Cálculo del área y perímetro
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        // Mostrar los resultados
        lblResultadoArea.setText("Área: " + area);
        lblResultadoPerimetro.setText("Perímetro: " + perimetro);
    }
}

