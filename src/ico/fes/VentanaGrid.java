package ico.fes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class VentanaGrid extends Frame {
    public VentanaGrid() {
        super("Ejemplo GridLayout");
        this.setSize(400, 300);
        // 3 filas y 2 columnas
        this.setLayout(new GridLayout(3, 2));

        this.add(new Button("Uno"));
        this.add(new Button("Dos"));
        this.add(new Button("Tres"));
        this.add(new Button("Cuatro"));

        this.setVisible(true);
    }
}
