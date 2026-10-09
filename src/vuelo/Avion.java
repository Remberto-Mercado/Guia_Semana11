package vuelo;

public class Avion implements Volable {
    @Override
    public void despegar() {
        System.out.println("Avion: pista");
    }
}
