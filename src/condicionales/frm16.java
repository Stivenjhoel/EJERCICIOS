package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtIngresoMensual;
    private JTextField txtCostoCasa;
    private JLabel lblResultado;

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
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIngresoMensual = new JLabel("Ingreso mensual:");
        lblIngresoMensual.setBounds(30, 30, 150, 30);
        getContentPane().add(lblIngresoMensual);

        txtIngresoMensual = new JTextField();
        txtIngresoMensual.setBounds(150, 30, 150, 30);
        getContentPane().add(txtIngresoMensual);

        JLabel lblCostoCasa = new JLabel("Costo de la casa:");
        lblCostoCasa.setBounds(30, 70, 150, 30);
        getContentPane().add(lblCostoCasa);

        txtCostoCasa = new JTextField();
        txtCostoCasa.setBounds(150, 70, 150, 30);
        getContentPane().add(txtCostoCasa);

        JButton btnCalcular = new JButton("Calcular Cuotas");
        btnCalcular.setBounds(80, 120, 180, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("");
        lblResultado.setBounds(30, 160, 300, 60);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double ingresoMensual = Double.parseDouble(txtIngresoMensual.getText());
        double costoCasa = Double.parseDouble(txtCostoCasa.getText());
        double cuotaInicial;
        double cuotaMensual;

        
        if (ingresoMensual < 1250) {
            cuotaInicial = costoCasa * 0.15; 
            cuotaMensual = (costoCasa - cuotaInicial) / 120; 
        } else {
            cuotaInicial = costoCasa * 0.30; 
            cuotaMensual = (costoCasa - cuotaInicial) / 75; 
        }

        
        lblResultado.setText(String.format("Cuota Inicial: S/. %.2f\nCuota Mensual: S/. %.2f",
                cuotaInicial, cuotaMensual));
    }
}
