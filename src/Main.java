import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los puntos de la Pirámide");
        Punto[] punto = new Punto[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese la componente X del punto " + i + ":");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto " + i + ":");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente Z del punto " + i + ":");
            double z = sc.nextDouble();
            punto[i] = new Punto(x, y, z);
        }

        Piramide piramide = new Piramide(punto[0], punto[1], punto[2], punto[3]);
        System.out.println("El volumen de la pirámide es: " + piramide.calcularVolumen());
        System.out.println("El área superficial de la pirámide es: " + piramide.calcularAreaSuperficial());
    }}