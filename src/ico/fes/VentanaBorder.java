package ico.fes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class VentanaBorder extends Frame {
    public VentanaBorder() {
        super("Ejemplo BorderLayout");
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());

        this.add(new Button("Norte"), BorderLayout.NORTH);
        this.add(new Button("Sur"), BorderLayout.SOUTH);
        this.add(new Button("Este"), BorderLayout.EAST);
        this.add(new Button("Oeste"), BorderLayout.WEST);
        this.add(new Button("Centro"), BorderLayout.CENTER);

        this.setVisible(true);
    }
}
