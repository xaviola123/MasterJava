import java.util.Arrays;
import java.util.List;

class Equipo {
    private String nombre;
    private List<String> jugadores;
    private int puntos;

    public Equipo(String nombre, String... jugadores) {
        this.nombre = nombre;
        this.jugadores = Arrays.asList(jugadores);
    }



    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public Jugador getJugador(String nombre) {
        for (String jugadorNombre : jugadores) {
            if (jugadorNombre.equals(nombre)) {
                return new Jugador(jugadorNombre);
            }
        }
        return null;
    }

    public void mostrarjugadores() {
        System.out.println("Jugadores del equipo " + nombre + ": " + jugadores);
    }

    public void agregarPuntos(int puntosGanados) {
        this.puntos += puntosGanados;
    }

}