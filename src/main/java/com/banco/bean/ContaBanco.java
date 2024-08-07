package com.banco.bean;

/**
 *
 * @author SYNC
 * @since 07/08/2024
 * @version 1.0
 */
public class ContaBanco implements ContaBancoInterface {

    private int Numero;
    private String Agencia;
    private String NomeCliente;
    private double Saldo;

    public ContaBanco() {
    }

    @Override
    public int getNumero() {
        return Numero;
    }

    @Override
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public String getAgencia() {
        return Agencia;
    }

    @Override
    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    @Override
    public String getNomeCliente() {
        return NomeCliente;
    }

    @Override
    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    @Override
    public double getSaldo() {
        return Saldo;
    }

    @Override
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

}
