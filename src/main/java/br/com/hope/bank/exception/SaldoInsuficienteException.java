package br.com.hope.bank.exception;

public class SaldoInsuficienteException extends Exception {
    private double saldoAtual;

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
