package model;

public class Poupanca extends Conta{
    protected int diaAniversario;
    protected double rendimento;

    public Poupanca(int numConta, String nomeCliente, int diaAniversario, double rendimento) {
        super(numConta, nomeCliente);
        this.diaAniversario = diaAniversario;
        this.rendimento = rendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dia de Aniversario: " + diaAniversario + "\n" +
                "Rendimento: " + rendimento + "\n";
    }
}
