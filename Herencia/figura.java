public class Figura {
    int lados;

    Figura(int lados) {
        this.lados = lados;
    }

    void mostrarLados() {
        System.out.println("La figura tiene " + lados + " lados.");
    }
}