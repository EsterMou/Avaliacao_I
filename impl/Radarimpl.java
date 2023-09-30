package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Radarimpl {
    int tamanhoList = 10;

    Random random = new Random();
    List<Veiculo> listaDePlacas = new ArrayList<>();

    for(int i = 0; i < tamanhoList; i++){
        String placa;
        String placaAleatoria = gerarPlacaAleatoria(random);
        listaDePlacas.add(placaAleatoria);

        System.out.println("Lista de placas aletótias: ");
        for(Veiculo placa : listaDePlacas){
            System.out.println(placa);
        }
    }

    private static String gerarPlacaAleatoria(Random random){
        StringBuilder placa = new StringBuilder();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";


        for (int i = 0; i < 3; i++){
             char letraAleatoria = letras.charAt(random.nextInt(numeros.length()));
             placa.append(numeroAleatorio);

        }
    }


}


