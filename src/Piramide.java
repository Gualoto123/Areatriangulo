public class Piramide extends Triangulo {

    private double altura;

    public Piramide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3);
        double ladoBase = calcularDistancia(punto1, punto2);
        this.altura = calcularDistancia(punto4, calcularBaricentro());
        listaPuntos.add(punto4);
    }

    public double calcularVolumen() {
        return (1.0 / 3.0) * calcularArea() * altura;
    }

    public double calcularAreaSuperficial() {
        double areaBase = calcularArea();
        double lado1 = calcularDistancia(listaPuntos.get(0), listaPuntos.get(1));
        double lado2 = calcularDistancia(listaPuntos.get(1), listaPuntos.get(2));
        double lado3 = calcularDistancia(listaPuntos.get(2), listaPuntos.get(0));
        double areaLateral = (lado1 * altura) + (lado2 * altura) + (lado3 * altura);
        return areaBase + areaLateral;
    }

    private Punto calcularBaricentro() {
        double x = 0, y = 0, z = 0;
        for (Punto punto : listaPuntos) {
            x += punto.getX();
            y += punto.getY();
            z += punto.getZ();
        }
        int n = listaPuntos.size();
        return new Punto(x / n, y / n, z / n);
    }}
