package br.com.hope.bank;


import br.com.hope.bank.controller.HopeBankController;
import br.com.hope.bank.exception.HorarioFuncionamentoExcepion;
import br.com.hope.bank.exception.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        HopeBankController c = new HopeBankController();

        c.efetuarDeposito(100.0);

        try {
            c.efetuarSaque(150.0);
            System.out.println("saque efetuado com sucesso");
        } catch (SaldoInsuficienteException sie) {
            System.out.println("saldo insuficiente seu saldo atual é " + sie.getSaldoAtual());
        } catch (HorarioFuncionamentoExcepion hfw) {
            System.out.println("Horario de funcionamento nao permitido");
        }


    }
}