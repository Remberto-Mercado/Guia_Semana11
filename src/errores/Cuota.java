package errores;

public class Cuota implements Pagable {
    @Override
    public void pagar() {          // Correccion 1: public
        System.out.println("Pago");
    }

    void subir() {
        // Correccion 2: MONTO_MINIMO es constante (static final), no se reasigna
    }
}
