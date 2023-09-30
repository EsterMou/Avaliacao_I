package impl;
public class Velocidade {

    Integer valor = 0;

    public Velocidade(Integer valor){
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
