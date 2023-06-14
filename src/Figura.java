
import java.util.ArrayList;
import java.util.List;

public class Figura {

    protected List<Punto> listaPuntos;

    public Figura() {
        listaPuntos = new ArrayList<>();
    }

    public double calcularDistancia(Punto punto1, Punto punto2) {
        double distanciaX = punto2.getX() - punto1.getX();
        double distanciaY = punto2.getY() - punto1.getY();
        double distanciaZ = punto2.getZ() - punto1.getZ();
        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2) + Math.pow(distanciaZ, 2));
    }
}

