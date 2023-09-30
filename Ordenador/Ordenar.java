package Ordenador;
import java.util.List;

public class Ordenar<radar> {
    protected List<radar> leituras = null;

    public Ordenar(List<radar> leituras) {
        this.leituras = leituras;
    }

    public List<radar> getLeituras() {
        return leituras;
    }

    public void setLeituras(List<radar> leituras) {
        this.leituras = leituras;
    }
    
}
