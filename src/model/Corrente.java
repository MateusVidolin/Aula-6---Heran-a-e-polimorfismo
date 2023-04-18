package model;

public class Corrente extends Conta{
    protected double limite;

    public Corrente(int numConta, String nomeCliente, double limite) {
        super(numConta, nomeCliente);
        this.limite = limite;

    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (saldo + limite)){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "limite: " + limite + "\n";
    }
}
