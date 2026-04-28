package ico.fes;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class VentanaFlow extends Frame {
    private Button boton1;
    private TextField texto;

    public VentanaFlow(String titulo, int ancho, int alto) {
        super(titulo);
        this.setSize(ancho, alto);
        this.setLayout(new FlowLayout());

        boton1 = new Button("Botón 1");
        texto = new TextField(10);

        this.add(boton1);
        this.add(texto);
        this.setVisible(true);
    }
}
