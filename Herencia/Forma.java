public abstract class Forma {
    abstract void dibujar();
}

class Circulo extends Forma {
    void dibujar() {
        System.out.println("Dibujando un círculo.");
    }
}