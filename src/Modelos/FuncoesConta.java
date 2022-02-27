package Modelos;

public interface FuncoesConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir (double valor, FuncoesConta contaDestino);
    void imprimirExtrato();
}
