package polimorfismo;

public class Principal {

    public static void main(String[] args) {
        Cuadrado c1=new Cuadrado(3);
        Cuadrado c2=new Cuadrado(6);
        Triangulo t1=new Triangulo(5,6);
        Circulo ci1=new Circulo(2);
        Circulo ci2=new Circulo(6);

        FiguraGeometrica[]x={c1, c2,t1,ci1,ci2};
        for (FiguraGeometrica  z:x) {
            System.out.println("El resultado es: ");
            z.area();
        }
    }

}