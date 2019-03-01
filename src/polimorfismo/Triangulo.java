package polimorfismo;

public class Triangulo extends FiguraGeometrica {
    float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Triangulo() {
    }
    @Override
    void area() {
        float area;
        area= base*altura;
        System.out.println( area );
    }
}