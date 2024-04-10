class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido() {
    }

    public int resultadoPartido(String equipoLocal, String equipoVisitante){
        golesLocal = (int) (Math.random() * 4);
        golesVisitante = (int)(Math.random() * 4);
        System.out.println("Partido: " + equipoLocal + " " + golesLocal + " " + equipoVisitante + " " + golesVisitante);
        if(golesLocal > golesVisitante){

            return 1;
        } else if (golesVisitante > golesLocal){
            return 2;
        } else {
            return 3;
        }
    }

    public int goleadoresPartido(){
        int randomJugador =0;
        for (int i = 0; i <golesLocal ; i++) {
            randomJugador = (int) (Math.random() * 5);
            if(randomJugador==0){

        }

    }
     return 0;
}
    public int getGolesEquipoLocal() {
        return golesLocal;
    }

    public int getGolesEquipoVisitante() {
        return golesVisitante;
    }
}