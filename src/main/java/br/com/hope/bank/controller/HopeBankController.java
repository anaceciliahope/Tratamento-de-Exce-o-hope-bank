package br.com.hope.bank.controller;

import br.com.hope.bank.exception.HorarioFuncionamentoExcepion;
import br.com.hope.bank.exception.SaldoInsuficienteException;
import br.com.hope.bank.model.Conta;
import br.com.hope.bank.service.HopeBankService;

public class HopeBankController {

    private final HopeBankService service;

    public HopeBankController() {
        Conta c = new Conta();
        this.service = new HopeBankService(c);
    }

    public void efetuarSaque(double valor) throws SaldoInsuficienteException, HorarioFuncionamentoExcepion {
        this.service.sacar(valor);
    }

    public void efetuarDeposito(Double valor) {
        this.service.depositar(valor);
    }

}
