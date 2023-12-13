package br.com.hope.bank.model;

import br.com.hope.bank.exception.HorarioFuncionamentoExcepion;
import br.com.hope.bank.exception.SaldoInsuficienteException;

public class Conta {
    private double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException, HorarioFuncionamentoExcepion {
        if (valor > 100) {
            throw new HorarioFuncionamentoExcepion();
        }
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            SaldoInsuficienteException s = new SaldoInsuficienteException();
            s.setSaldoAtual(this.saldo);
            throw s;
        }
    }

}
