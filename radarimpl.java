import java.util.Random;
import java.util.RandomAccess;
import java.util.List;

import radar;

public class radarimpl implements radar<velocidade> {
    private static final int VELOCIDADE_MEDIA = 60;
    private static final int OSCILACAO_MAX = 100;

    @Override
    public List<velocidade> gerarLeituras(int totalLeituras){
        List<velocidade> leituras = new ArrayList<>();

        Random randomizador = new Random();
        

    }

}
