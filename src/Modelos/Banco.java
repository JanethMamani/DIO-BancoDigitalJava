package Modelos;

import java.util.List;

public class Banco {
    private String nomeBanco;
    private List<Conta> contas;

    public String getNome(){
        return nomeBanco;
    }
    public void setNomeBanco(String novoNomeBanco){
        nomeBanco = novoNomeBanco;
    }
    public List<Conta> getContas(){
        return contas;
    }
    public void setContas(List<Conta> atualizaContas){
        contas = atualizaContas;
    }
}
