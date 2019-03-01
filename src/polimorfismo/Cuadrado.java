package polimorfismo;

public class Cuadrado extends FiguraGeometrica {
    float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    void area() {
        float area;
        area= lado * lado;
        System.out.println( area );
    }
}
