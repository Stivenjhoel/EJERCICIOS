package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtEdad1, txtEdad2, txtEdad3;
    JLabel lblEdadMayor, lblEdadMenor;

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
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblEdad1 = new JLabel("Edad 1:");
        lblEdad1.setBounds(30, 30, 80, 30);
        getContentPane().add(lblEdad1);

        txtEdad1 = new JTextField();
        txtEdad1.setBounds(120, 30, 100, 30);
        getContentPane().add(txtEdad1);

        JLabel lblEdad2 = new JLabel("Edad 2:");
        lblEdad2.setBounds(30, 70, 80, 30);
        getContentPane().add(lblEdad2);

        txtEdad2 = new JTextField();
        txtEdad2.setBounds(120, 70, 100, 30);
        getContentPane().add(txtEdad2);

        JLabel lblEdad3 = new JLabel("Edad 3:");
        lblEdad3.setBounds(30, 110, 80, 30);
        getContentPane().add(lblEdad3);

        txtEdad3 = new JTextField();
        txtEdad3.setBounds(120, 110, 100, 30);
        getContentPane().add(txtEdad3);

        JButton btnCalcular = new JButton("Calcular Edad");
        btnCalcular.setBounds(30, 150, 200, 30);
        getContentPane().add(btnCalcular);

        lblEdadMayor = new JLabel("Edad Mayor: ");
        lblEdadMayor.setBounds(30, 190, 200, 30);
        getContentPane().add(lblEdadMayor);

        lblEdadMenor = new JLabel("Edad Menor: ");
        lblEdadMenor.setBounds(30, 210, 200, 30);
        getContentPane().add(lblEdadMenor);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int edad1 = Integer.parseInt(txtEdad1.getText());
        int edad2 = Integer.parseInt(txtEdad2.getText());
        int edad3 = Integer.parseInt(txtEdad3.getText());

        int edadMayor = Math.max(edad1, Math.max(edad2, edad3));
        int edadMenor = Math.min(edad1, Math.min(edad2, edad3));

        lblEdadMayor.setText("Edad Mayor: " + edadMayor);
        lblEdadMenor.setText("Edad Menor: " + edadMenor);
    }
}
