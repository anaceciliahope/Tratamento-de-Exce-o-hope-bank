package br.com.hope.bank.service;

import br.com.hope.bank.exception.HorarioFuncionamentoExcepion;
import br.com.hope.bank.exception.SaldoInsuficienteException;
import br.com.hope.bank.model.Conta;

public class HopeBankService {

    private Conta conta;

    public HopeBankService(Conta conta) {
        this.conta = conta;
    }

    public void depositar(Double valor) {
        this.conta.depositar(valor);
    }

    public void sacar(double valor) throws SaldoInsuficienteException, HorarioFuncionamentoExcepion {
        this.conta.sacar(valor);
    }

}
