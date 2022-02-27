import Modelos.Cliente;
import Modelos.Conta;
import Modelos.ContaCorrente;
import Modelos.ContaPoupanca;

public class Main {
    public static void main(String[] args){
        Cliente X = new Cliente();
        X.setNomeCliente("Mega Man X");
        Conta corrente = new ContaCorrente(X);
        Conta poupanca = new ContaPoupanca(X);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
