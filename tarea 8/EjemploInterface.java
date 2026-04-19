// Definición de la Interface
interface Entrenable {
    void realizarCalentamiento();
    void ejecutarTecnica();
}

// Clase que implementa la Interface
class Taekwondo implements Entrenable {
    @Override
    public void realizarCalentamiento() {
        System.out.println("Realizando movilidad articular y estiramiento dinámico.");
    }

    @Override
    public void ejecutarTecnica() {
        System.out.println("Ejecutando patada circular (Tollyo Chagi).");
    }
}

public class Main {
    public static void main(String[] args) {
        Taekwondo miEntrenamiento = new Taekwondo();
        miEntrenamiento.realizarCalentamiento();
        miEntrenamiento.ejecutarTecnica();
    }
}
