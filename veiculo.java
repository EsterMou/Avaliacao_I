public class veiculo {
    
    private String modelo;
    private String placa;

    public veiculo(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }
    public String getPlaca(){
        return placa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    /*@Override
    public String toString(){
        return "Veículo: " + veiculo;
    }*/
}
