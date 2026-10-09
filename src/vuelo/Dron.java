package vuelo;

public class Dron implements Volable {
    @Override
    public void despegar() {
        System.out.println("Dron: vertical");
    }

    @Override
    public String estado() {
        return "suspendido";
    }
}
