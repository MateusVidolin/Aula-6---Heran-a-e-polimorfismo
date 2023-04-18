package model;

import java.time.LocalDate;
import java.util.Date;

public abstract class Conta {
    protected int numConta;
    protected String nomeCliente;
    protected double saldo;
    protected LocalDate dataAbertura;

    //construtor
    public Conta(int numConta, String nomeCliente){
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.dataAbertura = LocalDate.now();
        GerenciarConta.listaConta.add(this);
    }
    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dados da conta \n" +
                "Num. " + numConta + "\n" +
                "Data de abertura: " + dataAbertura + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Saldo: " + saldo +"\n";
    }
}
