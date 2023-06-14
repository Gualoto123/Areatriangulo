public class Triangulo extends Figura{

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        listaPuntos.add(punto1);
        listaPuntos.add(punto2);
        listaPuntos.add(punto3);
        lado1 = calcularDistancia(punto1, punto2);
        lado2 = calcularDistancia(punto2, punto3);
        lado3 = calcularDistancia(punto3, punto1);
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

}
