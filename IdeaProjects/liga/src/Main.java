import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int COLUMNA = 20;
        List<Jugador> jugadores = new ArrayList<>();
//jugadores BARSA
        Jugador messi = new Jugador("messi");
        Jugador iniesta = new Jugador("iniesta");
        Jugador xavi = new Jugador("xavi");
        Jugador luis = new Jugador("luis");
//JUGADORES REAL MADRID
        Jugador modric = new Jugador("modric");
        Jugador carvajal = new Jugador("carvajal");
        Jugador vini = new Jugador("vini");
        Jugador camabinga = new Jugador("camabinga");

        /*agrego objeto jugadores ala lista jugadores*/
        jugadores.add(messi);
        jugadores.add(iniesta);
        jugadores.add(xavi);
        jugadores.add(luis);

        Equipo barsa = new Equipo("barsa", "messi", "iniesta", "xavi", "luis");
        Equipo madrid = new Equipo("madrid", "modric", "carvajal", "vini", "camabinga");
        Equipo sevilla = new Equipo("sevilla", "navas", "pedro", "jose", "perico");
        Equipo atletico = new Equipo("atletico", "navas", "pedro", "jose", "perico");
        Equipo ourense = new Equipo("ourense", "navas", "pedro", "jose", "perico");
        Equipo valencia = new Equipo("valencia", "navas", "pedro", "jose", "perico");

        /*agrego objeto equipo ala lista liga*/
        List<Equipo> liga = new ArrayList<>();
        liga.add(barsa);
        liga.add(madrid);
        liga.add(sevilla);
        liga.add(atletico);
        liga.add(ourense);
        liga.add(valencia);

        List<Jugador> maximosGoleadores = obtenerMaximosGoleadores(liga);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int randomJugador =0;
        int randomGoles=0;



        /*MENU DE la liga*/
        System.out.println("MENU DE LA LIGA");
        System.out.println("1. Ver Plantilla de los equipos");
        System.out.println("2. Jugar todos los partidos de la temporada");
        System.out.println("3. Ver clasificación");
        System.out.println("4. Ver máximos goleadores");
        System.out.println("0. Salir");

        do {
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (Equipo equipo : liga) {
                        equipo.mostrarjugadores();
                    }
                    break;

                case 2:
                    for (int i = 0; i < liga.size(); i++) {
                        for (int j = i + 1; j < liga.size(); j++) {
                            Partido partido = new Partido();
                            int resultado = partido.resultadoPartido(liga.get(i).getNombre(), liga.get(j).getNombre());
                                if (resultado == 1) {
                                    liga.get(i).agregarPuntos(3);
                            } else if (resultado == 2) {
                                liga.get(j).agregarPuntos(3);
                            } else {
                                liga.get(i).agregarPuntos(1);
                                liga.get(j).agregarPuntos(1);
                            }
                        }
                    }
                    System.out.println("Todos los partidos han sido jugados y los puntos han sido actualizados.");
                    // Ordenar la clasificación después de jugar todos los partidos
                    ordenarClasificacion(liga);
                    break;

                case 3:
                    System.out.printf("%-" + COLUMNA + "s | %-" + COLUMNA + "s\n", "Nombre", "Puntuación");
                    System.out.println("-".repeat(COLUMNA * 2 + 3)); // Línea divisoria
                    for (Equipo equipo : liga) {
                        System.out.printf("%-" + COLUMNA + "s | %-" + COLUMNA + "d\n", equipo.getNombre(), equipo.getPuntos());
                    }
                    break;

                case 4:
                    maximosGoleadores = obtenerMaximosGoleadores(liga);
                    System.out.println("Máximos goleadores:");
                    for (Jugador jugador : maximosGoleadores) {
                        System.out.println(jugador.getNombre() + " - Goles: " + jugador.getGoles());
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);
    }

    // Método para obtener los máximos goleadores de la liga
    private static List<Jugador> obtenerMaximosGoleadores(List<Equipo> liga) {
        List<Jugador> goleadores = new ArrayList<>();
        for (Equipo equipo : liga) {
            for (String jugadorNombre : equipo.getJugadores()) {
                Jugador jugador = equipo.getJugador(jugadorNombre);
                goleadores.add(jugador);
            }
        }
        // Ordenar la lista de máximos goleadores por número de goles en orden descendente
        goleadores.sort(Comparator.comparingInt(Jugador::getGoles).reversed());
        return goleadores;
    }

    // Método para ordenar la clasificación de la liga en función de los puntos
    private static void ordenarClasificacion(List<Equipo> liga) {
        liga.sort(Comparator.comparingInt(Equipo::getPuntos).reversed());
    }
}


/*
*
* funcion para goleadores practicando
*     for (int k = 0; k < partido.getGolesEquipoLocal() ; k++) {
                                        randomJugador = (int) (Math.random() * 5);
                                        randomGoles = (int) (Math.random() * partido.goleadoresPartido());

                                        if (randomJugador == 0) {
                                            maximosGoleadores.add(messi.setGoles(randomGoles));


                                        }
                                    }
* */
