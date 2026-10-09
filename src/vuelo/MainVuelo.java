package vuelo;

public class MainVuelo {
    public static void main(String[] args) {
        Volable[] flota = { new Avion(), new Dron() };
        for (Volable v : flota) {
            v.despegar();
            System.out.println(v.estado());
        }
    }
}
