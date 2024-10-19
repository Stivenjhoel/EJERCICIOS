package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtSexo, txtEdad;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm19 frame = new frm19();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSexo = new JLabel("Sexo (F/M):");
        lblSexo.setBounds(30, 30, 100, 30);
        getContentPane().add(lblSexo);

        txtSexo = new JTextField();
        txtSexo.setBounds(130, 30, 50, 30);
        getContentPane().add(txtSexo);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(30, 80, 100, 30);
        getContentPane().add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(130, 80, 50, 30);
        getContentPane().add(txtEdad);

        JButton btnClasificar = new JButton("Clasificar");
        btnClasificar.setBounds(80, 130, 180, 30);
        getContentPane().add(btnClasificar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(30, 170, 300, 50);
        getContentPane().add(lblResultado);

        btnClasificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnClasificar_actionPerformed();
            }
        });
    }

    protected void btnClasificar_actionPerformed() {
        String sexo = txtSexo.getText().toUpperCase();
        int edad = Integer.parseInt(txtEdad.getText());
        String categoria = "";

        if (sexo.equals("F")) {
            if (edad < 23) {
                categoria = "FA"; 
            } else {
                categoria = "FB"; 
            }
        } else if (sexo.equals("M")) {
            if (edad < 25) {
                categoria = "MA"; 
            } else {
                categoria = "MB"; 
            }
        } else {
            categoria = "Sexo no válido"; 
        }

        
        lblResultado.setText("Categoría: " + categoria);
    }
}
