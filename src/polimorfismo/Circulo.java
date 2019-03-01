package polimorfismo;

public class Circulo extends FiguraGeometrica {
    float radio;

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    @Override
    void area() {
        float area;
        area= 3.14f*radio*radio;
        System.out.println( area );
    }
}