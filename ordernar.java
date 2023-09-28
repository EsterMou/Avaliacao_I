import java.util.List;

public class ordernar<radar> {
    protected List<radar> leituras = null;

    public ordernar(List<radar> leituras) {
        this.leituras = leituras;
    }

    public List<radar> getLeituras() {
        return leituras;
    }

    public void setLeituras(List<radar> leituras) {
        this.leituras = leituras;
    }
    
}
