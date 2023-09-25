import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import radar;

public class radarimpl implements radar<velocidade> {
    private static final int VELOCIDADE_MEDIA = 60;
    private static final int OSCILACAO_MAX = 100;

    @Override
    public List<velocidade> gerarLeituras(int totalLeituras){
        List<velocidade> leituras = new ArrayList<>();

        Random randomizador = new Random();
        for(int i = 0; i < totalLeituras; i++){
            int oscilacao = VELOCIDADE_MEDIA * randomizador.nextInt(OSCILACAO_MAX)/100;

            int velocidade = (randomizador.nextBoolean()? VELOCIDADE_MEDIA + oscilacao: VELOCIDADE_MEDIA - oscilacao);

            velocidade leitura = new velocidade(null);
            leituras.add(leitura);
        }
        return leituras;
        

    }

}
