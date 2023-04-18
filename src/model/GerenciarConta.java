package model;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {
    public static List<Conta> listaConta = new ArrayList<>();

    public static double getTotalSaldos(){
        double total = 0;
        for(Conta conta : listaConta){
            total += conta.saldo;
        }
        return total;
    }
}
