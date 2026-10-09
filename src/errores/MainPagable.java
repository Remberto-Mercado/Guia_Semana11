package errores;

public class MainPagable {
    public static void main(String[] args) {
        Pagable p = new Cuota();   // Correccion 3: se instancia la clase, no la interfaz
        p.pagar();
    }
}
