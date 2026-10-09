package vuelo;

public interface Volable {
    void despegar();

    default String estado() {
        return "en tierra";
    }
}
