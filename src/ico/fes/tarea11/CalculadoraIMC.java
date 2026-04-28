package ico.fes.tarea11;

import java.awt.*;
import java.awt.event.*;

public class CalculadoraIMC extends Frame {
    private Label lblPeso, lblAltura, lblResultado;
    private TextField txtPeso, txtAltura;
    private Button btnCalcular;

    public CalculadoraIMC() {
        super("Calculadora de IMC");
        this.setSize(300, 250);
        this.setLayout(new GridLayout(4, 2, 10, 10));

        lblPeso = new Label("Peso (kg):");
        txtPeso = new TextField();
        lblAltura = new Label("Estatura (m):");
        txtAltura = new TextField();
        btnCalcular = new Button("Calcular IMC");
        lblResultado = new Label("Resultado: ");

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float peso = Float.parseFloat(txtPeso.getText());
                    float altura = Float.parseFloat(txtAltura.getText());
                    float imc = peso / (altura * altura);
                    lblResultado.setText(String.format("Resultado: %.2f", imc));
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Error: Datos inválidos");
                }
            }
        });

        this.add(lblPeso);
        this.add(txtPeso);
        this.add(lblAltura);
        this.add(txtAltura);
        this.add(new Label("")); 
        this.add(btnCalcular);
        this.add(lblResultado);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraIMC();
    }
}
