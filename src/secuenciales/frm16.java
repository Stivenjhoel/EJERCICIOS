package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtTarifaHoraria;
    JLabel lblSueldoBasico, lblSueldoBruto, lblSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm16 frame = new frm16();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(30, 30, 150, 30);
        getContentPane().add(lblHorasTrabajadas);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(200, 30, 100, 30);
        getContentPane().add(txtHorasTrabajadas);

        JLabel lblTarifaHoraria = new JLabel("Tarifa Horaria:");
        lblTarifaHoraria.setBounds(30, 70, 150, 30);
        getContentPane().add(lblTarifaHoraria);

        txtTarifaHoraria = new JTextField();
        txtTarifaHoraria.setBounds(200, 70, 100, 30);
        getContentPane().add(txtTarifaHoraria);

        JButton btnCalcular = new JButton("Calcular Sueldo");
        btnCalcular.setBounds(30, 110, 220, 30);
        getContentPane().add(btnCalcular);

        lblSueldoBasico = new JLabel("Sueldo Básico: S/. 0.00");
        lblSueldoBasico.setBounds(30, 150, 300, 30);
        getContentPane().add(lblSueldoBasico);

        lblSueldoBruto = new JLabel("Sueldo Bruto: S/. 0.00");
        lblSueldoBruto.setBounds(30, 180, 300, 30);
        getContentPane().add(lblSueldoBruto);

        lblSueldoNeto = new JLabel("Sueldo Neto: S/. 0.00");
        lblSueldoNeto.setBounds(30, 210, 300, 30);
        getContentPane().add(lblSueldoNeto);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());

        double sueldoBasico = horasTrabajadas * tarifaHoraria;
        double sueldoBruto = sueldoBasico * 1.20; 
        double sueldoNeto = sueldoBruto * 0.90; 

        lblSueldoBasico.setText(String.format("Sueldo Básico: S/. %.2f", sueldoBasico));
        lblSueldoBruto.setText(String.format("Sueldo Bruto: S/. %.2f", sueldoBruto));
        lblSueldoNeto.setText(String.format("Sueldo Neto: S/. %.2f", sueldoNeto));
    }
}
