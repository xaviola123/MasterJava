class Jugador {
    private String nombre;
    private int goles;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador setGoles(int goles) {
        this.goles = goles;
        return null;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.goles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void marcarGol() {
        this.goles++;
    }
}