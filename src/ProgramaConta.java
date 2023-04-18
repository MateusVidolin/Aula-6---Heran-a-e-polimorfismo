import model.Corrente;
import model.GerenciarConta;
import model.Poupanca;

public class ProgramaConta {
    public static void main(String[] args) {
        Corrente conta1 = new Corrente(1, "Vilma", 1000.0);
        Poupanca conta2 = new Poupanca(2, "Chico", 18, 0.67);

        conta1.depositar(300);
        boolean sacou = conta1.sacar(400);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }
        else {
            System.out.println("Sem saldo ou limite");
        }
        System.out.println(conta1);

        conta2.depositar(300);
        sacou = conta2.sacar(400);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }
        else {
            System.out.println("Sem saldo ou limite");
        }
        System.out.println(conta2);
        System.out.println("Saldo de todas as contas: " + GerenciarConta.getTotalSaldos());
    }
}