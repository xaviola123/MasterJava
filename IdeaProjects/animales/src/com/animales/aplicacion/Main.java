package com.animales.aplicacion;

import com.animales.clases.Animales;
import com.animales.clases.Aranha;
import com.animales.clases.Gato;
import com.animales.clases.Peces;
import com.animales.interfaces.Mascota;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animales> animalesList = new ArrayList<>();
        int i = 0;

        Animales aranha = new Aranha();
        Animales gato = new Gato("GARFIELD");
        Animales pez = new Peces("GLOTON");

        animalesList.add(aranha);
        animalesList.add(gato);
        animalesList.add(pez);
        /**
         * blucle que recorre el arrayList de animales y itera con cada animal
         */
        for (Animales unAnimal : animalesList){
    //compruebo si ese animal pertenece ala clase correspondiente
                if (unAnimal instanceof Aranha ){

                    ((Aranha) unAnimal).comer();
                    ((Aranha) unAnimal).andar(8);
                }else if(unAnimal instanceof Gato && unAnimal instanceof Mascota){

                    ((Gato) unAnimal).comer();
                    ((Gato) unAnimal).andar(4);
                    ((Gato) unAnimal).jugar();
                } else if (unAnimal instanceof Peces && unAnimal instanceof Mascota) {

                    ((Peces) unAnimal).comer();
                    ((Peces) unAnimal).andar(0);
                    ((Peces) unAnimal).jugar();
                }
        }

    }
}