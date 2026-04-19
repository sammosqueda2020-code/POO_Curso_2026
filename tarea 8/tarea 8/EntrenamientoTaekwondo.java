// Definición de la Interface (el "contrato")
interface Entrenable {
    void calentar();
    void ejecutarPateo();
}

// Clase que implementa la Interface (el "cómo se hace")
class Taekwondo implements Entrenable {
    @Override
    public void calentar() {
        System.out.println("Realizando movilidad articular y saltos.");
    }

    @Override
    public void ejecutarPateo() {
        System.out.println("Ejecutando un Bandal Chagi con máxima potencia.");
    }
}

public class Main {
    public static void main(String[] args) {
        Taekwondo miSesion = new Taekwondo();
        miSesion.calentar();
        miSesion.ejecutarPateo();
    }
}
