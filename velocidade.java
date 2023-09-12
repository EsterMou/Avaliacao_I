public class velocidade {

    Integer valor = 0;

    public velocidade(Integer valor){
        this.valor = valor;
    }

    public Integer getValor(){
        return valor;
    }

    public void setValor(Integer valor){
        this.valor = valor;
    }
    @Override
    public String toString(){
        return "Valor: " + valor;
    }
    
}
